package com.example.home

import com.example.core.Logger
import com.example.core.SecurityCore
import com.example.coreui.BasePresenter
import javax.inject.Inject

class HomePresenter @Inject constructor() : BasePresenter() {

    @Inject
    lateinit var homeNavigation: HomeNavigation
    @Inject
    lateinit var core: SecurityCore
    @Inject
    lateinit var logger: Logger

    override fun onResume() {
        super.onResume()
        logger.log("HomePresenter#onResume")
    }

    fun openSettingsClick() {
        core.doSomething()
        homeNavigation.openSettings()
    }
}