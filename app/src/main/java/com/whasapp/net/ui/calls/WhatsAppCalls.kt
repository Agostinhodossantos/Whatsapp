package com.whasapp.net.ui.calls

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.whasapp.net.data.callList
import com.whasapp.net.data.chatList
import com.whasapp.net.ui.calls.components.ItemCall

@Composable
fun WhatsAppCalls() {
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(callList) { call ->
            ItemCall(call = call)
        }
    }
}