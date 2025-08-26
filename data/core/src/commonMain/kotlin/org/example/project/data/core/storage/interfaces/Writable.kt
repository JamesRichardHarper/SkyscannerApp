package org.example.project.data.core.storage.interfaces

interface Writable: BaseKey{
    suspend fun<T>writeValue(key: BaseKey.Key<T>, value: T?): Unit
    suspend fun<T>clearValue(key: BaseKey.Key<T>){
        writeValue(key, null)
    }
}