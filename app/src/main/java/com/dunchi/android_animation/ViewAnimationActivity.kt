package com.dunchi.android_animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_view_animation.*

class ViewAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_animation)

        viewFadeIn.setOnClickListener(fadeInClickListener)
        viewFadeOut.setOnClickListener(fadeOutClickListener)
    }

    val fadeInClickListener : View.OnClickListener = View.OnClickListener {
        var anim = AnimationUtils.loadAnimation(applicationContext,R.anim.fade_in)
        viewView.startAnimation(anim)
    }

    val fadeOutClickListener : View.OnClickListener = View.OnClickListener {
        var anim = AnimationUtils.loadAnimation(applicationContext,R.anim.fade_out)
        viewView.startAnimation(anim)
    }
}
