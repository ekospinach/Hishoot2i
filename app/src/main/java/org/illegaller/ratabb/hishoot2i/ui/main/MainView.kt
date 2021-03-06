package org.illegaller.ratabb.hishoot2i.ui.main

import android.graphics.Bitmap
import android.net.Uri
import android.support.annotation.ColorInt
import org.illegaller.ratabb.hishoot2i.ui.common.Mvp

interface MainView : Mvp.View {
    fun preview(bitmap: Bitmap)
    fun save(bitmap: Bitmap, uri: Uri)
    fun startSave()
    fun errorSave(e: Throwable)
    fun showProgress()
    fun hideProgress()
    fun startingPipette(@ColorInt srcColor: Int)
}