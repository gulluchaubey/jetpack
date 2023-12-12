package com.learnapp.jetpack.learning.viewComponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learnapp.jetpack.R

@Composable
fun ImageComponent() {
    Image(
        painter = painterResource(id = R.drawable.dummy_image),
        contentDescription = "Image Demo",
        modifier = Modifier
            .size(108.dp)
            .clip(CircleShape),
        contentScale = ContentScale.FillBounds
    )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ImageComponentPreview() {
    ImageComponent()
}