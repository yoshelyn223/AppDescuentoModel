package com.example.appdescuentomodel.model

data class CalcularState(
    val precio: String = "",
    val descuento: String = "",
    val precioDescuento: Double = 0.0,
    val totalDescuento: Double = 0.0,
    val showAlert: Boolean = false

)

