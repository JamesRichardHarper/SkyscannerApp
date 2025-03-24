package org.example.project

import org.example.project.feature.flights.flightsFeatureModule
import org.example.project.feature.menu.menuFeatureModule
import org.example.project.feature.settings.settingsFeatureModule
import org.koin.dsl.module

val appModule = module {
    includes(
        menuFeatureModule,
        settingsFeatureModule,
        flightsFeatureModule
    )
}