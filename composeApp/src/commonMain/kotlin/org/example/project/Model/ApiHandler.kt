package org.example.project.Model

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.http.GET

interface ExampleApi {
    @GET("people/1/")
    suspend fun getPerson(): String
}

class ApiHandler {
    val ktorfit = Ktorfit
        .Builder()
        .baseUrl("https://swapi.dev/api/")
        .build()
    fun createExample(): ExampleApi{
        return ktorfit.create<ExampleApi>()
    }
//    val response = exampleApi.getPerson()
}

