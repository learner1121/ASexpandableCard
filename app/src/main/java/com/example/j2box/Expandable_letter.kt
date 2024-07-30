package com.example.j2box


import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ExpandableCard(){
    Row {
        ->
        Text(text = "My Title",
            modifier = Modifier.fillMaxSize()
                , fontWeight = FontWeight.Bold



            )
    }
}
@Preview
@Composable
fun Call(){
    ExpandableCard()
}