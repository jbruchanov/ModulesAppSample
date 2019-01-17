package com.example.homesettings

import com.example.core.scopes.ActivityScope
import com.example.coreui.di.IComponent
import com.example.coreui.di.IComponentProvider
import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface SettingsComponent : IComponent {
    fun inject(settingsFragment: SettingsFragment)
}

interface SettingsComponentProvider : IComponentProvider {
    fun settingsComponent() : SettingsComponent
}