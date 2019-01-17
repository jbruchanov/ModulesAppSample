package com.example.modulesapp.di

import android.app.Application
import android.content.Context
import com.example.core.scopes.AppScope
import com.example.core.Logger
import com.example.coreui.utils.AndroidLogger
import com.example.coreui.utils.AndroidResHelper
import com.example.coreui.utils.ResHelper
import com.example.login.LoginNavigation
import com.example.modulesapp.App
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Provides

@Component(modules = [AppModule::class, AppBinderModule::class])
@AppScope
interface AppComponent {
    fun inject(app: App)

    fun sessionComponent(): SessionComponent
}


@Module
class AppModule(private val app: Application) {
    @Provides
    fun provideContext(): Context = app
}

@Module
abstract class AppBinderModule {
    @Binds
    abstract fun provideLogger(logger: AndroidLogger): Logger

    @Binds
    abstract fun provideResHeler(resHelper: AndroidResHelper): ResHelper
}