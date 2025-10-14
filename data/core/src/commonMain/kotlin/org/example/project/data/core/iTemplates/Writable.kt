package org.example.project.data.core.iTemplates

interface Writable{
    suspend fun<K: BaseKey<T>,T>writeValue(key: K, value: T?): Unit
    suspend fun<K: BaseKey<T>,T>clearValue(key: K){
        writeValue(key, null)
    }
}