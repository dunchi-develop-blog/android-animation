package com.dunchi.android_animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        property.setOnClickListener(propertyBtnClick)
        view.setOnClickListener(viewBtnClick)
    }

    val propertyBtnClick: View.OnClickListener = View.OnClickListener {
        startActivity(Intent(this,PropertyAnimationActivity::class.java))
        finish()
    }

    val viewBtnClick: View.OnClickListener = View.OnClickListener {
        startActivity(Intent(this,ViewAnimationActivity::class.java))
        finish()
    }
}