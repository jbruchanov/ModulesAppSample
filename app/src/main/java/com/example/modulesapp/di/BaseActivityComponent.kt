package com.example.modulesapp.di

import com.example.core.scopes.BaseActivityScope
import com.example.coreui.BaseActivity
import com.example.coreui.di.IComponent
import com.example.home.HomeComponentProvider
import com.example.homesettings.SettingsComponentProvider
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
    HomeComponentProvider,
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