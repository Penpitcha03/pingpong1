package com.example.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pingpong2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pingpong2)
        val b1: Button =findViewById(R.id.k1)
        val b2: Button =findViewById(R.id.k3)
        val b3: Button =findViewById(R.id.k2)
        val b4: Button =findViewById(R.id.k4)

        var numrand:Int = 0


        b1.setOnClickListener {
            val intent = Intent(this, pingpong3::class.java)
            intent.putExtra("sc",numrand +1)
            startActivity(intent)
        }

        b2.setOnClickListener {
            val intent = Intent(this, pingpong3::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        b3.setOnClickListener {
            val intent = Intent(this, pingpong3::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        b4.setOnClickListener {
            val intent = Intent(this, pingpong3::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

    }
}