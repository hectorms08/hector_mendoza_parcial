package com.example.hectormendozaparcial

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MenuActivity : AppCompatActivity() {
    private var cambioButton: Button? = null
    private var edadButton: Button? = null
    private var contactosButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        cambioButton = findViewById<Button>(R.id.cambio_button)
        edadButton = findViewById<Button>(R.id.edad_button)
        contactosButton = findViewById<Button>(R.id.contactos_button)
        cambioButton.setOnClickListener(View.OnClickListener {
            val cambioIntent = Intent(this@MenuActivity, CambioActivity::class.java)
            startActivity(cambioIntent)
        })
        edadButton.setOnClickListener(View.OnClickListener {
            val edadIntent = Intent(this@MenuActivity, EdadActivity::class.java)
            startActivity(edadIntent)
        })
        contactosButton.setOnClickListener(View.OnClickListener {
            val contactosIntent = Intent(this@MenuActivity, ContactosActivity::class.java)
            startActivity(contactosIntent)
        })
    }
}