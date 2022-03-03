package com.example.mvmvsimple.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvmvsimple.domain.FrutasUseCase


class MyViewModelFactory(val frutasUseCase: FrutasUseCase): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(FrutasUseCase::class.java).newInstance(frutasUseCase)
    }
}