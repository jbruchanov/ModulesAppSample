package com.example.reg

interface RegistrationNavigation {
    fun navigateToWelcome()
    fun navigateToRegistration()
}

class AndroidRegistrationNavigation(private val registrationActivity: RegistrationActivity) : RegistrationNavigation {
    override fun navigateToRegistration() {
        registrationActivity.supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, WelcomeFragment())
            .addToBackStack(null)
            .commit()
    }

    override fun navigateToWelcome() {
        registrationActivity.supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, WelcomeFragment())
            .commit()
    }
}