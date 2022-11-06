package com.whasapp.net.domain.model

import androidx.compose.ui.graphics.painter.Painter

data class Chat(
    var name: String,
    var lastMessage: String,
    var time: String,
    var isRead: Boolean,
    var profile: Int
)