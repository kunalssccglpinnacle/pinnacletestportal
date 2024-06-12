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
                    HomeItem(R.drawable.ic_testportal, "Test Portal"),
                    HomeItem(R.drawable.ic_product, "Product"),
                    HomeItem(R.drawable.ic_blog, "Blog"),
                    HomeItem(R.drawable.ic_course, "My Courses"),
                    HomeItem(R.drawable.ic_testportal, "Attempted Tests"),
                    HomeItem(R.drawable.ic_testportal, "Tracking"),
                    HomeItem(R.drawable.ic_testportal, "eBooks"),
                    HomeItem(R.drawable.ic_testportal, "Books"),
                    HomeItem(R.drawable.ic_testportal, "Saved"),
                    HomeItem(R.drawable.ic_testportal, "Offline EBooks"),
                    HomeItem(R.drawable.ic_testportal, "QR Scanner"),
                    HomeItem(R.drawable.ic_testportal, "Typing Software"),
//                    HomeItem(R.drawable.ic_offline_videos, "Offline Videos")
                )
            )
        }
    }
}
