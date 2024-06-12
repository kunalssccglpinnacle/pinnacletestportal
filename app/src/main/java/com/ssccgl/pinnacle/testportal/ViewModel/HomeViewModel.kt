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
                    HomeItem(R.drawable.img, "Test Portal"),
                    HomeItem(R.drawable.img, "Product"),
                    HomeItem(R.drawable.img, "Blog"),
                    HomeItem(R.drawable.img, "My Courses"),
                    HomeItem(R.drawable.img, "Attempted Tests"),
                    HomeItem(R.drawable.img, "Tracking"),
                    HomeItem(R.drawable.img, "eBooks"),
                    HomeItem(R.drawable.img, "Books"),
                    HomeItem(R.drawable.img, "Saved"),
                    HomeItem(R.drawable.img, "Offline EBooks"),
                    HomeItem(R.drawable.img, "QR Scanner"),
                    HomeItem(R.drawable.img, "Typing Software"),
//                    HomeItem(R.drawable.ic_offline_videos, "Offline Videos")
                )
            )
        }
    }
}
