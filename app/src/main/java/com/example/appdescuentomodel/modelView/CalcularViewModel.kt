package com.example.appdescuentomodel.modelView

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.room.util.copy
import com.example.appdescuentomodel.model.CalcularState


class CalcularViewModel:ViewModel(){
   var state by mutableStateOf(CalcularState())
       private set

    fun onValue(value:String, text:String){
        when(text){
            "precio" -> state = state.copy(precio=value)
            "descuento" -> state = state.copy(descuento = value)
        }
    }

    fun calcular(){
        val precio = state.precio
        val descuento = state.descuento
        state = if (precio != "" && descuento != ""){
            state.copy(
                precioDescuento = calcularPrecio(precio.toDouble(), descuento.toDouble()),
                totalDescuento =
                calcularDescuento(precio.toDouble(), descuento.toDouble())
            )
        }else{
            state.copy(
                showAlert = true
            )
        }
    }

    private fun calcularPrecio(precio: Double, descuento:Double):Double{
    val res = precio - calcularPrecio(precio, descuento)
    return kotlin.math.round(res*100)/100.0
}
    private fun calcularDescuento(precio:Double, descuento:Double):Double{
        val res= precio *(1-descuento / 100)
        return kotlin.math.round(res *100)/100.0
    }

 fun Limpiar(){
     state = state.copy(
         precio = ""

     )

 }
    fun cancelAlert(){
        state = state.copy(
            showAlert = false
        )

    }

}