package com.example.home

import com.example.homesettings.SettingsFragment

interface HomeNavigation {
    fun openSettings()
}

class AndroidHomeNavigation constructor(private val homeActivity: HomeActivity) : HomeNavigation {
    override fun openSettings() {
        homeActivity
            .supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, SettingsFragment())
            .addToBackStack(null)
            .commit()
    }
}