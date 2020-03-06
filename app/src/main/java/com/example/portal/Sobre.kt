package com.example.portal

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sobre.*

class Sobre : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)

        var sh = getSharedPreferences("valores", Context.MODE_PRIVATE)

        txt.text = "Mercado Livre: ${sh.getInt("mercadoLivre", 0)} \n" +
                "Amazon: ${sh.getInt("amazon", 0)} \n" +
                "Alibaba: ${sh.getInt("alibaba", 0)} \n" +
                "Ebay: ${sh.getInt("ebay", 0)} \n" +
                "Submarino: ${sh.getInt("submarino", 0)} \n"

        limpa.setOnClickListener{
            sh.edit().clear().apply()
            recreate()
        }

    }
}
