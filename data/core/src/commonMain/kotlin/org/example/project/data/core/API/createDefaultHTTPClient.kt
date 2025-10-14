package org.example.project.data.core.API

import io.ktor.client.*
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.defaultRequest
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

fun createDefaultHTTPClient(): HttpClient{
    return HttpClient{
        install(ContentNegotiation){
            json(
                Json{
                    prettyPrint = true
                    isLenient = true
                }
            )
        }
        defaultRequest {
            url("https://swapi.dev/api/")
        }
    }
}