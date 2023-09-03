package com.gautam.navigationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gautam.navigationapp.screens.ExploreScreen
import com.gautam.navigationapp.screens.HomeScreen
import com.gautam.navigationapp.screens.SearchScreen
import com.gautam.navigationapp.ui.theme.NavigationAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home_screen") {

        composable(
            route = "home_screen",
        ) {
            HomeScreen(navController)
        }

        composable(
            route = "explore_screen",
        ) {
            ExploreScreen()
        }

        composable(
            route = "search_screen",
        ) {
            SearchScreen()
        }

    }

}



