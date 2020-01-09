package com.example.kotdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.kotdatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)



       // var doneBut : Button = findViewById(R.id.doneBUT)
        binding.doneBUT.setOnClickListener { updateView(it) }
    }

    private fun updateView(view: View) {
//        var nameTv = findViewById<TextView>(R.id.nameTV)
  //      var nicknameEt = findViewById<EditText>(R.id.nicknameET)
binding.apply {
    nameTV.text = nicknameET.text
    nicknameET.visibility = View.GONE
    view.visibility = View.GONE
    invalidateAll()

}


    }


}
