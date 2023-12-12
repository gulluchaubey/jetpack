package com.learnapp.jetpack.view.home

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

@Composable
fun HomeList() {
    LazyColumn(
        Modifier
            .background(Color.Blue)
            .padding(20.dp)
            .fillMaxSize()
            .border(2.dp, Color.Red, RectangleShape)
    ) {

    }
}