package org.example.project.feature.settings

import org.example.project.domain.settings.settingsDomainModule
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val settingsFeatureModule = module {
    includes(
        settingsDomainModule
    )
    viewModelOf(
        ::SettingsViewModel
    )
}