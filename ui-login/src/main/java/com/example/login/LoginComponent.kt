package com.example.login

import com.example.core.scopes.ActivityScope
import com.example.coreui.di.IComponent
import com.example.coreui.di.IComponentProvider
import dagger.Subcomponent

interface LoginComponentProvider : IComponentProvider {
    fun loginComponent(): LoginComponent
}

@ActivityScope
@Subcomponent
interface LoginComponent : IComponent {
    fun inject(loginFragment: LoginFragment)
}