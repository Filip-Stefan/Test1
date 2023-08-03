package com.example.test1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.test1.ui.theme.Test1Theme
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("iOs", "nimic")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, other: String, modifier: Modifier = Modifier) {
    Row {
        Image(
            painter = painterResource(R.drawable.profilepicture),
            contentDescription = "Contact profile picture",
        )
        Column(verticalArrangement = Arrangement.Center) {
            Text(
                text = "ce $name!",
                modifier = modifier
            )
            Text(
                text = "ce $other!",
                modifier = modifier
            )
        }
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Test1Theme {
        Greeting("Android", "Altceva")
    }

}