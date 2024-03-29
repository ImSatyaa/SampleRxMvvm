package com.mac.loginmvvmsample.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mac.loginmvvmsample.network.Repository
import javax.inject.Inject

class ViewModelFactory
@Inject constructor(val repository: Repository) : ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) {
            return LoginViewModel(repository) as T
        }
        if (modelClass.isAssignableFrom(DashboardViewModel::class.java)) {
            return DashboardViewModel(repository) as T
        }

        throw IllegalArgumentException("Unknown class name in ViewModelFactory.class")
    }
}
