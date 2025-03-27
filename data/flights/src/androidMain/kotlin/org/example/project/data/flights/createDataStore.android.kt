package org.example.project.data.flights

import android.content.Context

fun createDataStore(context: Context) = createDataStore(
    producePath = {
        context.filesDir.resolve(dataStoreFileName).absolutePath
    }
)