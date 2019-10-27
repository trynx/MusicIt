package com.musicit.model

import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.widget.ImageView
import android.widget.TextView
import com.musicit.R
import com.musicit.data_model.Scales
import com.musicit.data_model.ScalesType
import kotlin.math.roundToInt

private val scaleMemory = mutableListOf<Scales>()

private var currScalePointer = 0
private var currScaleType = ScalesType.Major
/**
 * Set the next scale depend on a random scale or if
 * the user used "setPrevScale" it will show the scale
 * which was before without generating a new one
 */
fun setNextScale(tvScale: TextView) {
    tvScale.text = nextScale()
}

/**
 * Set the previous scale back saving the current scale
 * for the next time the user uses "setNextScale"
 *
 */
fun setPrevScale(tvScale: TextView) {
    tvScale.text = prevScale()
}

/**
 * Generate the image corresponding to the current scale
 */
fun setScaleImage(imgScale: ImageView, resource: Resources) {
    imgScale.background = nextScaleImg(scaleMemory[currScalePointer].getScale(currScaleType), resource)
}

/**
 * Generate the image corresponding to the current scale
 * and makes the image view visible
 */
fun setFingersPositions(tvLeftHand: TextView, tvRightHand: TextView) {
    tvLeftHand.text = getLeftHandFingers(scaleMemory[currScalePointer].getScale(currScaleType))
    tvRightHand.text = getRightHandFingers(scaleMemory[currScalePointer].getScale(currScaleType))
}

fun checkIsFirstScale() = currScalePointer == 0

fun getCurrScaleType() = currScaleType

fun setScalesType(scalesType: ScalesType){
    currScaleType = scalesType
}

fun updateScaleText(tvScale: TextView){
    tvScale.text = getCurrScale().getScale(currScaleType).getScaleName()
}

private fun nextScaleImg(currScale: Scales, resource: Resources): Drawable? {
    when (currScale) {
        Scales.C -> return resource.getDrawable(R.drawable.ic_scale_c, null)
        Scales.D -> return resource.getDrawable(R.drawable.ic_scale_d, null)
        Scales.E -> return resource.getDrawable(R.drawable.ic_scale_e, null)
        Scales.F -> return resource.getDrawable(R.drawable.ic_scale_f, null)
        Scales.G -> return resource.getDrawable(R.drawable.ic_scale_g, null)
        Scales.A -> return resource.getDrawable(R.drawable.ic_scale_a, null)
        Scales.B -> return resource.getDrawable(R.drawable.ic_scale_b, null)
        Scales.C_SHARP -> return resource.getDrawable(
            R.drawable.ic_scale_c_sharp_d_flat,
            null
        )
        Scales.D_SHARP -> return resource.getDrawable(
            R.drawable.ic_scale_d_sharp_e_flat,
            null
        )
        Scales.F_SHARP -> return resource.getDrawable(
            R.drawable.ic_scale_f_sharp_g_flat,
            null
        )
        Scales.G_SHARP -> return resource.getDrawable(
            R.drawable.ic_scale_g_sharp_a_flat,
            null
        )
        Scales.A_SHARP -> return resource.getDrawable(
            R.drawable.ic_scale_a_sharp_b_flat,
            null
        )
        Scales.D_FLAT -> return resource.getDrawable(
            R.drawable.ic_scale_c_sharp_d_flat,
            null
        )
        Scales.E_FLAT -> return resource.getDrawable(
            R.drawable.ic_scale_d_sharp_e_flat,
            null
        )
        Scales.G_FLAT -> return resource.getDrawable(
            R.drawable.ic_scale_f_sharp_g_flat,
            null
        )
        Scales.A_FLAT -> return resource.getDrawable(
            R.drawable.ic_scale_g_sharp_a_flat,
            null
        )
        Scales.B_FLAT -> return resource.getDrawable(
            R.drawable.ic_scale_a_sharp_b_flat,
            null
        )
        else -> return resource.getDrawable(R.drawable.ic_scale_c, null)
    }
}

private fun getLeftHandFingers(currScale: Scales): String {
    when (currScale) {
        Scales.C -> return Scales.C.getScaleFingeringLeft()
        Scales.D -> return Scales.D.getScaleFingeringLeft()
        Scales.E -> return Scales.E.getScaleFingeringLeft()
        Scales.F -> return Scales.F.getScaleFingeringLeft()
        Scales.G -> return Scales.G.getScaleFingeringLeft()
        Scales.A -> return Scales.A.getScaleFingeringLeft()
        Scales.B -> return Scales.B.getScaleFingeringLeft()
        Scales.C_SHARP -> return Scales.C_SHARP.getScaleFingeringLeft()
        Scales.D_SHARP -> return Scales.D_SHARP.getScaleFingeringLeft()
        Scales.F_SHARP -> return Scales.F_SHARP.getScaleFingeringLeft()
        Scales.G_SHARP -> return Scales.G_SHARP.getScaleFingeringLeft()
        Scales.A_SHARP -> return Scales.A_SHARP.getScaleFingeringLeft()
        Scales.D_FLAT -> return Scales.D_FLAT.getScaleFingeringLeft()
        Scales.E_FLAT -> return Scales.E_FLAT.getScaleFingeringLeft()
        Scales.G_FLAT -> return Scales.G_FLAT.getScaleFingeringLeft()
        Scales.A_FLAT -> return Scales.A_FLAT.getScaleFingeringLeft()
        Scales.B_FLAT -> return Scales.B_FLAT.getScaleFingeringLeft()

        else -> return "None"
    }
}
private fun getRightHandFingers(currScale: Scales): String {
    when (currScale) {
        Scales.C -> return Scales.C.getScaleFingeringRight()
        Scales.D -> return Scales.D.getScaleFingeringRight()
        Scales.E -> return Scales.E.getScaleFingeringRight()
        Scales.F -> return Scales.F.getScaleFingeringRight()
        Scales.G -> return Scales.G.getScaleFingeringRight()
        Scales.A -> return Scales.A.getScaleFingeringRight()
        Scales.B -> return Scales.B.getScaleFingeringRight()
        Scales.C_SHARP -> return Scales.C_SHARP.getScaleFingeringRight()
        Scales.D_SHARP -> return Scales.D_SHARP.getScaleFingeringRight()
        Scales.F_SHARP -> return Scales.F_SHARP.getScaleFingeringRight()
        Scales.G_SHARP -> return Scales.G_SHARP.getScaleFingeringRight()
        Scales.A_SHARP -> return Scales.A_SHARP.getScaleFingeringRight()
        Scales.D_FLAT -> return Scales.D_FLAT.getScaleFingeringRight()
        Scales.E_FLAT -> return Scales.E_FLAT.getScaleFingeringRight()
        Scales.G_FLAT -> return Scales.G_FLAT.getScaleFingeringRight()
        Scales.A_FLAT -> return Scales.A_FLAT.getScaleFingeringRight()
        Scales.B_FLAT -> return Scales.B_FLAT.getScaleFingeringRight()

        else -> return "None"
    }
}

private fun nextScale(): String {
    if (currScalePointer < scaleMemory.size - 1) {
        return scaleMemory[++currScalePointer].getScale(currScaleType).getScaleName()
    }

    return randomScale()
}


private fun prevScale(): String {
    if (currScalePointer <= scaleMemory.size - 1 && currScalePointer != 0) {
        currScalePointer--
    }

    return scaleMemory[currScalePointer].getScale(currScaleType).getScaleName()
}

private fun randomScale(): String {
    val duplicateBlock = 5
    var duplicateScale = true
    var scale = Scales.C

    // Always sync the pointer with the last item that was added
    currScalePointer++

    while (duplicateScale) {
        scale = getRandomScale()

        if (scaleMemory.isEmpty()) {
            // To keep the scale index base, first item to add
            currScalePointer--
            break
        }
        // Check if the scale was already selected in the last *duplicateBlock* attempts
        for (i in 0..duplicateBlock) {
            // Don't get under the index possible for the list
            if (scaleMemory.size <= i) break

            if (scale.getScale(currScaleType).getScaleName() == (scaleMemory[scaleMemory.size - 1 - i].getScale(currScaleType).getScaleName())) {
                duplicateScale = true
                break
            } else {
                duplicateScale = false
            }
        }
    }

    scaleMemory.add(scale)

    return scaleMemory.last().getScale(currScaleType).getScaleName()
}

private fun getRandomScale(): Scales {
    val scaleArr = enumValues<Scales>()

    return scaleArr[(Math.random() * (scaleArr.size - 1)).roundToInt()]
}

private fun getCurrScale(): Scales{
    return scaleMemory[currScalePointer]
}