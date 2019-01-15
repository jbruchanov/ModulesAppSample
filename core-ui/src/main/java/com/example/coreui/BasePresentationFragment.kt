package com.example.coreui

abstract class BasePresentationFragment<T : BasePresenter> : BaseFragment() {

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