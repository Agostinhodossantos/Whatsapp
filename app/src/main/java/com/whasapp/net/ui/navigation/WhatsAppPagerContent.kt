package com.whasapp.net.ui.navigation

import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.whasapp.net.ui.calls.WhatsAppCalls
import com.whasapp.net.ui.camera.WhatsAppCamera
import com.whasapp.net.ui.chats.WhatsAppChannels
import com.whasapp.net.ui.status.WhatsAppStatus


@Composable
fun WhatsAppPagerContent(
    page: Int
) {
    val activity = (LocalContext.current as? Activity)
    BackHandler {
        activity?.finish()
    }

    when (page) {
        WhatsAppPage.Camera.index -> WhatsAppCamera()
        WhatsAppPage.Chats.index -> WhatsAppChannels()
        WhatsAppPage.Status.index -> WhatsAppStatus()
        WhatsAppPage.Calls.index -> WhatsAppCalls()
    }

}