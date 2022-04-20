package com.therealbluepandabear.pixapencil.activities.main

import android.content.Context
import com.therealbluepandabear.pixapencil.extensions.showSimpleInfoDialog
import com.therealbluepandabear.pixapencil.utility.StringConstants

fun MainActivity.showWelcomeScreenIfApplicable() {
    sharedPreferenceObject = this.getPreferences(Context.MODE_PRIVATE)

    if (sharedPreferenceObject.contains(StringConstants.SharedPreferenceFirstLaunchIdentifier)) {
        firstLaunch = false
        firstLaunch = sharedPreferenceObject.getBoolean(StringConstants.SharedPreferenceFirstLaunchIdentifier, false)
    } else {
        with(sharedPreferenceObject.edit()) {
            putBoolean(StringConstants.SharedPreferenceFirstLaunchIdentifier, true)
            apply()
        }

        showSimpleInfoDialog(
            "Welcome",
            "Welcome to PixaPencil! Tap and hold on each tool's icon to get further information on how the specific tool works."
        )
    }
}