package com.ssccgl.pinnacle.testportal.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.ssccgl.pinnacle.testportal.viewmodel.HomeViewModel

@Composable
fun MainScreen(homeViewModel: HomeViewModel) {
    val scaffoldState = rememberScaffoldState()
    val navController = rememberNavController()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopAppBarWithDrawerButton(scaffoldState) },
        drawerContent = { AppDrawer() },
        bottomBar = { BottomNavigationBar(navController) },
        content = { padding ->
            Box(modifier = Modifier.padding(padding)) {
                NavigationHost(navController, homeViewModel)
            }
        }
    )
}
