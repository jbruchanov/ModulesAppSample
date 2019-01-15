package com.example.login

import com.example.coreui.BasePresenter
import javax.inject.Inject

class LoginPresenter @Inject constructor() : BasePresenter() {

    lateinit var navigation: LoginNavigation
}