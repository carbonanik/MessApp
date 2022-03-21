package com.massage.massenger.data.local.room

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import com.google.common.truth.Truth.assertThat
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
class UserDaoTest {


    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    lateinit var database: MessengerDatabase
    lateinit var userDao: UserDao

    val user0 = User(id = UUID.randomUUID().toString(), name = "User1", phone = "94587")
    val user1 = User(id = UUID.randomUUID().toString(), name = "User2", phone = "01456")
    val user2 = User(id = UUID.randomUUID().toString(), name = "User3", phone = "73005")
    val user3 = User(id = UUID.randomUUID().toString(), name = "User4", phone = "53423")
    val user4 = User(id = UUID.randomUUID().toString(), name = "User5", phone = "87623")

    @Before
    fun setup() {
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            MessengerDatabase::class.java
        ).allowMainThreadQueries().build()
        userDao = database.userDao()
    }

    @After
    fun teardown() {
        database.close()
    }

    @Test
    fun insertUser() = runBlockingTest {

        val user = User(id = UUID.randomUUID().toString(), name = "User1", phone = "94587")
        val user2 = User(id = UUID.randomUUID().toString(), name = "User2", phone = "45i37")

        userDao.insertUser(user)
        userDao.insertUser(user2)

        val userList = userDao.getAllUser().first()?.map { it.id }
        assertThat(userList).contains(user.id)
    }

    @Test
    fun getUser() = runBlockingTest {
        userDao.insertUser(user0)
        userDao.insertUser(user1)
        userDao.insertUser(user2)
        userDao.insertUser(user3)

        userDao.deleteUser(User(user0.id, "", ""))
        userDao.deleteUser(user1)
        userDao.deleteUser(user2)
        userDao.deleteUser(user3)

        val list = userDao.getAllUser().first()

        assertThat(list).isEmpty()
    }

    @Test
    fun funTest(){
        val t = System.currentTimeMillis()
        println(t)
    }

}
