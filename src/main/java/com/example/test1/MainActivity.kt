package com.example.test1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.test1.ui.theme.Test1Theme

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

val names = arrayOf<String>("cichicean", "bruzli", "meiuedar")
val list = arrayOf<ProfileList>(
    ProfileList("cineva", R.drawable.profile1),
    ProfileList("altcineva", R.drawable.profile2),
    ProfileList("un om", R.drawable.profile3)
)

@Composable
fun Greeting(name: String, other: String, modifier: Modifier = Modifier) {
    Row {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFF6C717F),
                    shape = RoundedCornerShape(size = 20.dp)
                )
                .padding(horizontal = 16.dp)
                .width(327.dp),
            horizontalAlignment = Alignment.Start

        ) {
            list.forEachIndexed { index: Int, name: ProfileList ->
                FreaksItem(name = name.name, resId = name.resourceId)
                if (index < names.count() - 1) {
                    Spacer(
                        modifier = Modifier
                            .height(0.5.dp)
                            .fillMaxWidth()
                            .background(color = Color(0xFF6C717F))
                    )
                }

            }
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