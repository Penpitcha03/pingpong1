package com.example.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pingpong7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pingpong7)
        val g1: Button =findViewById(R.id.k1)
        val g2: Button =findViewById(R.id.k2)
        val g3: Button =findViewById(R.id.k3)
        val g4: Button =findViewById(R.id.k4)

        var numrand:Int = 0


        g1.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand )
            startActivity(intent)
        }

        g2.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand+1)
            startActivity(intent)
        }

        g3.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        g4.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

    }
}