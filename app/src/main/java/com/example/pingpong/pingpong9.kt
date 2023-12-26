package com.example.pingpong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pingpong9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pingpong9)
        val i1: Button =findViewById(R.id.k1)
        val i2: Button =findViewById(R.id.k2)
        val i3: Button =findViewById(R.id.k3)
        val i4: Button =findViewById(R.id.k4)

        var numrand:Int = 0


        i1.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand+1)
            startActivity(intent)
        }

        i2.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        i3.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

        i4.setOnClickListener {
            val intent = Intent(this, pingpong8::class.java)
            intent.putExtra("sc",numrand)
            startActivity(intent)
        }

    }
}