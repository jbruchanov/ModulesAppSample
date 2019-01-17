package com.example.coreui.di

import com.example.coreui.BaseActivity
import com.example.coreui.BaseFragment

interface HasComponent<T> {
    val component: T
}

interface IBaseActivityComponentProvider : IComponentProvider {
    fun provideBaseActivityComponent(baseActivity: BaseActivity): IComponentProvider /*BaseActivityComponent*/
}

interface IComponentProvider
interface IComponent


class AndroidInjector {
    companion object {
        fun <T : IComponentProvider> componentProvider(activity: BaseActivity, clazz: Class<T>): T {
            return (activity.application as? IBaseActivityComponentProvider)?.let { provider ->
                //return BaseActivityComponent which is actual provider for feature module components
                clazz.cast(provider.provideBaseActivityComponent(activity))
            } ?: throw IllegalStateException("Application doesn't implement IBaseActivityComponentProvider")
        }

        fun <T : IComponent> component(fragment: BaseFragment, clazz: Class<T>): T {
            return (fragment.activity as? HasComponent<*>)?.let {
                clazz.cast(it.component)
            } ?: throw IllegalStateException("Activity doesn't implement HasComponent<${clazz.canonicalName}>?")
        }

        fun <T : IComponent> component(activity: BaseActivity, clazz: Class<T>): T {
            return (activity as? HasComponent<*>)?.let {
                clazz.cast(it.component)
            } ?: throw IllegalStateException("Activity doesn't implement HasComponent<${clazz.canonicalName}>?")
        }
    }
}