package com.whasapp.net.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.whasapp.net.theme.WhatsappTheme
import com.whasapp.net.ui.home.WhatsAppCloneMain
import com.whasapp.net.ui.navigation.AppComposeNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    internal lateinit var appComposeNavigator: AppComposeNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsappTheme {
                WhatsAppCloneMain(appComposeNavigator)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WhatsappTheme {
    }
}