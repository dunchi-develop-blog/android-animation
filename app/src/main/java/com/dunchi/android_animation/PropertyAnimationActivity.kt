 package com.dunchi.android_animation

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_property_animation.*

 class PropertyAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_property_animation)


        propertyFadeIn.setOnClickListener(fadeInClickListener)
        propertyFadeOut.setOnClickListener(fadeOutClickListener)
    }

     val fadeInClickListener : View.OnClickListener = View.OnClickListener {
         var anim = AnimatorInflater.loadAnimator(applicationContext,R.animator.fade_in) as AnimatorSet
         anim.setTarget(propertyView)
         anim.start()
     }

     val fadeOutClickListener : View.OnClickListener = View.OnClickListener {
         var anim = AnimatorInflater.loadAnimator(applicationContext,R.animator.fade_out) as AnimatorSet
         anim.setTarget(propertyView)
         anim.start()
     }
}