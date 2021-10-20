package com.fenni.gymfen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        button4.setOnClickListener{
            button4.text = "Following"
            lbl_text.text = "791"
        }

        btn_back.setOnClickListener {
            val back = Intent(this@Profile, MainActivity::class.java)
            startActivity(back)
        }
    }
}