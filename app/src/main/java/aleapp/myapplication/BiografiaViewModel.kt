package aleapp.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BiografiaViewModel : ViewModel() {

    var bioList: List<Biografia> = getBiografias()

    private val _currentBio = MutableLiveData<Biografia>()
    val currentBio: LiveData<Biografia> = _currentBio

    fun setBio(bioId: Int) {
        _currentBio.value = bioList.get(bioId-1)
    }

}