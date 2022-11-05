package com.whasapp.net.ui.home.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.whasapp.net.R
import com.whasapp.net.theme.TealGreen
import com.whasapp.net.ui.util.WhatsAppIcons
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.toUpperCase


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WhatsAppTopBar() {
    TopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name),
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Medium
            )
        },
        modifier = Modifier.fillMaxWidth(),
        actions = {
            Box(modifier = Modifier.padding(end = 10.dp)) {
                Icon(
                    modifier = Modifier.size(26.dp),
                    imageVector = WhatsAppIcons.Search,
                    tint = Color.White,
                    contentDescription = null
                )
            }
            Box(modifier = Modifier.padding(end = 10.dp)) {
                Icon(
                    modifier = Modifier.size(26.dp),
                    imageVector = WhatsAppIcons.MoreVert,
                    tint = Color.White,
                    contentDescription = null
                )
            }
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = TealGreen
        )
    )
}