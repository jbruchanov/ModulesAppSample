package com.example.modulesapp.di

import com.example.coreui.di.SessionScope
import com.example.login.LoginComponentProvider
import dagger.Subcomponent

@Subcomponent
@SessionScope
interface SessionComponent :
    LoginComponentProvider {
}