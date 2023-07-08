package com.green.thecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Naming Variables
        val btn_counting: Button = findViewById(R.id.btn_counter)
        val txt_showing_results : TextView = findViewById(R.id.txt_show_result)

        // Button will increase count with the increaseCount Method
        btn_counting.setOnClickListener(){
            counter++
            txt_showing_results.setText(""+counter)
        }

    }
}