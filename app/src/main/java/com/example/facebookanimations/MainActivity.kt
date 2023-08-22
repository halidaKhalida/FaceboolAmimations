package com.example.facebookanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        val tvText1=findViewById<TextView>(R.id.tv_text1)
        val tvText2=findViewById<TextView>(R.id.tv_text2)
        val laAnimation=findViewById<LottieAnimationView>(R.id.la_loading)
        val anim1=findViewById<Button>(R.id.b_anim1)
        val anim2=findViewById<Button>(R.id.b_anim2)
        val anim3=findViewById<Button>(R.id.b_anim3)
        val anim4=findViewById<Button>(R.id.b_anim4)
        val anim5=findViewById<Button>(R.id.b_anim5)
        val anim6=findViewById<Button>(R.id.b_anim6)
        anim1.setOnClickListener {
            laAnimation.setAnimation("anim1.json")
            laAnimation.playAnimation()
            tvText1.text="Facebook"
            tvText2.text="fhffjfjfgjfj hfghfjgg gfh hfgh fhgghhfghfh ghfhf fgjhfgh"
        }
        anim2.setOnClickListener {
            laAnimation.setAnimation("animation2.json")
            laAnimation.playAnimation()
            tvText1.text="Loren"
            tvText2.text="fhffjfjfgjfj hfghfjgg gfh hfgh fhgghhfghfh ghfhf fgjhfgh"
        }
        anim3.setOnClickListener {
            laAnimation.setAnimation("anim3.json")
            laAnimation.playAnimation()
            tvText1.text="Loren"
            tvText2.text="fhffjfjfgjfj hfghfjgg gfh hfgh fhgghhfghfh ghfhf fgjhfgh"
        }
        anim4.setOnClickListener {
            laAnimation.setAnimation("anim4.json")
            laAnimation.playAnimation()
            tvText1.text="Loren"
            tvText2.text="fhffjfjfgjfj hfghfjgg gfh hfgh fhgghhfghfh ghfhf fgjhfgh"
        }
        anim5.setOnClickListener {
            laAnimation.setAnimation("anim5.json")
            laAnimation.playAnimation()
            tvText1.text="Loren"
            tvText2.text="fhffjfjfgjfj hfghfjgg gfh hfgh fhgghhfghfh ghfhf fgjhfgh"
        }
        anim6.setOnClickListener {
            laAnimation.setAnimation("anim6.json")
            laAnimation.playAnimation()
            tvText1.text="Loren"
            tvText2.text="fhffjfjfgjfj hfghfjgg gfh hfgh fhgghhfghfh ghfhf fgjhfgh"
        }
    }
}