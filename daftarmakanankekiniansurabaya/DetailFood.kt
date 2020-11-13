package com.example.daftarmakanankekiniansurabaya

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import kotlinx.android.synthetic.main.detail_food.*

class DetailFood : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_food)

        val intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            val image = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            val name = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            val desc = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            val address = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
            imageFood.setImageResource(image)
            nameFood.text = name
            descFood.text = desc
            addressFood.text = address
        }
    }
}