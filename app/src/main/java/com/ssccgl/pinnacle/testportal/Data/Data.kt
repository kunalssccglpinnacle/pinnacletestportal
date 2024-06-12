package com.ssccgl.pinnacle.testportal.Data

// Assuming HomeUiState.kt contains the following data classes
data class HomeUiState(val items: List<HomeItem> = emptyList())
data class HomeItem(val icon: Int, val text: String)
