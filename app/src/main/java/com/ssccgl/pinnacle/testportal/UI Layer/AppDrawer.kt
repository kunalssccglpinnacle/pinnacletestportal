//package com.ssccgl.pinnacle.testportal.ui
//
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//
//@Composable
//fun AppDrawer() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)
//    ) {
//        Text(text = "Home", modifier = Modifier.padding(8.dp))
//        Text(text = "Test Portal", modifier = Modifier.padding(8.dp))
//        Text(text = "Product", modifier = Modifier.padding(8.dp))
//        Text(text = "My Courses", modifier = Modifier.padding(8.dp))
//    }
//}


package com.ssccgl.pinnacle.testportal.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun AppDrawer(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Home",
            modifier = Modifier
                .padding(8.dp)
                .clickable { navController.navigate("home") }
        )
        Text(
            text = "Test Portal",
            modifier = Modifier
                .padding(8.dp)
                .clickable { navController.navigate("test_portal") }
        )
        Text(
            text = "Product",
            modifier = Modifier
                .padding(8.dp)
                .clickable { navController.navigate("product") }
        )
        Text(
            text = "My Courses",
            modifier = Modifier
                .padding(8.dp)
                .clickable { navController.navigate("my_courses") }
        )
    }
}
