package org.example.project.feature.flights

import org.example.project.domain.flights.flightsDomainModule
import org.koin.dsl.module

val flightsFeatureModule = module {
    includes(
        flightsDomainModule
    )
}