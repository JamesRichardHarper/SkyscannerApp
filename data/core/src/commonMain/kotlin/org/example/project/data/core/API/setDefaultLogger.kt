package org.example.project.data.core.API

import co.touchlab.kermit.Logger
import co.touchlab.kermit.NoTagFormatter
import co.touchlab.kermit.loggerConfigInit
import co.touchlab.kermit.platformLogWriter

fun setDefaultLogger(){
    Logger(
        loggerConfigInit(
            platformLogWriter(
                NoTagFormatter
            )
        ),
        tag = "DefaultTag"
    )
}