package com.example.travelapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var firebase: FirebaseFirestore
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}