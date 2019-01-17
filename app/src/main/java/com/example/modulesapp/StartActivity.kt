package com.example.modulesapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.coreui.BaseActivity
import com.example.login.LoginActivity
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest

class StartActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val register = true
        if (register) {
            SplitInstallManagerFactory.create(this).let { manager ->
                val installedModules = manager.getInstalledModules()
                val request = SplitInstallRequest.newBuilder()
                    .addModule("ui_reg")
                    .build()
                manager.startInstall(request)
                    .addOnSuccessListener { sessionId ->
                        val regActivity = Class.forName("com.example.reg.RegistrationActivity")
                        startActivity(Intent(this, regActivity))
                    }.addOnFailureListener {
                        it.printStackTrace()
                    }
            }
        } else {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        finish()
    }
}