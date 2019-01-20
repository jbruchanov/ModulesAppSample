package com.example.reg

import com.example.core.scopes.ActivityScope
import com.example.coreui.di.IComponent
import com.example.coreui.di.IComponentProvider
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

@Subcomponent(modules = [RegistrationModule::class])
@ActivityScope
interface RegistrationComponent : IComponent {
    fun inject(activity: RegistrationActivity)
    fun inject(fragment: RegistrationFragment)
    fun inject(welcomeFragment: WelcomeFragment)
    fun inject(regJavaFragment: RegJavaFragment)
}


interface RegistrationComponentProvider : IComponentProvider {
    fun registrationComponent(module: RegistrationModule): RegistrationComponent
}

@Module
class RegistrationModule(private val activity: RegistrationActivity) {

    @Provides
    fun provideRegistrationActivity(): RegistrationActivity {
        return activity
    }

    @Provides
    @ActivityScope
    fun provideRegistrationNavigation(registrationActivity: RegistrationActivity): RegistrationNavigation {
        return AndroidRegistrationNavigation(registrationActivity)
    }
}