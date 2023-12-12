package com.learnapp.jetpack.learning.viewComponent

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RowComponent() {
    Row(
        modifier = Modifier
            .wrapContentHeight(align = Alignment.CenterVertically)
            .wrapContentWidth(align = Alignment.CenterHorizontally),
        horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
    ) {
        TextComponent()
        TextComponent()
        TextComponent()
        TextComponent()
        TextComponent()
        TextComponent()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RowComponentPreview() {
    RowComponent()
}
