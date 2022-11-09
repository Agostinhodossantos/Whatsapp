package com.whasapp.net.ui.navigation

import android.util.Base64.encodeToString
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.whasapp.net.domain.model.WhatsAppUser
import com.whasapp.net.ui.home.components.WhatsAppTopBar
import com.whasapp.net.ui.home.components.WhatsappTabPager



sealed class WhatsAppScreens(
    val route: String,
    val index: Int? = null,
    val navArguments: List<NamedNavArgument> = emptyList()
) {
    val name: String = route.appendArguments(navArguments)

    object Home : WhatsAppScreens("home")

    object Messages : WhatsAppScreens(
        route = "messages",
        navArguments = listOf(navArgument("channelId") { type = NavType.StringType})
    ) {
        fun createRoute(channelId: String) =
            name.replace("{${navArguments.first().name}}", channelId)
    }

    object CallInfo : WhatsAppScreens(
        route = "call_info",
        navArguments = listOf(
            navArgument("user") {
                type = WhatsAppUserType()
                nullable = false
            }
        )
    ) {
        const val KEY_USER = "user"
        fun createRoute(whatsAppUser: WhatsAppUser) =
            name.replace("{${navArguments.first().name}}", WhatsAppUserType.encodeToString(whatsAppUser))

    }
}
@OptIn(ExperimentalMaterial3Api::class)
fun NavGraphBuilder.whatsAppHomeNavigation(
    composeNavigator: AppComposeNavigator
) {
    composable(route = WhatsAppScreens.Home.name) {
        Scaffold(topBar = { WhatsAppTopBar() }) { padding ->
            WhatsappTabPager(
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

    }
}


private fun String.appendArguments(navArguments: List<NamedNavArgument>): String {
    val mandatoryArguments = navArguments.filter { it.argument.defaultValue == null }
        .takeIf { it.isNotEmpty() }
        ?.joinToString(separator = "/", prefix = "/") { "{${it.name}}" }
        .orEmpty()
    val optionalArguments = navArguments.filter { it.argument.defaultValue != null }
        .takeIf { it.isNotEmpty() }
        ?.joinToString(separator = "&", prefix = "?") { "${it.name}={${it.name}}" }
        .orEmpty()
    return "$this$mandatoryArguments$optionalArguments"
}




















