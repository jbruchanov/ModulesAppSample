package com.example.dynamicfeature

import com.example.core.scopes.AppScope
import com.example.coreui.di.IComponent
import com.example.ui_dynamic_feature_deps.DynamicFeatureDependencies
import dagger.Component
import dagger.Module
import dagger.Provides

@Component(dependencies = [DynamicFeatureDependencies::class], modules = [DynamicFeatureModule::class])
@AppScope
interface DynamicFeatureComponent : IComponent {
    fun inject(dynamicFeatureActivity: DynamicFeatureActivity)
    fun inject(dynamicFeatureFragment: DynamicFeatureFragment)
}

@Module
class DynamicFeatureModule(private val dynamicFeatureActivity: DynamicFeatureActivity) {

    @AppScope
    @Provides
    fun provideNavigation(): DynamicFeatureNavigation {
        return AndroidDynamicNavigation(dynamicFeatureActivity)
    }

}


