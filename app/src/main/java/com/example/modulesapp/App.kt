package com.example.modulesapp

import android.app.Application
import com.example.core.Logger
import com.example.coreui.BaseActivity
import com.example.coreui.di.IBaseActivityComponentProvider
import com.example.modulesapp.di.AppModule
import com.example.modulesapp.di.BaseActivityComponent
import com.example.modulesapp.di.BaseActivityModule
import com.example.modulesapp.di.DaggerAppComponent
import javax.inject.Inject

class App : Application(), IBaseActivityComponentProvider {

    override fun provideBaseActivityComponent(baseActivity: BaseActivity): BaseActivityComponent {
        return sessionComponent.baseActivityComponent(BaseActivityModule(baseActivity))
    }

    @Inject
    internal lateinit var logger: Logger

    private val appComponent by lazy {
        DaggerAppComponent
            .builder()
            .appModule(AppModule(this))
            .build()
    }

    private val sessionComponent by lazy { appComponent.sessionComponent() }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
        logger.log("app start")
    }
}