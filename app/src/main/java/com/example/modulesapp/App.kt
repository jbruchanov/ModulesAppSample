package com.example.modulesapp

import android.app.Application
import com.example.core.Logger
import com.example.coreui.di.HasComponent
import com.example.modulesapp.di.AppModule
import com.example.modulesapp.di.DaggerAppComponent
import com.example.modulesapp.di.SessionComponent
import javax.inject.Inject

class App : Application(), HasComponent<SessionComponent> {

    @Inject
    internal lateinit var logger: Logger

    private val appComponent by lazy {
        DaggerAppComponent
            .builder()
            .appModule(AppModule(this))
            .build()
    }

    private val _sessionComponent by lazy { appComponent.sessionCompomonent() }
    override val component: SessionComponent get() = _sessionComponent

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
        logger.log("app start")
    }
}