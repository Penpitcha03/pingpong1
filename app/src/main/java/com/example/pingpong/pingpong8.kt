package com.example.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pingpong8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pingpong8)
        val h1: Button =findViewById(R.id.k1)
        val h2: Button =findViewById(R.id.k2)
        val h3: Button =findViewById(R.id.k3)
        val h4: Button =findViewById(R.id.k4)

        var numrand:Int = 0


        h1.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand )
            startActivity(intent)
        }

        h2.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand+1)
            startActivity(intent)
        }

        h3.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        h4.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

    }
}