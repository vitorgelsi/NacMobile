package br.com.example.nacmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mercado_livre.*

class Mercado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercado_livre)

        webVmercadoLivre.loadUrl("https://www.mercadolivre.com.br");

    }
}
