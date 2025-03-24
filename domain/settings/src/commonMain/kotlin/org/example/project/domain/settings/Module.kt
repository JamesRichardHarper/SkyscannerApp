package org.example.project.domain.settings

import org.koin.dsl.module
import org.example.project.data.settings.settingsDataModule

val settingsDomainModule = module {
    includes(
        settingsDataModule
    )
}