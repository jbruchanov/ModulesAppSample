package com.example.homesettings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.core.Logger
import com.example.coreui.BasePresentationFragment
import com.example.coreui.di.AndroidInjector
import kotlinx.android.synthetic.main.fragment_settings.*
import javax.inject.Inject

class SettingsFragment : BasePresentationFragment<SettingsPresenter>() {

    @Inject
    override lateinit var presenter: SettingsPresenter

    @Inject
    lateinit var logger: Logger

    override fun inject() {
        AndroidInjector
            .component(this, SettingsComponent::class.java)
            .inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return layoutInflater.inflate(R.layout.fragment_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        go_back.setOnClickListener { fragmentManager?.popBackStack() }
    }

    override fun onResume() {
        super.onResume()
        logger.log("SettingsFragment#onResume")
    }
}