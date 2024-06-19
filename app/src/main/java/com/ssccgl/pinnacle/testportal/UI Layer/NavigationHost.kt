//
//package com.ssccgl.pinnacle.testportal.ui
//
//import androidx.compose.runtime.Composable
//import androidx.lifecycle.viewmodel.compose.viewModel
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import com.ssccgl.pinnacle.testportal.DashboardScreen
//import com.ssccgl.pinnacle.testportal.viewmodel.HomeViewModel
//import com.ssccgl.pinnacle.testportal.viewmodel.TestPortalViewModel
//
//@Composable
//fun NavigationHost(navController: NavHostController) {
//    val homeViewModel: HomeViewModel = viewModel()
//    val testPortalViewModel: TestPortalViewModel = viewModel()
//
//    NavHost(navController, startDestination = "test_portal") {
//        composable("home") { HomeScreen(homeViewModel) }
//        composable("test_portal") { TestPortalScreen(testPortalViewModel) }
//        composable("product") { ProductScreen() }
//        composable("my_courses") { MyCoursesScreen() }
//
//        composable ("dashboard") {DashboardScreen()}
//    }
//}

package com.ssccgl.pinnacle.testportal.ui

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ssccgl.pinnacle.testportal.DashboardScreen
import com.ssccgl.pinnacle.testportal.viewmodel.HomeViewModel
import com.ssccgl.pinnacle.testportal.viewmodel.TestPortalViewModel

@Composable
fun NavigationHost(navController: NavHostController, homeViewModel: HomeViewModel) {
    val homeViewModel: HomeViewModel = viewModel()
    val testPortalViewModel: TestPortalViewModel = viewModel()

    NavHost(navController, startDestination = "test_portal") {
        composable("home") { HomeScreen(homeViewModel) }
        composable("test_portal") { TestPortalScreen(testPortalViewModel) }
        composable("product") { ProductScreen() }
        composable("my_courses") { MyCoursesScreen() }
        composable("dashboard") { DashboardScreen() }  // Added DashboardScreen route
    }
}
