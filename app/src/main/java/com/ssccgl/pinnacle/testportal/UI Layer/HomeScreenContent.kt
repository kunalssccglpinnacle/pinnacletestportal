package com.ssccgl.pinnacle.testportal.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ssccgl.pinnacle.testportal.data.HomeItem

@Composable
fun HomeScreenContent(items: List<HomeItem>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        for (i in items.indices step 4) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                for (j in 0 until 4) {
                    if (i + j < items.size) {
                        HomeIconItem(icon = items[i + j].icon, text = items[i + j].text)
                    }
                }
            }
        }
    }
}

@Composable
fun HomeIconItem(icon: Int, text: String) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .clickable { },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = text,
            modifier = Modifier
                .size(72.dp)
                .padding(8.dp)
        )
        Text(text = text, fontSize = 12.sp, textAlign = TextAlign.Center)
    }
}
