package br.com.example.nacmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_magalu.*

class Magalu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magalu)

        webVmagalu.loadUrl("https://www.magazineluiza.com.br");

    }
}
