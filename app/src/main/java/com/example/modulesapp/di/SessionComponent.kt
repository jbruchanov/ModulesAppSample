package com.example.modulesapp.di

import com.example.core.scopes.SessionScope
import com.example.coreui.di.IComponent
import dagger.Subcomponent

@Subcomponent
@SessionScope
interface SessionComponent : IComponent {
    fun baseActivityComponent(module: BaseActivityModule): BaseActivityComponent
}