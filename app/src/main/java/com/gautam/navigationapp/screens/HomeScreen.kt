package com.gautam.navigationapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(
    navController: NavHostController
){
    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "Home Screen", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = {
            navController.navigate("explore_screen")
        }) {
            Text(text = "Go to Explore Screen")
        }
        Button(onClick = {
            navController.navigate("search_screen")
        }) {
            Text(text = "Go to Search Screen")
        }
    }
}
