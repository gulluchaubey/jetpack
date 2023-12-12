package com.learnapp.jetpack.learning.viewComponent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnComponent() {
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
    LazyColumn {
        items(listItem) { item ->
            NormalText(text = item)
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(Color.Black)
            )
        }
    }
}

@Preview
@Composable
fun LazyColumnComponentPreview() {

}