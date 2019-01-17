package com.example.home

import android.os.Bundle
import com.example.core.Logger
import com.example.coreui.BaseActivity
import com.example.coreui.di.AndroidInjector
import com.example.coreui.di.HasComponent
import javax.inject.Inject

class HomeActivity : BaseActivity(),
    SomethingOnActivity,
    HasComponent<HomeComponent> {

    private val _component: HomeComponent by lazy {
        AndroidInjector
            .componentProvider(this, HomeComponentProvider::class.java)
            .homeComponent(HomeModule(this))
    }

    override val component: HomeComponent
        get() = _component

    @Inject
    lateinit var logger: Logger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.apply {
            if (findFragmentById(R.id.fragment_container) == null) {
                beginTransaction()
                    .add(R.id.fragment_container, HomeFragment())
                    .commit()
            }
        }
    }

    override fun doSomething() {
        logger.log("SomethingOnActivity.doSomething")
    }
}

interface SomethingOnActivity {
    fun doSomething()
}