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

        var sh = getSharedPreferences("valores", Context.MODE_PRIVATE)



        mercadoLivre.setOnClickListener {
            var intent = Intent(this, Portal::class.java)
            intent.putExtra("url", "https://www.mercadolivre.com.br/")
            startActivity(intent)
        }

        amazon.setOnClickListener{
            var intent = Intent(this, Portal::class.java)
            intent.putExtra("url", "https://www.amazon.com.br/")
            startActivity(intent)
        }

        alibaba.setOnClickListener{
            var intent = Intent(this, Portal::class.java)
            intent.putExtra("url", "https://www.alibaba.com/")
            startActivity(intent)
        }

        ebay.setOnClickListener{
            var intent = Intent(this, Portal::class.java)
            intent.putExtra("url", "https://www.ebay.com/")
            startActivity(intent)
        }

        submarino.setOnClickListener{
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
