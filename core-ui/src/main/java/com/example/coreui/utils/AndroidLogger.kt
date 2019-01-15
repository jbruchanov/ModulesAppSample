package com.example.coreui.utils

import android.util.Log
import com.example.core.Logger
import javax.inject.Inject

class AndroidLogger @Inject constructor() : Logger {
    override fun log(msg: String) {
        Log.d("AndroidLogger", msg)
    }
}
