package com.example.reg

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coreui.BasePresentationFragment
import com.example.coreui.BasePresenter
import kotlinx.android.synthetic.main.fragment_welcome.*
import javax.inject.Inject

class WelcomeFragment : BasePresentationFragment<WelcomePresenter>() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        register.setOnClickListener { presenter.onRegisterClick() }
    }
}

class WelcomePresenter : BasePresenter() {

    @Inject
    lateinit var navigation: RegistrationNavigation

    fun onRegisterClick() {
        navigation.navigateToRegistration()
    }
}
