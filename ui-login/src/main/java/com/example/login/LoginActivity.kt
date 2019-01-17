package com.example.login

import android.os.Bundle
import com.example.coreui.BaseActivity
import com.example.coreui.di.AndroidInjector
import com.example.coreui.di.HasComponent

class LoginActivity : BaseActivity(), HasComponent<LoginComponent> {

    private val _component: LoginComponent by lazy {
        AndroidInjector
            .componentProvider(this, LoginComponentProvider::class.java)
            .loginComponent()
    }

    override val component: LoginComponent get() = _component

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.apply {
            if (findFragmentById(R.id.fragment_container) == null) {
                beginTransaction()
                    .add(R.id.fragment_container, LoginFragment())
                    .commit()
            }
        }
    }
}