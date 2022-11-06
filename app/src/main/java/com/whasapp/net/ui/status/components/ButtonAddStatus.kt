package com.whasapp.net.ui.status.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.DoneAll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.whasapp.net.R
import com.whasapp.net.theme.TealGreen


@Composable
fun ButtonAddStatus(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AddIcon(profile = painterResource(R.drawable.girl))
        Column(
            modifier = Modifier
                .padding(start = 18.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(R.string.status_title),
                style = MaterialTheme.typography.subtitle2
            )

            Text(
                text = stringResource(R.string.status_subtitle),
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}


@Composable
fun AddIcon(
    modifier: Modifier = Modifier,
    profile: Painter
) {
   Column(
       modifier = modifier
           .wrapContentHeight()
   ) {
       Image(
           painter = painterResource(R.drawable.girl),
           contentDescription = null,
           modifier = Modifier
               .size(50.dp)
               .clip(CircleShape),
           contentScale = ContentScale.FillBounds
       )
       Box(modifier = Modifier
           .offset((10).dp, (-20).dp)
           .background(TealGreen, CircleShape)
           .align(alignment = Alignment.End),
           Alignment.BottomEnd,
       ) {
           Icon(
               imageVector = Icons.Default.Add,
               contentDescription = null,
               modifier = Modifier
                   .size(20.dp, 20.dp)
                   .clip(CircleShape)
                   .border(1.5.dp, Color.White, CircleShape),
               tint = Color.White,
           )
       }
   }
}
