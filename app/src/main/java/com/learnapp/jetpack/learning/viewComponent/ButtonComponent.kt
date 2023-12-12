package com.learnapp.jetpack.learning.viewComponent

import android.util.Log
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ButtonComponent() {
    Button(
        onClick = {
        Log.d("TAG", "Button Clicked")
    },
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.CenterVertically),
        shape = RoundedCornerShape(60),
    ) {
        ButtonText()
    }
}

@Composable
fun ButtonText() {
    Text(
        text = "Click Me",
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ButtonComponentPreview() {
    ButtonComponent()
}