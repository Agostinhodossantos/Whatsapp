package com.whasapp.net.ui.chats

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.whasapp.net.theme.TealGreen

import com.whasapp.net.theme.WhatsappTheme
import com.whasapp.net.ui.chats.components.ChannelsScreen
import com.whasapp.net.ui.util.WhatsAppIcons


@Composable
fun WhatsAppChannels() {
    WhatsappTheme {
        Box(modifier = Modifier.fillMaxSize()) {

            ChannelsScreen()
            FloatingActionButton(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp)
                    .size(58.dp),
                containerColor = TealGreen,
                shape = CircleShape,
                onClick = { }
            ) {
                Icon(
                    imageVector = WhatsAppIcons.Message,
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }
    }
}