package com.example.modulesapp.di

import android.widget.Toast
import com.example.coreui.BaseActivity
import com.example.login.LoginNavigation
import javax.inject.Inject

class AndroidLoginNavigation @Inject constructor(private val baseActivity: BaseActivity) : LoginNavigation {
    override fun openHome() {
        Toast.makeText(baseActivity, "openHome", Toast.LENGTH_SHORT).show()
    }
}