package com.example.coreui.utils

import android.content.Context
import com.example.coreui.R
import javax.inject.Inject

interface ResHelper {
    val appName: String
}

class AndroidResHelper @Inject constructor(context: Context) : ResHelper {
    override var appName: String = context.resources.getString(R.string.app_name)
}