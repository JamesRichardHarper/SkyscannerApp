package org.example.project.domain.settings

import org.example.project.data.settings.usernameRepository.UsernameRepository

class UpdateUsernameUseCase(
    private val usernameRepository: UsernameRepository,
){
    suspend operator fun invoke(username: String){
        usernameRepository.updateUsername(username)
    }
}