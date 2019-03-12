package com.sibyl.apktry

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.util.Pair
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPair: Pair<View,String> = Pair.create(tv,"titleTv")

        tv.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java),
                    ActivityOptions.makeSceneTransitionAnimation(this@MainActivity,viewPair).toBundle())
        }



    }
}
