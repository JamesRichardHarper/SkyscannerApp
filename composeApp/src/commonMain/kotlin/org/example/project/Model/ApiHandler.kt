package org.example.project.Model

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.http.GET
import org.example.project.Utils.Constants

interface ExampleApi {
    @GET("people/1/")
    suspend fun getPerson(): String
}

class ApiHandler {
    val ktorfit = Ktorfit
        .Builder()
        .baseUrl(Constants.API_WEBSITE.toString())
        .build()
    //NOTE: the below crete method is used due to a bug with Ktorfit
    fun createExample(): ExampleApi{
        return ktorfit.create<ExampleApi>()
    }
//    val response = exampleApi.getPerson()
}

