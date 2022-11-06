package com.whasapp.net.data

import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.whasapp.net.R
import com.whasapp.net.domain.model.Chat

var chatList = listOf<Chat>(
    Chat(name = "Agostinho", "Ola, Tudo bem?", "20:00", true, R.drawable.girl),
    Chat(name = "Maria", "Ja cheguei", "17:00", false, R.drawable.girl),
    Chat(name = "Katia", "Ate Amanha, Tudo bem?", "18:00", true, R.drawable.girl),
    Chat(name = "Helton", "Kmk", "18:30", false, R.drawable.girl),
    Chat(name = "Elisa", "Sim", "19:00", true, R.drawable.girl),
    Chat(name = "Elton", "Of course you can tune maxLines to fit your needs", "19:20", true, R.drawable.girl),
    Chat(name = "Akita", "Kmk, Tudo bem?", "20:00", true, R.drawable.girl),
)