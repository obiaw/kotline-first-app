package com.cosima.kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

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
//            val ranIntent = Intent(this, SecondActivity::class.java)
//            // Add the count to the extras for the Intent.
//            ranIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
//
//            startActivity(ranIntent)
            randomMe()
        }

    }//end of oncreate method

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    fun toastMe() {
        val mytoast = Toast.makeText(this, "Hi there, am a toast using kotlin", Toast.LENGTH_SHORT)
        mytoast.show()
    }

fun randomMe(){
    // Create an Intent to start the second activity
    val randomIntent = Intent(this, SecondActivity::class.java)
    // Get the current value of the text view.
    val countString = dsp.text.toString()

    // Convert the count to an int
    val count = Integer.parseInt(countString)
    // Add the count to the extras for the Intent.
    randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)
    // Start the new activity.
    startActivity(randomIntent)
}

    fun countMe() {
        val dsp: TextView = findViewById(R.id.dsp) as TextView
        val countString = dsp.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        dsp.text = count.toString()
    }


}
