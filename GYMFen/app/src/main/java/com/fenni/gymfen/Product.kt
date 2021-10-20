package com.fenni.gymfen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_product.*

class Product : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        btn_back.setOnClickListener {
            val back = Intent(this@Product, MainActivity::class.java)
            startActivity(back)
        }

    }
}