
package com.ssccgl.pinnacle.testportal.data

import com.ssccgl.pinnacle.testportal.R

class HomeRepository {
    fun getHomeItems(): List<HomeItem> {
        return listOf(
            HomeItem(R.drawable.ic_home, "Home"),
            HomeItem(R.drawable.ic_testportal, "Test Portal"),
            HomeItem(R.drawable.ic_product, "Product"),
            HomeItem(R.drawable.ic_blog, "Blog"),
            HomeItem(R.drawable.ic_my_courses, "My Courses"),
            HomeItem(R.drawable.ic_attempted_tests, "Attempted Tests"),
            HomeItem(R.drawable.ic_tracking, "Tracking"),
            HomeItem(R.drawable.ic_ebooks, "eBooks"),
            HomeItem(R.drawable.ic_books, "Books"),
            HomeItem(R.drawable.ic_bookmarked, "Bookmarked"),
            HomeItem(R.drawable.ic_offline_ebook, "Offline EBooks"),
            HomeItem(R.drawable.ic_qr_scanner, "QR Scanner"),
            HomeItem(R.drawable.ic_typing_software, "Typing Software"),
            HomeItem(R.drawable.ic_my_courses, "New Feature"),
            HomeItem(R.drawable.ic_my_courses, "Another Feature") // Add more items as needed
        )
    }
}
