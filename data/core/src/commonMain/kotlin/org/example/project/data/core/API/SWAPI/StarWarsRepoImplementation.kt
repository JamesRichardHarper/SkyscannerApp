package org.example.project.data.core.API.SWAPI

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.flow
import org.example.project.data.core.iTemplates.BaseKey

class StarWarsRepoImplementation(
    private val client: HttpClient
):IStarWarsRepo {
    override fun <K : BaseKey<T>, T> getAsFlow(key: K): Flow<T?> {
//        return client.get(key.name).map{
//            ?: key.defaultValue
//        }
//        flow{
//            return@flow client.get(key.name)
//        }
        return flow{
            client.get(key.name)
        }
    }

    override suspend fun <K : BaseKey<T>, T> get(key: K): T? {
        return getAsFlow(key).firstOrNull() ?: key.defaultValue
    }

    private fun<T>getAPIKey(key: BaseKey<T>){
        TODO("Need to write this function to correctly interpret the key" +
                " and respond with the URL request. For now, this can be ignored" +
                " so requests can be made at all")
    }
}