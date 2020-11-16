package com.dunchi.android_animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_view_animation.*

class ViewAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_animation)

        viewFadeIn.setOnClickListener(fadeInClickListener)
        viewFadeOut.setOnClickListener(fadeOutClickListener)
        viewView.setOnClickListener(viewClickListener)
    }

    val fadeInClickListener : View.OnClickListener = View.OnClickListener {
        var anim = AnimationUtils.loadAnimation(applicationContext,R.anim.fade_in)
        viewView.startAnimation(anim)
    }

    val fadeOutClickListener : View.OnClickListener = View.OnClickListener {
        var anim = AnimationUtils.loadAnimation(applicationContext,R.anim.fade_out)
        viewView.startAnimation(anim)
    }

    val viewClickListener : View.OnClickListener = View.OnClickListener {
        Toast.makeText(applicationContext, "View가 눌렸습니다!", Toast.LENGTH_SHORT).show()
    }
}
