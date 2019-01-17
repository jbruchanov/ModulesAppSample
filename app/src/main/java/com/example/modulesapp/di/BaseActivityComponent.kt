package com.example.modulesapp.di

import com.example.coreui.BaseActivity
import com.example.coreui.di.BaseActivityScope
import com.example.coreui.di.IComponent
import com.example.login.LoginComponentProvider
import com.example.login.LoginNavigation
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

@Subcomponent(modules = [BaseActivityModule::class, NavigationBinder::class])
@BaseActivityScope
interface BaseActivityComponent :
    LoginComponentProvider,
    IComponent

@Module
class BaseActivityModule(private val activity: BaseActivity) {

    @Provides
    fun provideBaseActivity(): BaseActivity {
        return activity
    }
}

@Module
abstract class NavigationBinder {
    @Binds
    abstract fun provideLoginNavigation(loginNavigation: AndroidLoginNavigation): LoginNavigation
}