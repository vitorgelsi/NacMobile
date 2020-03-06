package br.com.example.nacmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_webmotors.*

class Webmotors : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webmotors)

        webVwebmotors.loadUrl("https://www.americanas.com.br");

    }
}
