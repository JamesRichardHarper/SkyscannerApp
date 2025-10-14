package org.example.project.data.core.iTemplates

import kotlinx.coroutines.flow.Flow

interface Readable{
    fun<K: BaseKey<T>,T>getAsFlow(key: K): Flow<T?>
    suspend fun<K: BaseKey<T>,T>get(key: K): T?
}