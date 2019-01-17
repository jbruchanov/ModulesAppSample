package com.example.homesettings

import com.example.core.Logger
import com.example.core.SecurityCore
import com.example.coreui.BasePresenter
import javax.inject.Inject

class SettingsPresenter @Inject constructor() : BasePresenter() {
    @Inject
    lateinit var core: SecurityCore
    @Inject
    lateinit var logger: Logger

    override fun onResume() {
        super.onResume()
        core.doSomething()
    }
}