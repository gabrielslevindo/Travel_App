package com.example.travelapp.presentation.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.compose.rememberNavController
import com.example.travelapp.presentation.ui.theme.TravelAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                TravelAppTheme {
                    ComposeFragmentContent()
                }
            }
        }
    }

    @Composable
    fun ComposeFragmentContent() {
        val navController = rememberNavController()
        // Set up your NavHost here
    }
}