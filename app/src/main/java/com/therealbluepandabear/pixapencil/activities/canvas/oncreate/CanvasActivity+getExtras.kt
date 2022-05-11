package com.therealbluepandabear.pixapencil.activities.canvas.oncreate

import com.therealbluepandabear.pixapencil.activities.canvas.CanvasActivity
import com.therealbluepandabear.pixapencil.activities.canvas.height
import com.therealbluepandabear.pixapencil.activities.canvas.index
import com.therealbluepandabear.pixapencil.activities.canvas.width
import com.therealbluepandabear.pixapencil.utility.StringConstants

fun CanvasActivity.getExtras() {
    index = intent.getIntExtra(StringConstants.Extras.IndexExtra, -1)
    title = intent.getStringExtra(StringConstants.Extras.ProjectTitleExtra)
    width = intent.getIntExtra(StringConstants.Extras.WidthExtra, width)
    height = intent.getIntExtra(StringConstants.Extras.HeightExtra, width)

    if (title != null) {
        projectTitle = title.toString()
    } else {
        title = "Unnamed Project"
    }
}