package com.example.michelleaca.randomnumbers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        val myToast = Toast.makeText(this,"Hello Toast", Toast.LENGTH_LONG)
        myToast.show()
    }

    fun countMe(view: View){
       //val showCountTextView = findViewById(R.id.textView) as TextView

        val countString = textView.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        textView.text = count.toString();
    }

    fun randomMe (View:View){
        val randomIntent = Intent(this, Main2Activity::class.java)

        val countString = textView.text.toString()

        val count = Integer.parseInt(countString)

        randomIntent.putExtra(Main2Activity.TOTAL_COUNT, count)

        startActivity(randomIntent)

    }



}
