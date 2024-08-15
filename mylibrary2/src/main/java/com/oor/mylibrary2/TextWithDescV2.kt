package com.oor.mylibrary2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextWhitDescription(
    modifier: Modifier = Modifier,
    text: String,
    description: String
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.DarkGray)
    ) {
        Text(
            text = text,
            fontSize = 64.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = description,
            fontSize = 24.sp,
            fontWeight = FontWeight.Light,
            fontFamily = FontFamily.Monospace
        )
    }
}