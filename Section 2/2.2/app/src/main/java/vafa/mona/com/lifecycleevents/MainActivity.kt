package vafa.mona.com.lifecycleevents

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG : String = "TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG,"Created")
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
