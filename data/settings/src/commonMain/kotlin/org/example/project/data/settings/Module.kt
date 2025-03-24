package org.example.project.data.settings

import org.example.project.data.core.coreDataModule
import org.koin.dsl.module

val settingsDataModule = module {
    includes(
        coreDataModule
    )
}