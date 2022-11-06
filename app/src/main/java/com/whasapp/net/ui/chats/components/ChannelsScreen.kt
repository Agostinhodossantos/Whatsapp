package com.whasapp.net.ui.chats.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.whasapp.net.data.chatList

@Composable
fun ChannelsScreen() {
    LazyColumn(modifier = Modifier.fillMaxHeight()) {
        items(chatList) { chat ->
            ItemChat(
                name = chat.name,
                lastMessage = chat.lastMessage,
                time = chat.time,
                isRead = chat.isRead,
                profile = painterResource(chat.profile)
            )
        }
    }
}