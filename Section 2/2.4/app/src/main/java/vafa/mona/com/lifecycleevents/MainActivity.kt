package vafa.mona.com.lifecycleevents


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.arch.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {
    val TAG : String = "TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG,"Created")
        val model =
            ViewModelProviders.of(this)[ViewModelSample::class.java]
            Log.i(TAG,"Current view model instace value: " + model.ActivityMsg)
            model.ActivityMsg = "Hello Activity"
            Log.i(TAG,"Current view model instace value: " + model.ActivityMsg)

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"Started")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"Resumed")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"Destroyed")

    }
}
