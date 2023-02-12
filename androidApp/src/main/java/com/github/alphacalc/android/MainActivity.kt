package com.github.alphacalc.android



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.github.alphacalc.Greeting

import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {

//    val interactionSource = remember { MutableInteractionSource() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    var counter1 by remember { mutableStateOf( 0) }
                    Column {
//                        GreetingView(Greeting().greet())
                        Button(
                            onClick = { counter1 = counter1 + 1 }

                        ) {
//                            Text(Greeting().greet())
                            Text("${counter1}")
                        }

                        Button(
                            onClick = {}
                        ) {
                            Text(Greeting().greet())
                        }

                        Button(
                            onClick = {}
                        ) {
                            Text(Greeting().greet())
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}
