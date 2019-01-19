package com.example.dynamicfeature

import android.content.Context
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
    lateinit var core: SecurityCore

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        AndroidInjector
            .component(this, DynamicFeatureComponent::class.java)
            .inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return FrameLayout(inflater.context)
    }
}