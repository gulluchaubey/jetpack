package com.learnapp.jetpack.learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.learnapp.jetpack.learning.ui.theme.JetpackTheme
import com.learnapp.jetpack.learning.viewComponent.ButtonComponent
import com.learnapp.jetpack.learning.viewComponent.ColumnComponent
import com.learnapp.jetpack.learning.viewComponent.LazyColumnComponent
import com.learnapp.jetpack.learning.viewComponent.LazyRowComponent
import com.learnapp.jetpack.learning.viewComponent.RowComponent
import com.learnapp.jetpack.learning.viewComponent.TextComponent

class LearningActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //TextComponent()
                     // ColumnComponent()
                    // ButtonComponent()
                    // RowComponent()
                    // LazyRowComponent()
                    LazyColumnComponent()
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    JetpackTheme {
        Greeting2("Android")
    }
}