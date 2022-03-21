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
import java.net.URLDecoder
import java.net.URLEncoder
import java.nio.charset.StandardCharsets


@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
@SmallTest
class NetworkRequestTest {
    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()


    @Before
    fun setup(){

    }

    @After
    fun teardown(){

    }

    @Test
    fun loadPhotos() = runBlockingTest{

    }

    fun decodeUrlTest(){
//        val url = "https://firebasestorage.googleapis.com/v0/b/mess-app-10b91.appspot.com/o/photos%2F50490c4e-be23-4bfd-8df9-184a635d577a.jpg?alt=media&token=fd525c8a-cfff-4b35-ae4a-24e4f345d3fd"
//        val urlEncoded = URLEncoder.encode(url, StandardCharsets.UTF_8.toString())
//        val urlDecoded = URLDecoder.decode(urlEncoded,  StandardCharsets.UTF_8.toString())
//        println(urlDecoded)
    }
}