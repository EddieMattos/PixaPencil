package com.therealbluepandabear.pixapencil.customviews.pixelgridview

import com.therealbluepandabear.pixapencil.activities.canvas.sharedPreferenceObject
import com.therealbluepandabear.pixapencil.fragments.canvas.pixelGridViewInstance
import com.therealbluepandabear.pixapencil.utility.StringConstants

fun extendedApplyPixelPerfectValueFromPreference() {
    if (sharedPreferenceObject.contains(StringConstants.SharedPreferencePixelPerfectIdentifier)) {
        pixelGridViewInstance.pixelPerfectMode = sharedPreferenceObject.getBoolean(
            StringConstants.SharedPreferencePixelPerfectIdentifier, false)
    }
}
