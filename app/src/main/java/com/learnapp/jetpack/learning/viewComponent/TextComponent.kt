package com.learnapp.jetpack.learning.viewComponent

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextComponent(
    text: String = "This",
    fontSize: TextUnit = 20.sp,
    fontStyle: FontStyle = FontStyle.Italic,
    color: Color = Color.Red,
    maxLines: Int = 2,
    overflow: TextOverflow = TextOverflow.Ellipsis
) {
    Text(
        text = text,
        fontSize = fontSize,
        fontStyle = fontStyle,
        color = color,
        maxLines = maxLines,
        overflow = overflow,
        modifier = Modifier
            .wrapContentHeight(align = Alignment.Top)
            .wrapContentWidth(align =Alignment.CenterHorizontally)
            .background(Color.Black)
            .padding(10.dp)
            .border(
                border = BorderStroke(1.dp, Color.Red),
                shape = RoundedCornerShape(10.dp)
            )
            .padding(10.dp)
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TextComponentPreview(){
    TextComponent()
}
