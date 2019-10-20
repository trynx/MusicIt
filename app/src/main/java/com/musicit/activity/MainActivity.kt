package com.musicit.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.musicit.R
import com.musicit.model.setPrevScale
import com.musicit.model.setNextScale
import com.musicit.model.setScaleImg
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupButtons()
        startScale()
    }

    private fun startScale() {
        btn_next_scale.callOnClick()
    }

    private fun setupButtons() {
        btn_next_scale.setOnClickListener {
            setNextScale(tv_scale)
            setScaleImg(tv_scale.text.toString(), img_piano, this.resources)
        }

        btn_prev_scale.setOnClickListener {
            setPrevScale(tv_scale)
            setScaleImg(tv_scale.text.toString(), img_piano, this.resources)

        }
    }


}
