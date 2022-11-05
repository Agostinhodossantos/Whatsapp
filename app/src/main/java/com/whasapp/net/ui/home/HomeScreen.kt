package com.whasapp.net.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.whasapp.net.ui.home.components.WhatsappTabPager

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier.fillMaxSize()
) {
    Column() {
        WhatsappTabPager()
    }
}