package com.example.reg

import android.os.Bundle
import com.example.coreui.BasePresentationFragment
import com.example.coreui.BasePresenter
import com.example.coreui.di.AndroidInjector
import javax.inject.Inject

class RegistrationFragment @Inject constructor() : BasePresentationFragment<RegistrationPresenter>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjector
            .component(this, RegistrationComponent::class.java)
            .inject(this)
    }
}

class RegistrationPresenter @Inject constructor() : BasePresenter()