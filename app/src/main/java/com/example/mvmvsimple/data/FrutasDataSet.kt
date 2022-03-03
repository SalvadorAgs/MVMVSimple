package com.example.mvmvsimple.data

import com.example.mvmvsimple.ui.modelo.Frutas

class FrutasDataSet {


    fun crearListaDeFrutas():List<Frutas>{
        return listOf(
            Frutas("Manzana","Roja",5.4f,250.3f),
            Frutas("Banana","Amarillo",3.4f,200.0f),
            Frutas("Uvas","Moradas",10.5f,100.3f),
            Frutas("Mango","Amarillo",15.4f,150.0f)

        )
    }
}