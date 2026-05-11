package com.example.textoapp

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar vistas
        editText = findViewById(R.id.editText)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)

        // Configurar el clic del botón
        button.setOnClickListener {
            handleButtonClick()
        }
    }

    private fun handleButtonClick() {
        val texto = editText.text.toString()

        if (texto.isNotEmpty()) {
            // Pasar el texto del EditText al TextView
            textView.text = texto

            // Mostrar alerta de éxito
            showSuccessAlert()
        } else {
            // Mostrar alerta de error si el campo está vacío
            showErrorAlert()
        }
    }

    private fun showSuccessAlert() {
        AlertDialog.Builder(this)
            .setTitle("Éxito")
            .setMessage("El texto se ha procesado correctamente: ${editText.text}")
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    private fun showErrorAlert() {
        AlertDialog.Builder(this)
            .setTitle("Error")
            .setMessage("Por favor ingresa un texto antes de presionar el botón")
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }
}
