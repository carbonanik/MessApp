package com.massage.massenger.data.local.room

import android.content.Context
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import androidx.test.platform.app.InstrumentationRegistry
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
@SmallTest
class loadPhotosFromExternalStorageTest {
    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    lateinit var instrumentationContext: Context


    @Before
    fun setup(){
        instrumentationContext = InstrumentationRegistry.getInstrumentation().context
    }

    @After
    fun teardown(){

    }

    @Test
    fun loadPhotos() = runBlockingTest{
//        val photos = instrumentationContext.contentResolver.loadPhotosFromExternalStorage()
//        assertThat(photos).isNotEmpty()
    }
}