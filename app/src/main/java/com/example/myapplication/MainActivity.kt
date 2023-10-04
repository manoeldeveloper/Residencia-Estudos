package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Teste 1 do MANO"
        viewPager = findViewById(R.id.viewPager)
        nextButton = findViewById(R.id.nextButton)

        val images = listOf(
            R.drawable.imagem1,
            R.drawable.imagem2
        )

        val adapter = ImagePagerAdapter(images)
        viewPager.adapter = adapter

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                if (position == images.size - 1) {
                    nextButton.visibility = View.VISIBLE
                } else {
                    nextButton.visibility = View.GONE
                }
            }
        })

        nextButton.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.zoom_in, R.anim.slide_out)
        }

    }
}
