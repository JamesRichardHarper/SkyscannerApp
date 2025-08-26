package org.example.project.data.core

import org.example.project.data.core.storage.DataStoreStorage
import org.example.project.data.core.storage.SplitDataStoreStorage
import org.example.project.data.core.storage.Storage
import org.example.project.data.core.storage.StoragePreference
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    includes(platformModule)
    singleOf(::DataStoreStorage){
        bind<Storage>()
    }
    singleOf(::SplitDataStoreStorage){
        bind<StoragePreference>()
    }
}

internal expect val platformModule: Module