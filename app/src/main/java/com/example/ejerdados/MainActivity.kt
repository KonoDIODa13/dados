package com.example.ejerdados

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ejerdados.modelo.Dado

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val images = intArrayOf(
            R.drawable.dado,
            R.drawable.dado1,
            R.drawable.dado2,
            R.drawable.dado3,
            R.drawable.dado4,
            R.drawable.dado5,
            R.drawable.dado6
        )
        val dado = Dado();
        val btn = findViewById<Button>(R.id.botonquesepulsa)
        btn.setOnClickListener {
            val imagen = findViewById<ImageView>(R.id.dadoimagen)
            imagen.setImageResource(images[dado.girar()])
            /*when (dado.giro()) {
                1 -> imagen.setImageResource(R.drawable.dado1)
                2 -> imagen.setImageResource(R.drawable.dado2)
                3 -> imagen.setImageResource(R.drawable.dado3)
                4 -> imagen.setImageResource(R.drawable.dado4)
                5 -> imagen.setImageResource(R.drawable.dado5)
                6 -> imagen.setImageResource(R.drawable.dado6)
            }*/

        }
    }
}