package com.ebookfrenzy.kotlinlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.constraintlayout.widget.ConstraintLayout
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintSet
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        configureLayout()
    }

    private fun configureLayout() {
        val myButton = Button(this)
        myButton.text = getString(R.string.press_me)
        myButton.setBackgroundColor(Color.YELLOW)
        myButton.id = R.id.myButton

        val myLayout = ConstraintLayout(this)
        myLayout.setBackgroundColor(Color.BLUE)

        myLayout.addView(myButton)
        setContentView(myLayout)

        val set = ConstraintSet()

        set.constrainHeight(myButton.id, ConstraintSet.WRAP_CONTENT)
        set.constrainWidth(myButton.id, ConstraintSet.WRAP_CONTENT)

        set.connect(myButton.id, ConstraintSet.START, ConstraintSet.PARENT_ID,ConstraintSet.START, 0)
        set.connect(myButton.id, ConstraintSet.END, ConstraintSet.PARENT_ID, ConstraintSet.END, 0)
        set.connect(myButton.id, ConstraintSet.TOP, ConstraintSet.PARENT_ID,ConstraintSet.TOP, 0)
        set.connect(myButton.id, ConstraintSet.BOTTOM, ConstraintSet.PARENT_ID, ConstraintSet.BOTTOM, 0)

        set.applyTo(myLayout)
    }
}