package org.example.project.data.core.storage.interfaces

import kotlinx.coroutines.flow.Flow

interface Readable: BaseKey{
    fun<T>getAsFlow(key: BaseKey.Key<T>): Flow<T?>
    suspend fun<T>get(key: BaseKey.Key<T>): T?
}