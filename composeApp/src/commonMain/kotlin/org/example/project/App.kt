package org.example.project

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import org.example.project.feature.menu.Menu
import org.example.project.feature.menu.menuPaths
import org.example.project.feature.settings.Settings
import org.example.project.feature.settings.settingsPaths
import org.example.project.ui.core.layout.Dimensions
import org.example.project.ui.core.layout.LocalDimensions
import org.example.project.ui.core.layout.LocalPadding
import org.example.project.ui.core.layout.Padding
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication
import org.koin.core.module.Module

@Composable
@Preview
fun App(
    platformModule: Module = Module(),
) {
    KoinApplication(
        application = {
            modules(appModule, platformModule)
        }
    ){
        MaterialTheme{
            val navController = rememberNavController()
            //TODO("
            // This is purely here to demonstrate injecting new local variables
            // ideally it'll be removed for the MVP
            // ")
            CompositionLocalProvider(
//                LocalPadding provides Padding(
//                    normal = 0.dp,
//                ),
//                LocalDimensions provides Dimensions(
//                    maxWidthSmall = 2000.dp,
//                )
            ){
                NavHost(
                    navController = navController,
                    startDestination = Menu,
                ){
                    menuPaths(
                        goToSettings = { navController.navigate(Settings) },
                        goToHistory = { },
                        testPull = { },
                    )
                    settingsPaths(
                        actionOne = { },
                        actionTwo = { },
                        testPull = { },
                        goBack = { navController.popBackStack() }
                    )
                }
            }
        }
    }
}

//fun todaysDate(): String{
//    fun LocalDateTime.format() = toString().substringBefore('T')
//    val now = Clock.System.now()
//    val zone = TimeZone.currentSystemDefault()
//    return now.toLocalDateTime(zone).format()
//}
//
//fun getExample(): String{
//    return runBlocking {
//        val client = ApiHandler()
//        var exampleCharacter = client.createApiService()
//        var response = exampleCharacter.getBasePerson()
//        return@runBlocking response
////        val one = async{ response }
//        //var response = async(start = CoroutineStart.LAZY){ exampleCharacter.getPerson() }
//    }
//}
//
