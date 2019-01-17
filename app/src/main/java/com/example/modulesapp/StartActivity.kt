package com.example.modulesapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.coreui.BaseActivity
import com.example.login.LoginActivity
import com.example.reg.RegistrationActivity
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest

class StartActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val register = true
        if (register) {
            startActivity(Intent(this, RegistrationActivity::class.java))
        } else {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        finish()
    }
}