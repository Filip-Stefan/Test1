package com.example.test1

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


val nunitoFontFamily = FontFamily(
Font(R.font.nunito_sans, FontWeight.Normal),
)
@Composable
fun FreaksItem(name: String, @DrawableRes resId: Int) {
    val itemWidth = 220.dp
    val borderSize = 4.dp
    Row(
        verticalAlignment = Alignment.CenterVertically, modifier = Modifier
            .height(height = 90.dp)
            .fillMaxWidth()
            .padding(vertical = 10.dp)
    ) {
        Image(
            painter = painterResource(resId),
            contentDescription = "Contact profile picture",
            modifier = Modifier
                .clip(CircleShape)
                .border(
                    width = 2.dp,
                    color = Color(0xFF4480F1),
                    shape = RoundedCornerShape(size = 100.dp)
                ),
        )
        Text(
            text = "$name", modifier = Modifier.padding(horizontal = 20.dp), fontFamily = nunitoFontFamily, color = Color(0xFF6C717F)
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun FreakItemPreview() {
    FreaksItem(name = "ion", resId = R.drawable.profile1)
}