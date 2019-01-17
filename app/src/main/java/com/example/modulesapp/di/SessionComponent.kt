package com.example.modulesapp.di

import com.example.coreui.di.IComponent
import com.example.coreui.di.SessionScope
import dagger.Subcomponent

@Subcomponent
@SessionScope
interface SessionComponent : IComponent {
    fun baseActivityComponent(module: BaseActivityModule): BaseActivityComponent
}