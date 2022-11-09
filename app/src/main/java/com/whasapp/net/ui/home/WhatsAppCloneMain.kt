package com.whasapp.net.ui.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.compose.rememberNavController
import com.whasapp.net.theme.WhatsappTheme
import com.whasapp.net.ui.navigation.AppComposeNavigator

@Composable
fun WhatsAppCloneMain(
    composeNavigator: AppComposeNavigator
) {
    WhatsappTheme {
        val navHostController = rememberNavController()

        LaunchedEffect(Unit) {
            composeNavigator.handleNavigationCommands(navHostController)
        }

    }

}