package com.whasapp.net.ui.status

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.whasapp.net.ui.status.components.ButtonAddStatus

@Composable
fun WhatsAppStatus() {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        ButtonAddStatus(modifier = Modifier.padding(top = 10.dp))
    }
}