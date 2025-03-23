package org.example.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import org.example.project.Model.ApiHandler
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.core.context.startKoin
import skyscannerscanner.composeapp.generated.resources.Res
import skyscannerscanner.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    startKoin {
        printLogger()
    }
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        var responseText by remember { mutableStateOf("") }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Today's date is ${todaysDate()}",
                modifier = Modifier.padding((20.dp)),
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                lineHeight = 20.sp
            )
            Text(
                text = "Here we have: ${responseText}",
                modifier = Modifier.padding((20.dp)),
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                lineHeight = 20.sp
            )
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            Button(
                onClick = {
                    responseText = getExample()
                }
            ){
                Text("Pull Data")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                }
            }
        }
    }
}

fun todaysDate(): String{
    fun LocalDateTime.format() = toString().substringBefore('T')
    val now = Clock.System.now()
    val zone = TimeZone.currentSystemDefault()
    return now.toLocalDateTime(zone).format()
}

fun getExample(): String{
    return runBlocking {
        var client = ApiHandler();
        var exampleCharacter = client.createExample();
        var response = exampleCharacter.getPerson();
        val one = async{ response }
        return@runBlocking response
        //var response = async(start = CoroutineStart.LAZY){ exampleCharacter.getPerson() }
    }
}

