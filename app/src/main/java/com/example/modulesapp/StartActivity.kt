package com.example.modulesapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.coreui.BaseActivity
import com.example.login.LoginActivity
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import com.google.android.play.core.splitinstall.SplitInstallRequest
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_start)

        login.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

        dynamic_feature.setOnClickListener {
            SplitInstallManagerFactory.create(this).apply {
                val request = SplitInstallRequest.newBuilder()
                    .addModule("ui_dynamic_feature")
                    .build()

                startInstall(request)
                    .addOnSuccessListener {
                        startActivity(Intent().apply {
                            setClassName(this@StartActivity, "com.example.dynamicfeature.DynamicFeatureActivity")
                        })
                    }
                    .addOnFailureListener {
                        it.printStackTrace()
                        Toast.makeText(this@StartActivity, it.message ?: "Null", Toast.LENGTH_LONG).show()
                    }
            }
        }
    }
}