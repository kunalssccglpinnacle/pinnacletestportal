package com.ssccgl.pinnacle.testportal

import HomeViewModel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ssccgl.pinnacle.testportal.Data.HomeItem
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    private val homeViewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen(homeViewModel)
        }
    }
}

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
            icon = { Icon(painterResource(id = R.drawable.ic_home), contentDescription = "Home") },
            label = { Text("Home") },
            selected = true,
            onClick = { navController.navigate("home") }
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

@Composable
fun NavigationHost(navController: NavHostController, homeViewModel: HomeViewModel) {
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen(homeViewModel) }
        composable("test_portal") { TestPortalScreen() }
        composable("product") { ProductScreen() }
        composable("my_courses") { MyCoursesScreen() }
    }
}

@Composable
fun HomeScreen(homeViewModel: HomeViewModel = viewModel()) {
    val uiState by homeViewModel.uiState.collectAsState()
    LazyColumn {
        item { HomeScreenContent(uiState.items) }
    }
}

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
                .size(64.dp)
                .padding(8.dp)
        )
        Text(text = text, fontSize = 12.sp, textAlign = TextAlign.Center)
    }
}

@Composable
fun TestPortalScreen() {
    // Content for Test Portal Screen
}

@Composable
fun ProductScreen() {
    // Content for Product Screen
}

@Composable
fun MyCoursesScreen() {
    // Content for My Courses Screen
}
