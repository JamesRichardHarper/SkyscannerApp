package org.example.project.Model

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.http.GET
import de.jensklingenberg.ktorfit.http.Path
import org.example.project.Model.People.DPeople
import org.example.project.Utils.Constants

interface ApiMethods {
    @GET("people/1/")
    suspend fun getBasePerson(): String

    @GET("people/{number}/")
    suspend fun getSpecificPerson(@Path("number") personID: Int): DPeople
}

class ApiHandler {
    val ktorfit = Ktorfit
        .Builder()
        .baseUrl(Constants.API_WEBSITE.value)
        .build()
    //NOTE: the below crete method is used due to a bug with Ktorfit
    fun createApiService(): ApiMethods{
//        return ktorfit.create<ApiMethods>()
        return ktorfit.createApiMethods()
    }
}

