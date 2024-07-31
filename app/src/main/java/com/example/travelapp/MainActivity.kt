package com.example.travelapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.travelapp.presentation.ui.screens.onBoarding.OnBoardingFirstScreen
import com.example.travelapp.presentation.ui.screens.onBoarding.OnBoardingSecondScreen
import com.example.travelapp.presentation.ui.screens.onBoarding.OnBoardingThirdScreen

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            TravelAppTheme {
//                val navController = rememberNavController()
//                NavHost(
//                    navController = navController,
//                    startDestination = "onBoardingFirstScreen"
//                ) {
//                    composable(route = "onBoardinFirstScreen") {
//                        OnBoardingFirstScreen(navController)
//                    }
//                    composable(route = "onBoardingSecondScreen") {
//                        OnBoardingSecondScreen(navController)
//                    }
//                    composable(route = "onBoardingThirdScreen") {
//                        OnBoardingThirdScreen(navController)
//                    }
//                }
//            }
        }
    }
}