package com.example.home

import com.example.core.scopes.ActivityScope
import com.example.coreui.di.IComponent
import com.example.coreui.di.IComponentProvider
import com.example.homesettings.SettingsComponent
import dagger.Module
import dagger.Provides
import dagger.Subcomponent


@Subcomponent(modules = [HomeModule::class])
@ActivityScope
interface HomeComponent :
    SettingsComponent,
    IComponent {
    fun inject(homeFragment: HomeFragment)
}

interface HomeComponentProvider : IComponentProvider {
    fun homeComponent(homeModule: HomeModule): HomeComponent
}

@Module
class HomeModule(private val activity: HomeActivity) {

    @Provides
    fun provideHomeActivity(): HomeActivity {
        return activity
    }

    @Provides
    @ActivityScope
    fun provideHomeNavigation(): HomeNavigation {
        return AndroidHomeNavigation(activity)
    }
}
