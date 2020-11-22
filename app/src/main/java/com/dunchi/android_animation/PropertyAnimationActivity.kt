 package com.dunchi.android_animation

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_property_animation.*

 class PropertyAnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_property_animation)

        propertyView.setOnClickListener(viewClickListener)
        propertyFadeIn.setOnClickListener(fadeInClickListener)
        propertyFadeOut.setOnClickListener(fadeOutClickListener)
        propertyTranX.setOnClickListener(tranXClickListener)
        propertyTranY.setOnClickListener(tranYClickListener)
    }

     val viewClickListener : View.OnClickListener = View.OnClickListener {
         Toast.makeText(applicationContext, "View가 눌렸습니다!",Toast.LENGTH_SHORT).show()
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

     val tranXClickListener : View.OnClickListener = View.OnClickListener {
         var anim = AnimatorInflater.loadAnimator(applicationContext,R.animator.fade_in) as AnimatorSet
         anim.setTarget(propertyView)
         anim.start()
     }

     val tranYClickListener : View.OnClickListener = View.OnClickListener {
         var anim = AnimatorInflater.loadAnimator(applicationContext,R.animator.fade_in) as AnimatorSet
         anim.setTarget(propertyView)
         anim.start()
     }
 }