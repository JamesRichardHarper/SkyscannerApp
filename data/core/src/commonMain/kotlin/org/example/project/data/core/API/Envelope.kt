package org.example.project.data.core.API

data class Envelope<T>(
    val path: String,
    val responseType: T,
    val queryParams: Map<String, String>? = null,
    val headers: Map<String, String>? = null
)