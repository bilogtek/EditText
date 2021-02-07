package com.example.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listedizi= mutableListOf("ilk")
        val btn=findViewById<Button>(R.id.btn)
        val btnail=findViewById<Button>(R.id.btnsil)
        val liste=findViewById<ListView>(R.id.listemiz)
        val girilenmetin=findViewById<EditText>(R.id.metin)
        val yazialani=findViewById<TextView>(R.id.yazialani)
        girilenmetin.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                yazialani.text=s
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
        btn.setOnClickListener(View.OnClickListener {
                var sayac=0
            listedizi.remove("ilk")

            var gelenyazi:String=girilenmetin.text.toString()
            listedizi.add(sayac,gelenyazi)
            var diziekle=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listedizi)
            liste.adapter=diziekle
            sayac++
        })
        btnail.setOnClickListener(View.OnClickListener {
            var sayac=0
            listedizi.remove("ilk")

            var gelenyazi:String=girilenmetin.text.toString()
            listedizi.remove(gelenyazi)
            var diziekle=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listedizi)
            liste.adapter=diziekle
            sayac++
        })



    }
}