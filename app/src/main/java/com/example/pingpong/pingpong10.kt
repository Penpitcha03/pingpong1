package com.example.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pingpong10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pingpong10)
        val k1: Button =findViewById(R.id.k1)
        val k2: Button =findViewById(R.id.k2)
        val k3: Button =findViewById(R.id.k3)
        val k4: Button =findViewById(R.id.k4)

        var numrand:Int = 0


        k1.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        k2.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        k3.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand+1)
            startActivity(intent)
        }

        k4.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

    }
}