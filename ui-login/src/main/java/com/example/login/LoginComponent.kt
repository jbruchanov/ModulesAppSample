package com.example.login

import com.example.coreui.di.ActivityScope
import com.example.coreui.di.IComponent
import com.example.coreui.di.IComponentProvider
import dagger.Subcomponent

interface LoginComponentProvider : IComponentProvider {
    fun provideLoginComponent(): LoginComponent
}

@ActivityScope
@Subcomponent
interface LoginComponent : IComponent {
    fun inject(loginFragment: LoginFragment)
}