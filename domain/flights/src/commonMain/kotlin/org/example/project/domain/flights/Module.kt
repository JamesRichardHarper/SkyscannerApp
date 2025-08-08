package org.example.project.domain.flights

import org.example.project.data.flights.flightsDataModule
import org.example.project.data.settings.settingsDataModule
import org.koin.dsl.module

val flightsDomainModule = module {
    includes(
        flightsDataModule,
        settingsDataModule
    )
}