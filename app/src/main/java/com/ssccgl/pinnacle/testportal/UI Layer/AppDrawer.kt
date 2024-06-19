package com.ssccgl.pinnacle.testportal.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import kotlinx.coroutines.launch

@Composable
fun AppDrawer(navController: NavHostController, scaffoldState: ScaffoldState) {
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Home",
            modifier = Modifier
                .padding(8.dp)
                .clickable {
                    coroutineScope.launch {
                        navController.navigate("home") {
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                        scaffoldState.drawerState.close()
                    }
                }
        )
        Text(
            text = "Test Portal",
            modifier = Modifier
                .padding(8.dp)
                .clickable {
                    coroutineScope.launch {
                        navController.navigate("test_portal") {
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                        scaffoldState.drawerState.close()
                    }
                }
        )
        Text(
            text = "Product",
            modifier = Modifier
                .padding(8.dp)
                .clickable {
                    coroutineScope.launch {
                        navController.navigate("product") {
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                        scaffoldState.drawerState.close()
                    }
                }
        )
        Text(
            text = "My Courses",
            modifier = Modifier
                .padding(8.dp)
                .clickable {
                    coroutineScope.launch {
                        navController.navigate("my_courses") {
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                        scaffoldState.drawerState.close()
                    }
                }
        )
    }
}

