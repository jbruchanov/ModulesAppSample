package com.example.dynamicfeature

import com.example.core.Logger
import com.example.coreui.BasePresenter
import javax.inject.Inject

class DynamicFeaturePresenter @Inject constructor() : BasePresenter() {

    @Inject
    lateinit var logger: Logger

    override fun onResume() {
        super.onResume()
        logger.log("DynamicFeaturePresenter")
    }
}
