package com.musicit.model

import android.widget.TextView
import kotlin.math.roundToInt

private val scaleMemory = mutableListOf<String>()
private var currScalePointer = 0


fun setNextScale(tvScale: TextView){
    tvScale.text = nextScale()
}

fun setPrevScale(tvScale: TextView){
    tvScale.text = prevScale()
}

private fun nextScale(): String{

    if (currScalePointer < scaleMemory.size - 1){
        return scaleMemory[++currScalePointer]
    }

    return randomScale()
}


private fun prevScale(): String{

    if(currScalePointer <= scaleMemory.size - 1 && currScalePointer != 0){
        currScalePointer--
    }

    return scaleMemory[currScalePointer]
}

private fun randomScale(): String {
    val duplicateBlock = 5
    var duplicateScale = true
    var scale = ""

    // Always sync the pointer with the last item that was added
    currScalePointer++

    while(duplicateScale){
        scale = getRandomScale()

        if(scaleMemory.isEmpty()){
            // To keep it index base, first item to add
            currScalePointer--
            duplicateScale = false
            break
        }
        // Check if the scale was already selected in the last *duplicateBlock* attempts
        for(i in 0..duplicateBlock){
            // Don't get under the index possible for the list
            if(scaleMemory.size <= i) break

            if(scale.equals(scaleMemory[scaleMemory.size - 1 - i])){
                duplicateScale = true
                break
            }
            else {
                duplicateScale = false
            }
        }
    }


    scaleMemory.add(scale)

    return scaleMemory.last()
}

private fun getRandomScale(): String{
    val scaleArr = arrayOf(
        "C", "C#", "Db", "D", "D#", "Eb",
        "E", "F", "F#", "Gb", "G", "G#", "Ab", "A", "A#", "Bb", "B"
    )


    return scaleArr[(Math.random() * (scaleArr.size - 1)).roundToInt()]
}