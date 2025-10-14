package org.example.project.data.core.API.SWAPI

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import kotlinx.coroutines.flow.Flow
import org.example.project.data.core.iTemplates.BaseKey

class StarWarsRepoImplementation(
    private val client: HttpClient
):IStarWarsRepo {
    override fun <K : BaseKey<T>, T> getAsFlow(key: K): Flow<T?> {
        TODO("Not yet implemented")
    }

    override suspend fun <K : BaseKey<T>, T> get(key: K): T? {
        TODO("Not yet implemented")
    }

}