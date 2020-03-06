package com.example.portal

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sh = getSharedPreferences("valores", Context.MODE_PRIVATE )

        fun persistirDados(marketPlace : String){
            sh.edit()
                .putInt(marketPlace, sh.getInt(marketPlace,0) +1).apply()
        }

        mercadoLivre.setOnClickListener {
            persistirDados("mercadoLivre")
            var intent = Intent(this, Portal::class.java)
            intent.putExtra("url", "https://www.mercadolivre.com.br/")
            startActivity(intent)
        }

        amazon.setOnClickListener{
            persistirDados("amazon")
            var intent = Intent(this, Portal::class.java)
            intent.putExtra("url", "https://www.amazon.com.br/")
            startActivity(intent)
        }

        alibaba.setOnClickListener{
            persistirDados("alibaba")
            var intent = Intent(this, Portal::class.java)
            intent.putExtra("url", "https://www.alibaba.com/")
            startActivity(intent)
        }

        ebay.setOnClickListener{
            persistirDados("ebay")
            var intent = Intent(this, Portal::class.java)
            intent.putExtra("url", "https://www.ebay.com/")
            startActivity(intent)
        }

        submarino.setOnClickListener{
            persistirDados("submarino")
            var intent = Intent(this, Portal::class.java)
            intent.putExtra("url", "https://www.submarino.com.br/")
            startActivity(intent)
        }

        sobre.setOnClickListener{ view: View? ->
            var intent = Intent(this, Sobre::class.java)
            startActivity(intent)
        }
    }
}
