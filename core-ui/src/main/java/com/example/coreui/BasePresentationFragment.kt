package com.example.coreui

import javax.inject.Inject

abstract class BasePresentationFragment<T : BasePresenter> : BaseFragment() {

    @Inject
    protected lateinit var presenter: T

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun onPause() {
        presenter.onPause()
        super.onPause()
    }
}