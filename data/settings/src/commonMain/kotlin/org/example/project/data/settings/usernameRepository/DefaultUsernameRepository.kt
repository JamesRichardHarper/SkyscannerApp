package org.example.project.data.settings.usernameRepository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.example.project.data.core.storage.Storage

class DefaultUsernameRepository(
    private val storage: Storage,
): UsernameRepository {
    override val username: Flow<String>
        get() = storage
            .getAsFlow(
                UsernameRepository.UsernameKey
            ).map{
                it.orEmpty()
            }

    override suspend fun updateUsername(username: String) {
        storage.writeValue(UsernameRepository.UsernameKey, username)
    }
}