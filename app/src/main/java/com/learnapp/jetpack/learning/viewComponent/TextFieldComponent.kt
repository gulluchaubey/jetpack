package com.learnapp.jetpack.learning.viewComponent

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldComponent() {
    var text by remember {
        mutableStateOf("")
    }
    TextField(
        value = text, onValueChange = { newText ->
                      text = newText },
        modifier = Modifier.fillMaxWidth(),
        textStyle = TextStyle(
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            color = Color.Red
        ),
        label = { NormalText() },
        placeholder = { NormalText("Enter User Name") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
    )
}

@Composable
fun NormalText(
    text: String = "User Name"
) {
    Text(
        text = text,
        fontWeight = FontWeight.Bold,
        color = Color.Green,
        fontStyle = FontStyle.Normal,
        modifier = Modifier
            .padding(20.dp)
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextFieldComponentPreview() {
    TextFieldComponent()
}