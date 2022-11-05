package com.whasapp.net.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.whasapp.net.theme.TealGreen
import androidx.compose.ui.unit.*
import com.google.accompanist.pager.*
import com.whasapp.net.R
import com.whasapp.net.ui.util.WhatsAppIcons
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class, ExperimentalUnitApi::class)
@Composable
fun WhatsappTabPager(
    modifier: Modifier = Modifier
) {
    val tabItems = listOf(
        stringResource(R.string.tab4),
        stringResource(R.string.tab1),
        stringResource(R.string.tab2),
        stringResource(R.string.tab3),
    )
    val pagerState = rememberPagerState()
    val coroutineScope = rememberCoroutineScope()

    Column {
        TabRow(
            selectedTabIndex = pagerState.currentPage,
            modifier = Modifier.background(color = Color.Transparent),
            backgroundColor = TealGreen,
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(
                    Modifier
                        .pagerTabIndicatorOffset(
                            pagerState, tabPositions
                        )
                        .width(0.dp)
                        .height(1.dp)
                        .background(TealGreen)
                )
            }
        ) {
            tabItems.forEachIndexed { index, title ->
//                        val color = remember {
//                           // Animatable(Denim)
//                        }

                LaunchedEffect(
                    pagerState.currentPage == index
                ) {
                    //color.animateTo(if (pagerState.currentPage == index) Color.White else Malibu)
                }
                Tab(
                    modifier = Modifier.padding(10.dp),
                    selected = pagerState.currentPage == index,
                    onClick = {
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(index)
                        }
                    }
                ) {
                    if (title != stringResource(R.string.tab4)) {
                        Text(
                            text = title.uppercase(),
                            color = Color.White,
                            style = MaterialTheme.typography.titleSmall
                        )
                    } else {
                        Icon(
                            imageVector = WhatsAppIcons.Camera,
                            tint = Color.White,
                            contentDescription = null
                        )
                    }
                }
            }
        }
        HorizontalPager(
            count = tabItems.size,
            state = pagerState,
            modifier = Modifier
                .fillMaxSize()
        ) { page ->
            Text(
                text = tabItems[page],
                modifier = Modifier.padding(50.dp),
                color = Color.Blue
            )
        }
    }
}
