package com.whasapp.net.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.whasapp.net.ui.home.components.WhatsAppTopBar


fun NavGraphBuilder.whatsAppHomeNavigation(
    composeNavigator: AppComposeNavigator
) {
    composable(route = WhatsAppScreens.Home.name) {
        Scaffold(topBar = { WhatsAppTopBar() }) { padding ->
            WhatsAppTabPager(
                modifier = Modifier.padding(padding),
                composeNavigator = composeNavigator
            )
        }
    }

    composable(
        route = WhatsAppScreens.Messages.name,
        arguments = WhatsAppScreens.Messages.navArguments
    ) {
        val channelId = it.arguments?.getString("channelId") ?: return@composable
        Wha
    }
}





















