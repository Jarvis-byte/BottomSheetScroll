package com.example.bottomsheetfragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showBottomSheetButton: MaterialButton = findViewById(R.id.showBottomSheetButton)
        showBottomSheetButton.setOnClickListener {
            BottomSheetFragment().show(supportFragmentManager, "BottomSheetFragment")
        }
    }
}