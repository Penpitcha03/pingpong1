package com.example.pingpong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class pingpongfinish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pingpongfinish)
        val num2: TextView = findViewById(R.id.num2)

        val receivedIntent = intent
        var numrand = receivedIntent.getIntExtra("sc", 0)
        num2.setText(numrand.toString())

    }
}