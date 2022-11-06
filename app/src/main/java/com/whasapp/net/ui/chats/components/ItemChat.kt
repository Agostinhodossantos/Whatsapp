package com.whasapp.net.ui.chats.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.whasapp.net.R
import com.whasapp.net.ui.util.WhatsAppIcons

@Composable
fun ItemChat() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 10.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.girl) ,
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
                Text("+258843655568", style = TextStyle(fontWeight = FontWeight.Medium))
                Text("16:50", fontSize = 10.sp)
            }
            Row(
                modifier = Modifier.padding(top = 5.dp)
            ) {
                Icon(
                    imageVector = WhatsAppIcons.Done, 
                    contentDescription = null,
                    modifier = Modifier.size(20.dp)
                )
                Text(
                    text = "Ola, como esta?",
                    modifier = Modifier.padding(start = 5.dp)
                )
            }
        }
    }
}