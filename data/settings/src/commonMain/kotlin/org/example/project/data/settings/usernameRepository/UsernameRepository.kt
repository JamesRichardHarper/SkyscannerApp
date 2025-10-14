package org.example.project.data.settings.usernameRepository

import kotlinx.coroutines.flow.Flow
import org.example.project.data.core.iTemplates.BaseKey
import org.example.project.data.core.iTemplates.StorageKey

interface UsernameRepository {
    val username: Flow<String>
    suspend fun updateUsername(username: String)
    data object UsernameKey : StorageKey.Key.StringKey("Username", "Unassigned")
}