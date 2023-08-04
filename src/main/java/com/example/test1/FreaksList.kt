package com.example.test1

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FreaksList(){
    Column(
        modifier = Modifier
            .padding(20.dp)
    ) {
        Text(
            text = "Freaks List",
            modifier = Modifier.padding(vertical = 20.dp),
            fontFamily = nunitoFontFamily,
            color = Color(0xFF6C717F)
        )
        Column(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color(0xFF6C717F),
                    shape = RoundedCornerShape(size = 20.dp)
                )
                .padding(horizontal = 16.dp)
                .width(327.dp),
            horizontalAlignment = Alignment.Start

        ) {
            defaultFreaksList().forEachIndexed { index: Int, name: Freak ->
                FreaksItem(name = name.name, resId = name.resourceId)
                if (index < defaultFreaksList().count() - 1) {
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