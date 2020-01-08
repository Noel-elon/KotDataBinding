package com.example.kotdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var doneBut : Button = findViewById(R.id.doneBUT)
        doneBut.setOnClickListener { updateView(it) }
    }

    private fun updateView(view: View) {
        var nameTv = findViewById<TextView>(R.id.nameTV)
        var nicknameEt = findViewById<EditText>(R.id.nicknameET)

        nameTv.text = nicknameEt.text
        nicknameEt.visibility = View.GONE
        view.visibility = View.GONE

    }


}
