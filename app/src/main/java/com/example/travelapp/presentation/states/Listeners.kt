package com.example.travelapp.presentation.states

interface Listeners {
    fun onSucess(mensage: String, screen: String)
    fun onFalure(error: String)
}