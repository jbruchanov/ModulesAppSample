package com.example.dynamicfeature

import android.os.Bundle
import com.example.core.Logger
import com.example.core.SecurityCore
import com.example.coreui.BaseActivity
import com.example.coreui.di.HasComponent
import com.example.coreui.di.IBaseActivityComponentProvider
import com.example.home.R
import com.example.ui_dynamic_feature_deps.DynamicFeatureDependencies
import javax.inject.Inject

class DynamicFeatureActivity : BaseActivity(), HasComponent<DynamicFeatureComponent> {


    private val _component: DynamicFeatureComponent by lazy {
        val dynamicFeatureDependencies =
            (application as IBaseActivityComponentProvider).provideBaseActivityComponent(this)
                    as DynamicFeatureDependencies

        DaggerDynamicFeatureComponent
            .builder()
            .dynamicFeatureDependencies(dynamicFeatureDependencies)
            .dynamicFeatureModule(DynamicFeatureModule(this))
            .build()
    }

    override val component: DynamicFeatureComponent get() = _component

    @Inject
    lateinit var logger: Logger
    @Inject
    lateinit var core: SecurityCore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        component.inject(this)

        supportFragmentManager.apply {
            if (findFragmentById(R.id.fragment_container) == null) {
                beginTransaction()
                    .add(R.id.fragment_container, DynamicFeatureFragment())
                    .commit()
            }
        }
    }
}