package com.cosima.kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv: TextView = findViewById(R.id.tv) as TextView;
        tv.setText("Welcome to Kotlin");
        val toast: Button = findViewById(R.id.toast) as Button;

        toast.setOnClickListener {
            toastMe();
        }

        val btn_count: Button = findViewById(R.id.count) as Button;
        btn_count.setOnClickListener {
            countMe();
        }

        val btn_ran: Button = findViewById(R.id.random) as Button
        btn_ran.setOnClickListener {
            val ranIntent = Intent(this, SecondActivity::class.java)
            startActivity(ranIntent)
        }

    }//end of oncreate method


    fun toastMe() {
        val mytoast = Toast.makeText(this, "Hi there, am a toast using kotlin", Toast.LENGTH_SHORT)
        mytoast.show()
    }


    fun countMe() {
        val dsp: TextView = findViewById(R.id.dsp) as TextView
        val countString = dsp.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        dsp.text = count.toString()
    }

}
