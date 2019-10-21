package com.musicit.view.activity

import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GestureDetectorCompat
import com.musicit.R
import com.musicit.model.setNextScale
import com.musicit.model.setPrevScale
import com.musicit.model.setScaleImg
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var detectorPrevScale: GestureDetectorCompat
    private lateinit var detectorNextScale: GestureDetectorCompat

    private lateinit var prevScaleGestureDetector: GestureDetector.SimpleOnGestureListener
    private lateinit var nextScaleGetectorNextScale: GestureDetector.SimpleOnGestureListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpGestureDetectors()
        setupButtons()
        startScale()
    }

    private fun setUpGestureDetectors() {
        prevScaleGestureDetector = object : GestureDetector.SimpleOnGestureListener() {
            override fun onDown(e: MotionEvent?): Boolean {
                return true
            }

            override fun onSingleTapUp(e: MotionEvent?): Boolean {
                setPrevScale()
                return true
            }

            override fun onScroll(
                e1: MotionEvent?,
                e2: MotionEvent?,
                distanceX: Float,
                distanceY: Float
            ): Boolean {
                scrollAction(e1, e2)
                return true
            }
        }

        nextScaleGetectorNextScale = object : GestureDetector.SimpleOnGestureListener() {
            override fun onDown(e: MotionEvent?): Boolean {
                return true
            }

            override fun onSingleTapUp(e: MotionEvent?): Boolean {
                setNextScale()
                return true
            }

            override fun onScroll(
                e1: MotionEvent?,
                e2: MotionEvent?,
                distanceX: Float,
                distanceY: Float
            ): Boolean {
                scrollAction(e1, e2)
                return true
            }
        }
    }

    private fun scrollAction(e1: MotionEvent?,
                              e2: MotionEvent?){
        var tempStartY = 0f
        var tempEndY = 0f

        e1?.let { tempStartY = it.y }
        e2?.let { tempEndY = it.y }

        // Scroll up action was done
        if(tempStartY > tempEndY + 50f){
            setScaleImg(tv_scale.text.toString(), img_piano, applicationContext.resources)
            img_piano.visibility = View.VISIBLE
        }
    }

    private fun setNextScale(){
        setNextScale(tv_scale)
        img_piano.visibility = View.GONE
    }

    private fun setPrevScale(){
        setPrevScale(tv_scale)
        img_piano.visibility = View.GONE
    }

    private fun setupButtons() {
        detectorPrevScale = GestureDetectorCompat(this, prevScaleGestureDetector)
        detectorNextScale = GestureDetectorCompat(this, nextScaleGetectorNextScale)


        btn_prev_scale.setOnTouchListener { _, event -> detectorPrevScale.onTouchEvent(event) }
        btn_next_scale.setOnTouchListener { _, event -> detectorNextScale.onTouchEvent(event) }
    }

    private fun startScale() {
        setNextScale()
    }



}
