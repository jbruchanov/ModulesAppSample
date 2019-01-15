package com.example.modulesapp

import android.app.Application
import com.example.core.Logger
import com.example.modulesapp.di.AppModule
import com.example.modulesapp.di.DaggerAppComponent
import javax.inject.Inject

class App : Application() {

    @Inject
    internal lateinit var logger: Logger

    private val appComponent by lazy {
        DaggerAppComponent
            .builder()
            .appModule(AppModule(this))
            .build()
    }

    val sessionComponent by lazy { appComponent.sessionCompomonent() }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
        logger.log("app start")
    }
}