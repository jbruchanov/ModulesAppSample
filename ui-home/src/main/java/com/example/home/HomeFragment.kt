package com.example.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.core.SecurityCore
import com.example.coreui.BasePresentationFragment
import com.example.coreui.di.AndroidInjector
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

class HomeFragment : BasePresentationFragment<HomePresenter>() {

    @Inject
    override lateinit var presenter: HomePresenter

    @Inject
    lateinit var core: SecurityCore

    override fun inject() {
        AndroidInjector
            .component(this, HomeComponent::class.java)
            .inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        open_settings.setOnClickListener { presenter.openSettingsClick() }
        core.doSomething()
    }
}