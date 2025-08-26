package org.example.project.data.settings.usernameRepository

import kotlinx.coroutines.flow.Flow
import org.example.project.data.core.storage.interfaces.BaseKey

interface UsernameRepository {
    val username: Flow<String>
    suspend fun updateUsername(username: String)
    data object UsernameKey : BaseKey.Key.StringKey("Username", "Unassigned")
}