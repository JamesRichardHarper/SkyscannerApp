package org.example.project

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import org.example.project.feature.menu.Menu
import org.example.project.feature.menu.menuPaths
import org.example.project.feature.settings.Settings
import org.example.project.feature.settings.settingsPaths
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
//                flightPaths()
            }
//            MenuScreen(
//                goToSettings = { },
//                goToHistory = { },
//                testPull = { },
//                modifier = Modifier.fillMaxSize()
//            )
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
