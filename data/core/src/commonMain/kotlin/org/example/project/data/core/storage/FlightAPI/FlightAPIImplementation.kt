package org.example.project.data.core.storage.FlightAPI

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import kotlinx.coroutines.flow.Flow
import org.example.project.data.core.storage.templates.BaseKey

class FlightAPIImplementation(
    private val client: HttpClient
): FlightAPI{
    override fun <T> getAsFlow(key: BaseKey.Key<T>): Flow<T?> {
//        return client.get(getDa)
        TODO("Testing program still works and pushing, then finishing")
    }

    override suspend fun <T> get(key: BaseKey.Key<T>): T? {
        TODO("Not yet implemented")
    }

}