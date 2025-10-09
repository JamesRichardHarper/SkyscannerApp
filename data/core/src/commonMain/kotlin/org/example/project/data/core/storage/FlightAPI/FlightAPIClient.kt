package org.example.project.data.core.storage.FlightAPI

import io.ktor.client.*
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class FlightAPIClient(
    engine: HttpClientEngine
){
    private val httpClient = HttpClient(engine){
        install(ContentNegotiation){
            json(
                Json{
                    prettyPrint = true
                    isLenient = true
                }
            )
        }
    }
}