package com.therealbluepandabear.pixapencil.activities.canvas

import com.therealbluepandabear.pixapencil.R
import com.therealbluepandabear.pixapencil.enums.SnackbarDuration
import com.therealbluepandabear.pixapencil.extensions.showSnackbarWithAction
import com.therealbluepandabear.pixapencil.utility.StringConstants

fun CanvasActivity.showShadingToolTip() {
    binding.activityCanvasRootLayout.showSnackbarWithAction(
        getString(R.string.shading_tool_tool_tip_in_code_str),
        SnackbarDuration.Medium,
        getString(R.string.tool_tip_dont_show_again_in_code_str)
    ) {
        with(sharedPreferenceObject.edit()) {
            putBoolean(
                StringConstants.Identifiers.SharedPreferenceShowShadingToolTipIdentifier,
                false
            )
            apply()
        }
        applyShowShadingToolTipValueFromPreference()
    }
}