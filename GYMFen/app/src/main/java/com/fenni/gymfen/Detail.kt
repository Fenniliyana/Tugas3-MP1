package com.fenni.gymfen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        btn_back.setOnClickListener {
            val back = Intent(this@Detail, MainActivity::class.java)
            startActivity(back)
        }
    }
}