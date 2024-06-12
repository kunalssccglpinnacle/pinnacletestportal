package com.ssccgl.pinnacle.testportal.ui

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.ssccgl.pinnacle.testportal.R

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    BottomNavigation {
        BottomNavigationItem(
            icon = { Icon(painterResource(id = R.drawable.ic_home), contentDescription = "Home") },
            label = { Text("Home") },
            selected = true,
            onClick = { navController.navigate("home") }
        )
        BottomNavigationItem(
            icon = { Icon(painterResource(id = R.drawable.ic_testportal), contentDescription = "Test Portal") },
            label = { Text("Test Portal") },
            selected = false,
            onClick = { navController.navigate("test_portal") }
        )
        BottomNavigationItem(
            icon = { Icon(painterResource(id = R.drawable.ic_testportal), contentDescription = "Product") },
            label = { Text("Product") },
            selected = false,
            onClick = { navController.navigate("product") }
        )
        BottomNavigationItem(
            icon = { Icon(painterResource(id = R.drawable.ic_testportal), contentDescription = "My Courses") },
            label = { Text("My Courses") },
            selected = false,
            onClick = { navController.navigate("my_courses") }
        )
    }
}
