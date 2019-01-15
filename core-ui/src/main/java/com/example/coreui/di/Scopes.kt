package com.example.coreui.di

import javax.inject.Scope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class SessionScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope