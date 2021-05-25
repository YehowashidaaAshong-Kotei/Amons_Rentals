package com.example.amonsrentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun moveToRegister(view: View) {

        val intent = Intent(this, Register::class.java)

        startActivity(intent)
    }

    fun moveToLogin(view: View) {

        val intent = Intent(this,Login::class.java)

        startActivity(intent)
    }

    fun moveToRent(view: View){

        val intent= Intent(this, Rent::class.java)

        startActivity(intent)
    }








}


