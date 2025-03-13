package com.example.appdescuentomodel.components

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier



@Composable
fun TwoCards(title1: String, number1:Double, number2:Double){
    Row(
       modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly)
    {
        MainCard(
            title= title1,
            number = number1,
            modifier = Modifier
                .padding(start = 30.dp)
                .weight(1f))
    }
}

@Composable
fun MainCard(title:String, number:Double, modifier: Any){
    Card (
        modifier = Modifier,
        colors = CardDefaults.cardColors(
            containerColor = Color.LightGray,
        )
    ){  Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ){
        Text(text = title, color = Color.Black, fontSize = 20.sp)
        Text(text = number.toString(), color= Color.Black, fontSize = 20.sp)
    }}
}