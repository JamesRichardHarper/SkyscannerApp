package org.example.project.domain.settings

import org.koin.dsl.module
import org.example.project.data.settings.settingsDataModule
import org.koin.core.module.dsl.factoryOf

val settingsDomainModule = module {
    includes(
        settingsDataModule
    )
    factoryOf(
        ::GetUsernameAsFlowUseCase
    )
    factoryOf(
        ::UpdateUsernameUseCase
    )
}