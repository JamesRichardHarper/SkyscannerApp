package org.example.project

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import okhttp3.OkHttpClient
import org.koin.dsl.module
import org.example.project.data.flights.createDataStore


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dataStore = createDataStore( context = this)

        setContent {
            App(
                platformModule = module{
                    single<Context>{
                        applicationContext
                    }
                }
            )
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}
