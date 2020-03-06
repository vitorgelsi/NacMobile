package br.com.example.nacmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_netshoes.*

class Netshoes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_netshoes)

        webVnetshoes.loadUrl("https://www.netshoes.com.br");

    }
}
