package com.example.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a1: Button =findViewById(R.id.k1)
        val a2: Button =findViewById(R.id.k3)
        val a3: Button =findViewById(R.id.k2)
        val a4: Button =findViewById(R.id.k4)

        var numrand:Int = 0


        a1.setOnClickListener {
            val intent = Intent(this, pingpong2::class.java)
            intent.putExtra("sc",numrand +1)
            startActivity(intent)
        }

        a2.setOnClickListener {
            val intent = Intent(this, pingpong2::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        a3.setOnClickListener {
            val intent = Intent(this, pingpong2::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        a4.setOnClickListener {
            val intent = Intent(this, pingpong2::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

    }
}