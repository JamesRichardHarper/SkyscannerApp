package org.example.project.domain.settings

import kotlinx.coroutines.flow.Flow
import org.example.project.data.settings.usernameRepository.UsernameRepository

class GetUsernameAsFlowUseCase(
    private val usernameRepository: UsernameRepository,
) {
    operator fun invoke(): Flow<String> {
        return usernameRepository.username
    }
}