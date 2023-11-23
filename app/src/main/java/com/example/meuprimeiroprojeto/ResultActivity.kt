package com.example.meuprimeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvResult = findViewById<TextView>(R.id.textview_result)
        val tvClassificacao = findViewById<TextView>(R.id.textview_classificacao)
        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)

        tvResult.text = result.toString()

        var classificacao ="Classificação: "

        if (result < 18.5f){
            classificacao += "ABAIXO DO PESO IDEAL"
        } else if (result >= 18.5f && result <=24.9f){
            classificacao += "PESO IDEAL"
        } else if (result >=25f && result <=29.9f){
            classificacao += "SOBREPESO"
        } else if (result >=30f && result <=39.9f){
            classificacao += "OBESIDADE"
        } else {
            classificacao += "OBESIDADE GRAVE"
        }

        tvClassificacao.text = classificacao

    }
}