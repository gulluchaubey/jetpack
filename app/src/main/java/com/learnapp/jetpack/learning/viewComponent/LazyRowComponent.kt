package com.learnapp.jetpack.learning.viewComponent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyRowComponent() {
    var listItem = listOf(
        "Divya", "Chaubey", "Pallavi", "Lovely","Adarsh", "Chotu","Pushpa", "Ramakant","Abha", "Kamla",
        "Divya", "Chaubey", "Pallavi", "Lovely","Adarsh", "Chotu","Pushpa", "Ramakant","Abha", "Kamla",
        "Divya", "Chaubey", "Pallavi", "Lovely","Adarsh", "Chotu","Pushpa", "Ramakant","Abha", "Kamla",
        "Divya", "Chaubey", "Pallavi", "Lovely","Adarsh", "Chotu","Pushpa", "Ramakant","Abha", "Kamla",
        "Divya", "Chaubey", "Pallavi", "Lovely","Adarsh", "Chotu","Pushpa", "Ramakant","Abha", "Kamla",
        "Divya", "Chaubey", "Pallavi", "Lovely","Adarsh", "Chotu","Pushpa", "Ramakant","Abha", "Kamla",
        "Divya", "Chaubey", "Pallavi", "Lovely","Adarsh", "Chotu","Pushpa", "Ramakant","Abha", "Kamla",
        "Divya", "Chaubey", "Pallavi", "Lovely","Adarsh", "Chotu","Pushpa", "Ramakant","Abha", "Kamla",
        "Divya", "Chaubey", "Pallavi", "Lovely","Adarsh", "Chotu","Pushpa", "Ramakant","Abha", "Kamla",
        )
    LazyRow {
        items(listItem) { item ->
            NormalText(text = item)
            Spacer(
                modifier = Modifier
                    .width(2.dp)
                    .height(20.dp)
                    .background(Color.Blue)
            )
        }
    }
}

@Preview
@Composable
fun LazyRowComponentPreview() {

}