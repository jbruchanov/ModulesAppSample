package com.example.dynamicfeature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.example.core.SecurityCore
import com.example.coreui.BasePresentationFragment
import com.example.coreui.di.AndroidInjector
import javax.inject.Inject

class DynamicFeatureFragment : BasePresentationFragment<DynamicFeaturePresenter>() {

    @Inject
    override lateinit var presenter: DynamicFeaturePresenter
    @Inject
    lateinit var core: SecurityCore

    override fun inject() {
        AndroidInjector
            .component(this, DynamicFeatureComponent::class.java)
            .inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return FrameLayout(inflater.context)
    }
}