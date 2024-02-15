package com.example.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen(name:String, navigateToThirdScreen:()->Unit) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "This is the second screen!", fontSize = 24.sp)
        Text(text = "Welcome $name", fontSize = 24.sp)
        Button(onClick = { navigateToThirdScreen() }) {
            Text(text = "Go to third screen")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SecondPreview() {
    SecondScreen("Nagma",{})
}