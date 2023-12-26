package com.example.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pingpong4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pingpong4)
        val d1: Button =findViewById(R.id.k1)
        val d2: Button =findViewById(R.id.k3)
        val d3: Button =findViewById(R.id.k2)
        val d4: Button =findViewById(R.id.k4)

        var numrand:Int = 0


        d1.setOnClickListener {
            val intent = Intent(this, pingpong5::class.java)
            intent.putExtra("sc",numrand )
            startActivity(intent)
        }

        d2.setOnClickListener {
            val intent = Intent(this, pingpong5::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        d3.setOnClickListener {
            val intent = Intent(this, pingpong5::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        d4.setOnClickListener {
            val intent = Intent(this, pingpong5::class.java)
            intent.putExtra("sc",numrand+1)
            startActivity(intent)
        }

    }
}