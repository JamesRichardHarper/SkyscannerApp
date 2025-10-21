package org.example.project.data.core.API

import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.plugins.defaultRequest
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

fun createDefaultHTTPClient(
    URL: String,
    loggerTag: String = "MissingTag"
): HttpClient{
    setDefaultLogger()
    return HttpClient{
        install(ContentNegotiation){
            json(
                Json{
                    prettyPrint = true
                    isLenient = true
                }
            )
        }
        install(Logging){
            logger = object: Logger{
                override fun log(message: String) {
                    co.touchlab.kermit.Logger.v(
                        loggerTag
                    ){
                        message
                    }
                }

            }
        }

        defaultRequest {
            url(URL)
        }
    }
}