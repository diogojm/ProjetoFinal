package com.example.projetoprog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var username: EditText? = null
    private var textViewMensagem: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewMensagem = findViewById(R.id.textViewMensagem)
        username = findViewById(R.id.username)

        findViewById<Button>(R.id.buttonEntrar).setOnClickListener {
            entrar()
        }

    }




    private fun entrar() {
        val nome = username!!.text.toString().toIntOrNull()

        if (nome !in NOME_MIN..NOME_MAX)
            username!!.error = "O nome deve conter entre 3 e 10 caracteres"
            username!!.requestFocus()
        return


        val mensagem = when {
            nome!! < 3 -> "nome muito pequeno, introduza um nome entre 3 a 10 caracteres"
            nome!! > 10 -> "nome muito grande, introduza um nome entre 3 a 10 caracteres"
            else -> "Entrou com sucesso"
        }

        textViewMensagem!!.text = mensagem



    }
    companion object {
        private const val NOME_MIN = 3
        private const val NOME_MAX = 10
    }

}