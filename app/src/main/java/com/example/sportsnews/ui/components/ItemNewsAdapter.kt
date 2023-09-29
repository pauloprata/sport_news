package com.example.sportsnews.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemNewsAdapter() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = "Hello, World!",
            fontSize = 24.sp,
            color = Color.Black
        )
    }
}

@Composable
@Preview()
fun ItemNewsAdapterPreview(){
    ItemNewsAdapter()
}