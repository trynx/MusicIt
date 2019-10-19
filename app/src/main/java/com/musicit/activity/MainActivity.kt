package com.musicit.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.musicit.R
import com.musicit.model.setPrevScale
import com.musicit.model.setNextScale
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupButtons()
    }

    override fun onResume() {
        super.onResume()
        setNextScale(tv_scale)

    }

    private fun setupButtons() {
        btn_next_scale.setOnClickListener{
            setNextScale(tv_scale)
        }

        btn_prev_scale.setOnClickListener{
            setPrevScale(tv_scale)
        }
    }


}
