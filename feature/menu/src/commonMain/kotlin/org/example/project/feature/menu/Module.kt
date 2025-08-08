package org.example.project.feature.menu

import org.example.project.ui.core.coreUIModule
import org.koin.dsl.module

val menuFeatureModule = module {
    includes(
        coreUIModule
    )
}