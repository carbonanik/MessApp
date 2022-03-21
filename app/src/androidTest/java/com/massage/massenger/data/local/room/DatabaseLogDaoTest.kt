package com.massage.massenger.data.local.room

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.google.common.truth.Truth.assertThat
import com.massage.massenger.data.local.room.dao.DatabaseLogDao
import com.massage.massenger.data.local.room.dao.UserDao
import com.massage.massenger.model.User
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runBlockingTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.*

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
@SmallTest
class DatabaseLogDaoTest {


    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    lateinit var database: MessengerDatabase
    lateinit var databaseLogDao: DatabaseLogDao
    lateinit var userDao: UserDao

    @Before
    fun setup() {
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            MessengerDatabase::class.java
        ).allowMainThreadQueries().addCallback(DB_CALLBACK).build()
        databaseLogDao = database.databaseLogDao()
        userDao = database.userDao()
    }

    val DB_CALLBACK = object : RoomDatabase.Callback() {
        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            db.execSQL("DROP TRIGGER IF EXISTS user_last_insert")
            db.execSQL("DROP TRIGGER IF EXISTS user_last_update")
            db.execSQL("DROP TRIGGER IF EXISTS user_last_delete")

            db.execSQL("CREATE TRIGGER IF NOT EXISTS user_last_insert AFTER INSERT ON ${MessengerDatabase.USER_TABLE} BEGIN INSERT INTO ${MessengerDatabase.DATABASE_LOG_TABLE} (timestamp, table_name, operation) VALUES (${System.currentTimeMillis()}, '${MessengerDatabase.USER_TABLE}', 'insert'); END") // new.name
            db.execSQL("CREATE TRIGGER IF NOT EXISTS user_last_update AFTER UPDATE ON ${MessengerDatabase.USER_TABLE} BEGIN INSERT INTO ${MessengerDatabase.DATABASE_LOG_TABLE} (timestamp, table_name, operation) VALUES (${System.currentTimeMillis()}, '${MessengerDatabase.USER_TABLE}', 'update'); END")
            db.execSQL("CREATE TRIGGER IF NOT EXISTS user_last_delete AFTER DELETE ON ${MessengerDatabase.USER_TABLE} BEGIN INSERT INTO ${MessengerDatabase.DATABASE_LOG_TABLE} (timestamp, table_name, operation) VALUES (${System.currentTimeMillis()}, '${MessengerDatabase.USER_TABLE}', 'delete'); END")
        }
    }

    @After
    fun teardown() {
        database.close()
    }

    @Test
    fun insertUserAndLog() = runBlockingTest {
        val user = User(id = UUID.randomUUID().toString(), "Demo User", "01111")
        val user2 = User(id = UUID.randomUUID().toString(), "Anik", "01111")

        userDao.insertUser(user)
        userDao.insertUser(user2)
        userDao.insertUser(user2)
        userDao.updateUser(user)
        userDao.deleteUser(user2)

        val logList = databaseLogDao.getAllLog().first()
        val last = logList.maxByOrNull {
            it.timestamp
        }

        val lastLog = databaseLogDao.getLastItem()
        assertThat(last).isEqualTo(lastLog)
    }
}