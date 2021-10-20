package com.fenni.gymfen

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val REQUEST_CODE = 100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_profile.setOnClickListener {
            val profile = Intent(this@MainActivity, Profile::class.java)
            startActivity(profile)
        }

        btn_product.setOnClickListener {
            val product = Intent(this@MainActivity, Product::class.java)
            startActivity(product)
        }

        btn_detail.setOnClickListener {
            val detail = Intent(this@MainActivity, Detail::class.java)
            startActivity(detail)
        }

        btn_implicit_intent.setOnClickListener {
            val phoneNumber = "082350474732"
            val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:$phoneNumber"))
            intent.putExtra("sms_body", "Hello, Fenni!")
            startActivity(intent)
        }

        btn_intent.setOnClickListener {
            val result = Intent(this@MainActivity, ResultActivity::class.java)
            startActivityForResult(result, REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == 200) {
            val color = data?.getStringExtra(ResultActivity.EXTRA_COLOR)
            view_content.setBackgroundColor(Color.parseColor(color))
        }
    }
}