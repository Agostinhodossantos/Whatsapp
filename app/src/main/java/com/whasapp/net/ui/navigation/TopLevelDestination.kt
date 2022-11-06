package com.whasapp.net.ui.navigation

import com.whasapp.net.ui.util.Icon
import com.whasapp.net.ui.util.WhatsAppIcons


data class TopLevelDestination(
    val route: String,
    val selectedIcon: Icon? = null,
    val unselectedIcon: Icon? = null,
    val iconTextId: Int? = null
)

val TOP_LEVEL_DESTINATIONS = listOf(
    TopLevelDestination(
        route = WhatsAppPage.Camera.route,
        selectedIcon = Icon.ImageVectorIcon(WhatsAppIcons.Camera),
        unselectedIcon = Icon.ImageVectorIcon(WhatsAppIcons.Camera)
    ),
    TopLevelDestination(
        route = WhatsAppPage.Chats.route,
        iconTextId = 1
    ),
    TopLevelDestination(
        route = WhatsAppPage.Status.route,
        iconTextId = 2
    ),
    TopLevelDestination(
        route = WhatsAppPage.Calls.route,
        iconTextId = 3
    )
)

sealed class WhatsAppPage(
    val route: String,
    val index: Int
) {
    object Camera: WhatsAppPage("camera", index = 0)
    object Chats: WhatsAppPage("chats", index = 1)
    object Status: WhatsAppPage("status", index = 2)
    object Calls: WhatsAppPage("calls", index = 3)
}

