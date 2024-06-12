package com.ssccgl.pinnacle.testportal.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ssccgl.pinnacle.testportal.viewmodel.HomeViewModel

@Composable
fun NavigationHost(navController: NavHostController, homeViewModel: HomeViewModel) {
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen(homeViewModel) }
        composable("test_portal") { TestPortalScreen() }
        composable("product") { ProductScreen() }
        composable("my_courses") { MyCoursesScreen() }
    }
}
