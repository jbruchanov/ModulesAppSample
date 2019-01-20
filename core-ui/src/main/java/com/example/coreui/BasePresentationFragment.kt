package com.example.coreui

import android.content.Context

abstract class BasePresentationFragment<T : BasePresenter> : BaseFragment() {

    abstract var presenter: T

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        inject()
    }

    abstract fun inject()

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun onPause() {
        presenter.onPause()
        super.onPause()
    }
}