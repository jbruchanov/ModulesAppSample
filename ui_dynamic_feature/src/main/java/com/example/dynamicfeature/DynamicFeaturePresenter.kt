package com.example.dynamicfeature

import com.example.core.Logger
import com.example.coreui.BasePresenter
import javax.inject.Inject

class DynamicFeaturePresenter @Inject constructor() : BasePresenter() {

    @Inject
    lateinit var logger: Logger

    @Inject
    lateinit var navigation: DynamicFeatureNavigation

    override fun onResume() {
        super.onResume()
        logger.log("DynamicFeaturePresenter")
        navigation.navigateSomewhere()
    }
}
