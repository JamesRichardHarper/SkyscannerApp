package org.example.project.data.core

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import org.example.project.data.core.storage.createDataStore
import org.koin.dsl.module

internal actual val platformModule = module {
    single<DataStore<Preferences>>{
        createDataStore(
            context = get()
        )
    }
}