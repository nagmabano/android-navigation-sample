package com.example.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen(name:String, navigateToThirdScreen:(String)->Unit) {
    val age = remember {
        mutableStateOf("0")
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "This is the second screen!", fontSize = 24.sp)
        Text(text = "Welcome $name", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "What is your age?", fontSize = 16.sp)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = age.value, onValueChange = {
            age.value = it
        })
        Button(onClick = { navigateToThirdScreen(age.value) }) {
            Text(text = "Go to third screen")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SecondPreview() {
    SecondScreen("Nagma",{})
}