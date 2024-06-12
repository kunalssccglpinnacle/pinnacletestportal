package com.ssccgl.pinnacle.testportal.ui

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.res.painterResource
import com.ssccgl.pinnacle.testportal.R
import kotlinx.coroutines.launch

@Composable
fun TopAppBarWithDrawerButton(scaffoldState: ScaffoldState) {
    TopAppBar(
        title = { Text("Pinnacle") },
        navigationIcon = {
            val scope = rememberCoroutineScope()
            IconButton(onClick = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            }) {
                Icon(painterResource(id = R.drawable.ic_appdrawer_icon), contentDescription = "Menu")
            }
        }
    )
}
