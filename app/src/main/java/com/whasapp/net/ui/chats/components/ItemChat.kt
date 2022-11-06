package com.whasapp.net.ui.chats.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.whasapp.net.R
import com.whasapp.net.ui.util.WhatsAppIcons

@Composable
fun ItemChat(
    name: String,
    lastMessage: String,
    time: String,
    isRead: Boolean,
    profile: Painter
) {
    Box(modifier = Modifier.fillMaxWidth()
        .clickable {

        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 10.dp)

        ) {
            Image(
                painter = profile ,
                contentDescription = null,
                modifier = Modifier
                    .size(56.dp)
                    .padding(5.dp)
                    .clip(CircleShape),
            )
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(end = 10.dp, start = 15.dp, top = 8.dp)
            ) {
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(name, style = TextStyle(fontWeight = FontWeight.Medium))
                    Text(time, fontSize = 10.sp)
                }
                Row(
                    modifier = Modifier.padding(top = 5.dp)
                ) {
                    if (isRead) {
                        Icon(
                            imageVector = WhatsAppIcons.DoneAll,
                            contentDescription = null,
                            modifier = Modifier.size(20.dp),
                            tint = Color.Blue
                        )
                    } else {
                        Icon(
                            imageVector = WhatsAppIcons.Done,
                            contentDescription = null,
                            modifier = Modifier.size(20.dp),
                        )
                    }
                    Text(
                        text = lastMessage,
                        modifier = Modifier.padding(start = 5.dp),
                        maxLines = 1,

                    )
                }
            }
        }
    }
}