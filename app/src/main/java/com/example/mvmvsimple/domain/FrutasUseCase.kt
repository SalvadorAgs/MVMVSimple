package com.example.mvmvsimple.domain

import com.example.mvmvsimple.data.FrutasDataSet
import com.example.mvmvsimple.ui.modelo.Frutas

class FrutasUseCase {

   private  val frutasDataSet = FrutasDataSet()
    fun obtenerListaDeFrutas():List<Frutas>{
        return frutasDataSet.crearListaDeFrutas()
    }
}