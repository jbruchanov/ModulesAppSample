package com.example.reg

interface RegistrationNavigation {
    fun navigateToWelcome()
    fun navigateToJavaFragment()
    fun navigateToRegistration()
}

class AndroidRegistrationNavigation(private val registrationActivity: RegistrationActivity) : RegistrationNavigation {
    override fun navigateToJavaFragment() {
        registrationActivity.supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, RegJavaFragment())
            .commit()
    }

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