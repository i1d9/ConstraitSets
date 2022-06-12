package com.ebookfrenzy.kotlinlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.constraintlayout.widget.ConstraintLayout
import android.widget.Button
import android.widget.EditText
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        configureLayout()
    }

    private fun configureLayout() {
        val myButton = Button(this)
        myButton.text = getString(R.string.press_me)
        myButton.setBackgroundColor(Color.YELLOW)

        val myLayout = ConstraintLayout(this)
        myLayout.setBackgroundColor(Color.BLUE)

        myLayout.addView(myButton)
        setContentView(myLayout)
    }
}