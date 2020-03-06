package br.com.example.nacmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        americanas.setOnClickListener({
            var AmericanasIntent = Intent(this, Americanas::class.java);
            startActivity(AmericanasIntent);

        })

        buscape.setOnClickListener({
            var BuscapeIntent = Intent(this, Buscape::class.java);
            startActivity(BuscapeIntent);
        });

        ebay.setOnClickListener({
            var EbayIntent = Intent(this, Ebay::class.java);
            startActivity(EbayIntent);
        });
        magalu.setOnClickListener({
            var MagaluIntent = Intent(this, Magalu::class.java);
            startActivity(MagaluIntent);
        });
        mercado.setOnClickListener({
            var MercadoLivreIntent = Intent(this, Mercado::class.java);
            startActivity(MercadoLivreIntent);
        });
        netshoes.setOnClickListener({
            var NetshoesIntent = Intent(this, Netshoes::class.java);
            startActivity(NetshoesIntent);
        });
        submarino.setOnClickListener({
            var SubmarinoIntent = Intent(this, Submarino::class.java);
            startActivity(SubmarinoIntent);
        });
        webmotors.setOnClickListener({
            var WebmotorsIntent = Intent(this, Webmotors::class.java);
            startActivity(WebmotorsIntent);
        });
    }
}
