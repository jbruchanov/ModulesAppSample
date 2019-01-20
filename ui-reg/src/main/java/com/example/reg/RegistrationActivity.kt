package com.example.reg

import android.os.Bundle
import com.example.coreui.BaseActivity
import com.example.coreui.di.AndroidInjector
import com.example.coreui.di.HasComponent
import javax.inject.Inject

class RegistrationActivity : BaseActivity(), HasComponent<RegistrationComponent> {

    private val _component: RegistrationComponent by lazy {
        AndroidInjector
            .componentProvider(this, RegistrationComponentProvider::class.java)
            .registrationComponent(RegistrationModule(this))
    }

    override val component: RegistrationComponent get() = _component
    @Inject
    lateinit var navigation: RegistrationNavigation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AndroidInjector
            .component(this, RegistrationComponent::class.java)
            .inject(this)

        supportFragmentManager.apply {
            if (findFragmentById(R.id.fragment_container) == null) {
                navigation.navigateToJavaFragment()
            }
        }
    }
}