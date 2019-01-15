package com.example.coreui.di

import android.app.Activity
import com.example.coreui.BaseFragment

interface HasComponent<T> {
    val component: T
}

interface IComponentProvider
interface IComponent


class AndroidInjector {
    companion object {
        fun <T : IComponentProvider> componentProvider(activity: Activity, clazz: Class<T>): T {
            return (activity.application as? HasComponent<*>)?.let {
                clazz.cast(it.component)
            } ?: throw IllegalStateException("Application doesn't implement HasComponent<${clazz.canonicalName}>?")
        }

        fun <T : IComponent> component(fragment: BaseFragment, clazz: Class<T>): T {
            return (fragment.activity as? HasComponent<*>)?.let {
                clazz.cast(it.component)
            } ?: throw IllegalStateException("Activity doesn't implement HasComponent<${clazz.canonicalName}>?")
        }
    }
}