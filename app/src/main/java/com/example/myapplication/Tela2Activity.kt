package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Tela2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Teste 2 do MANO"
        setContentView(R.layout.activity_tela2)
    }
}
