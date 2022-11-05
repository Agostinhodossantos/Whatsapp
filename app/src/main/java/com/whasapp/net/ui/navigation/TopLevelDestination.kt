package com.whasapp.net.ui.navigation

sealed class WhatsAppPage(
    val route: String,
    val index: Int
) {
    object Camera: WhatsAppPage("camera", index = 0)
    object Chats: WhatsAppPage("chats", index = 1)
    object Status: WhatsAppPage("status", index = 2)
    object Calls: WhatsAppPage("calls", index = 3)
}