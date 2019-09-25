package br.com.vinimanara.deeplink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uri = intent.data
        if (uri!=null){
            val productId = uri.getQueryParameter("productId")
            tvProductId.text = "Produto clicado: $productId"
        }
    }
}
