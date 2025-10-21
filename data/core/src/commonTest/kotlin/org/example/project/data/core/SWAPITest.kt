package org.example.project.data.core

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.bodyAsText
import kotlinx.coroutines.runBlocking
import org.example.project.data.core.API.SWAPI.DPeople
import org.example.project.data.core.API.SWAPI.StarWarsRepoImplementation
import org.example.project.data.core.API.createDefaultHTTPClient
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class SWAPITest {
    companion object{
        val testData = listOf(
            "Luke",
            "Leia"
        )
        val StarWarsURL: String = "https://swapi.dev/api/"
        val baseClient = HttpClient()
        val ownClient = createDefaultHTTPClient(StarWarsURL, "SW-Test")

    }
    @Test
    fun getBasicLuke(){
        assertEquals("Luke", testData[0])
    }
    @Test
    fun getBaseAPIResponse(){
        runBlocking {
            val successAssert = 200..299
            val response: HttpResponse = baseClient.get(StarWarsURL)
            assertContains(successAssert, response.status.value)
        }
    }
    @Test
    fun getCustomAPIResponse(){
        runBlocking {
            val successAssert = 200..299
            val response: HttpResponse = ownClient.get("")
            assertContains(successAssert, response.status.value)
        }
    }
    @Test
    fun getPersonLukeFromCustomAPIAsRaw(){
        runBlocking {
            val successAssert = "Luke Skywalker"
            val response: DPeople = ownClient.get("people/1/").body()
            assertEquals(successAssert, response.name)
        }
    }
}