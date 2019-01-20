package com.example.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coreui.BasePresentationFragment
import com.example.coreui.di.AndroidInjector
import kotlinx.android.synthetic.main.fragment_login.*
import javax.inject.Inject

class LoginFragment : BasePresentationFragment<LoginPresenter>() {

    @Inject
    override lateinit var presenter: LoginPresenter

    @Inject
    lateinit var navigation: LoginNavigation

    override fun inject() {
        AndroidInjector
            .component(this, LoginComponent::class.java)
            .inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        login_continue.setOnClickListener { navigation.openHome() }
    }
}