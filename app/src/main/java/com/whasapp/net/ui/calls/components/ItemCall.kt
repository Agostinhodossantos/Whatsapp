package com.whasapp.net.ui.calls.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowOutward
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.whasapp.net.R
import com.whasapp.net.domain.model.Call
import com.whasapp.net.theme.TealGreen

@Composable
fun ItemCall(
    call: Call
) {

    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 4.dp)
        .clickable {

        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(call.profile),
                contentDescription = null,
                modifier = Modifier
                    .size(56.dp)
                    .padding(5.dp)
                    .clip(CircleShape),
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth(3f)
                    .padding(end = 10.dp, start = 15.dp, top = 8.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(call.number, style = TextStyle(fontWeight = FontWeight.Medium))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (call.isMyCall) {
                        Icon(
                            imageVector = Icons.Default.ArrowOutward,
                            contentDescription = null,
                            tint = if (call.isSuccess) TealGreen else Color.Red
                        )
                    } else {
                        Icon(
                            imageVector = Icons.Default.ArrowUpward,
                            contentDescription = null,
                            tint = if (call.isSuccess) TealGreen else Color.Red
                        )
                    }
                    Text(call.time, modifier = Modifier.padding(top = 5.dp))
                }
            }
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = null,
                tint = TealGreen,
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .size(20.dp)
            )
        }
    }
}