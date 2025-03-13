package com.example.appdescuentomodel.model

class models {


    data class Calcular(
    val precio: String = "",
    val descuento: String= "",
    val preciodescuento: Double = 0.0,
    val totalDescuento: Double = 0.0,
    val showAlert: Boolean = false
    )

}