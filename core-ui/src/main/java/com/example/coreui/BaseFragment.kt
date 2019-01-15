package com.example.coreui

import androidx.fragment.app.Fragment

open class BaseFragment : Fragment() {


    override fun onResume() {
        super.onResume()
        activity?.let {
            it.title = "${it::class.java.simpleName}:${this::class.java.simpleName}"
        }
    }
}