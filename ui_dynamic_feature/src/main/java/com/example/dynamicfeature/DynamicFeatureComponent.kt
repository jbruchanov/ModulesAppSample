package com.example.dynamicfeature

import com.example.core.scopes.AppScope
import com.example.coreui.di.IComponent
import com.example.ui_dynamic_feature_deps.DynamicFeatureDependencies
import dagger.Component

@Component(dependencies = [DynamicFeatureDependencies::class])
@AppScope
interface DynamicFeatureComponent : IComponent {
    fun inject(dynamicFeatureActivity: DynamicFeatureActivity)
    fun inject(dynamicFeatureFragment: DynamicFeatureFragment)
}