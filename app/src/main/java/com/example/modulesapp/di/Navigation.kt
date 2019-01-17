package com.example.modulesapp.di

import android.content.Intent
import android.widget.Toast
import com.example.coreui.BaseActivity
import com.example.home.HomeActivity
import com.example.login.LoginActivity
import com.example.login.LoginNavigation
import javax.inject.Inject

class AndroidLoginNavigation @Inject constructor(private val baseActivity: BaseActivity) : LoginNavigation {
    override fun openHome() {
        baseActivity.startActivity(Intent(baseActivity, HomeActivity::class.java))
        baseActivity.finish()
    }
}