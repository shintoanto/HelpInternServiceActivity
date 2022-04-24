package com.shinto_pa.helpinternserviceactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        val bkd: CardView = findViewById(R.id.bkdBtn)
        bkd.setOnClickListener {
            val intent = Intent(applicationContext, BookedService::class.java)
            startActivity(intent)
        }
        val registerServ: CardView = findViewById(R.id.registerBtnC)
        registerServ.setOnClickListener {
            val intent = Intent(applicationContext, RegisterService::class.java)
            startActivity(intent)
        }

        val imgAccoulnt: ImageView = findViewById(R.id.imgAccoulnt)
        imgAccoulnt.setOnClickListener {
            val intent = Intent(applicationContext, ProfilePage::class.java)
            startActivity(intent)
        }
    }
}