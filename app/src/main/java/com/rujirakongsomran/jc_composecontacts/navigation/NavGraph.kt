package com.rujirakongsomran.jc_composecontacts.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.rujirakongsomran.jc_composecontacts.AnimatedSplashScreen
import com.rujirakongsomran.jc_composecontacts.DisplayData

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            AnimatedSplashScreen(navController)
        }
        composable(route = Screen.Home.route) {
            DisplayData()
        }
    }
}