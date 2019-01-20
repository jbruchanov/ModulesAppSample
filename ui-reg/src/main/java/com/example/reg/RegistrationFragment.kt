package com.example.reg

import com.example.coreui.BasePresentationFragment
import com.example.coreui.BasePresenter
import com.example.coreui.di.AndroidInjector
import javax.inject.Inject

class RegistrationFragment @Inject constructor() : BasePresentationFragment<RegistrationPresenter>() {

    @Inject
    override lateinit var presenter: RegistrationPresenter

    override fun inject() {
        AndroidInjector
            .component(this, RegistrationComponent::class.java)
            .inject(this)
    }
}

class RegistrationPresenter @Inject constructor() : BasePresenter()