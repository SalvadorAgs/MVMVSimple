package com.example.mvmvsimple.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mvmvsimple.R
import com.example.mvmvsimple.ViewModel.MyViewModel
import com.example.mvmvsimple.ViewModel.MyViewModelFactory
import com.example.mvmvsimple.domain.FrutasUseCase
import com.example.mvmvsimple.ui.modelo.Frutas
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewModelAndObserve()
        btnCrearListaFrutas.setOnClickListener {
            viewModel.getListaFrutas()
        }
    }

    fun setupViewModelAndObserve() {
        viewModel = ViewModelProviders.of(this, MyViewModelFactory(FrutasUseCase())).get(MyViewModel::class.java)
        val frutasObserver = Observer<List<Frutas>> {

            for (fruta in it) {
                Log.d("Frutas:", fruta.nombreFruta)
            }

            for ((index, value) in it.withIndex()) {
                Log.d("Frutas $index:", value.nombreFruta)
            }
        }
        viewModel.getListaFrutasLiveData().observe(this, frutasObserver)
    }
}