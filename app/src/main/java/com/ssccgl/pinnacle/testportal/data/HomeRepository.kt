package com.ssccgl.pinnacle.testportal.data

import com.ssccgl.pinnacle.testportal.R

class HomeRepository {
    fun getHomeItems(): List<HomeItem> {
        // Fetch data from a data source (e.g., network, database)
        return listOf(
            HomeItem(R.drawable.ic_home, "Home"),
            HomeItem(R.drawable.ic_testportal, "Test Portal"),
            // Add more items as needed
        )
    }
}
