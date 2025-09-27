package com.example.basickotlin

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ControladorPrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_controlador_principal)
        var btnAccion = findViewById<AppCompatButton>(R.id.btnAccion)
        var editText = findViewById<AppCompatEditText>(R.id.texto)
        var textView = findViewById<TextView>(R.id.resultado)
        btnAccion.setOnClickListener {
            Log.i("consola", editText.text.toString())
            textView.setText(editText.text.toString())
            editText.setText("")
        }
    }
}