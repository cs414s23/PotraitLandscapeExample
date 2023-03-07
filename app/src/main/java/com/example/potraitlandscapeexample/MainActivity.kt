package com.example.potraitlandscapeexample

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*
    * This function is called when showMessage button is pressed
    * It checks orientation of the phone to show different messages
    */
    fun showMessageButton(view: View) {
        // Check the orientation to show different messages
        if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {
            // We are in portrait orientation
            Toast.makeText(this, "We are in Portrait Orientation", Toast.LENGTH_SHORT).show()
        } else {
            // We are in landscape orientation
            Toast.makeText(this, "We are in Landscape Orientation", Toast.LENGTH_SHORT).show()
        }
    }
}