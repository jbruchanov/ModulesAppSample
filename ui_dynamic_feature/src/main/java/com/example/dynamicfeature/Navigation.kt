package com.example.dynamicfeature

interface DynamicFeatureNavigation {
    fun navigateSomewhere()
}

class AndroidDynamicNavigation(private val dynamicFeatureActivity: DynamicFeatureActivity) : DynamicFeatureNavigation {
    override fun navigateSomewhere() {

    }
}