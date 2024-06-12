package com.ssccgl.pinnacle.testportal.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AppDrawer() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Home", modifier = Modifier.padding(8.dp))
        Text(text = "Test Portal", modifier = Modifier.padding(8.dp))
        Text(text = "Product", modifier = Modifier.padding(8.dp))
        Text(text = "My Courses", modifier = Modifier.padding(8.dp))
    }
}
