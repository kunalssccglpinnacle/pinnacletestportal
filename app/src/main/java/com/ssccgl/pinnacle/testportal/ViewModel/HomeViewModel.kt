import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ssccgl.pinnacle.testportal.Data.HomeItem
import com.ssccgl.pinnacle.testportal.Data.HomeUiState
import com.ssccgl.pinnacle.testportal.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState

    init {
        loadHomeItems()
    }

    private fun loadHomeItems() {
        viewModelScope.launch {
            _uiState.value = HomeUiState(
                items = listOf(
                    HomeItem(R.drawable.ic_test_portal, "Test Portal"),
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
//                    HomeItem(R.drawable.ic_offline_videos, "Offline Videos")
                )
            )
        }
    }

}
