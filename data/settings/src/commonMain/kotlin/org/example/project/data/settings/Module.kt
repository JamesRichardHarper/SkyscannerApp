package org.example.project.data.settings

import org.example.project.data.core.coreDataModule
import org.example.project.data.settings.usernameRepository.DefaultUsernameRepository
import org.example.project.data.settings.usernameRepository.UsernameRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val settingsDataModule = module {
    includes(
        coreDataModule
    )
    singleOf(
        ::DefaultUsernameRepository
    ){
        bind<UsernameRepository>()
    }
}