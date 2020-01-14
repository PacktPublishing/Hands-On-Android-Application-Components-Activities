package vafa.mona.com.lifecycleevents

import android.arch.lifecycle.ViewModel
import android.util.Log

/**
 * Created by ${Mona}
 */
class ViewModelSample : ViewModel(){

    val TAG : String = "TAG"
    var ActivityMsg = ""

    override fun onCleared() {
        super.onCleared()
        Log.i(TAG,"ViewModel Got Cleared")
    }
}