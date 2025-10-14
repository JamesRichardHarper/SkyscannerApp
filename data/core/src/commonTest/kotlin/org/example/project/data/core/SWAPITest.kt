package org.example.project.data.core

import kotlin.test.Test
import kotlin.test.assertEquals

class SWAPITest {
    companion object{
        val testData = listOf(
            "Luke",
            "Leia"
        )
    }
    @Test
    fun getBasicLuke(){
        assertEquals("Luke", testData[0])
    }
    @Test
    fun getAPILuke(){

    }
}