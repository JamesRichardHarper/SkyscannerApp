package org.example.project.data.settings

import kotlinx.coroutines.flow.Flow
import org.example.project.data.core.storage.Storage

interface UsernameRepository {
    val username: Flow<String>
    suspend fun updateUsername(username: String)
    data object UsernameKey : Storage.Key.StringKey("Username", "Unassigned")
}