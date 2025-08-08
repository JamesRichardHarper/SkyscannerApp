package org.example.project.data.flights

import org.example.project.data.core.coreDataModule
import org.koin.dsl.module

val flightsDataModule = module {
    includes(
        coreDataModule
    )
}