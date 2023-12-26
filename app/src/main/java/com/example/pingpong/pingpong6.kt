package com.example.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pingpong6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pingpong6)
        val e1: Button =findViewById(R.id.k1)
        val e3: Button =findViewById(R.id.k3)
        val e2: Button =findViewById(R.id.k2)
        val e4: Button =findViewById(R.id.k4)

        var numrand:Int = 0


        e1.setOnClickListener {
            val intent = Intent(this, pingpong7::class.java)
            intent.putExtra("sc",numrand )
            startActivity(intent)
        }

        e2.setOnClickListener {
            val intent = Intent(this, pingpong7::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        e3.setOnClickListener {
            val intent = Intent(this, pingpong7::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        e4.setOnClickListener {
            val intent = Intent(this, pingpong7::class.java)
            intent.putExtra("sc",numrand+1)
            startActivity(intent)
        }

    }
}