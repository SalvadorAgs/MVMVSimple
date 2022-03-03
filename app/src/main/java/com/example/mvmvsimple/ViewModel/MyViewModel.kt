package com.example.mvmvsimple.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvmvsimple.domain.FrutasUseCase
import com.example.mvmvsimple.ui.modelo.Frutas

class MyViewModel :ViewModel(){

    private val listData = MutableLiveData<List<Frutas>>()
    private val frutasUseCase = FrutasUseCase()



    init{
        getListaFrutas()
    }
    fun setListData(listaFrutas:List<Frutas>){
        listData.value= listaFrutas
        //
    }
    // Podemos usar corutinas para pedir informacion que sea asyncrona
    fun getListaFrutas(){

        // cuando se obtengan las listas de frutas nosotros setiamos
        // de la funcion setListData para que este despues sea llamado
        setListData(frutasUseCase.obtenerListaDeFrutas()) // se cambiaron los valore de la lista

        //que ya entraron al metod
    }
    //live data
    /* escucha el mutable de dato para ver si cambio
    // si no cambiar el valor se queda esperando
    *
    * */

    fun getListaFrutasLiveData():LiveData<List<Frutas>>{
        return listData
    }
}