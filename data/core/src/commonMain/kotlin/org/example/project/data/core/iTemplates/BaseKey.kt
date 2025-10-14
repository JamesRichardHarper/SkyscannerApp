package org.example.project.data.core.iTemplates

sealed class BaseKey<T>(
    val name: String,
    val defaultValue: T?
)