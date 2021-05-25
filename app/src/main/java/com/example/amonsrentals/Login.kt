package com.example.amonsrentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }


    fun login(view: View)
    {
        val context= this
        val uname= findViewById<EditText>(R.id.username)
        val pass= findViewById<EditText>(R.id.password1)

        if(uname.length() >0 && pass.length() >0 )
        {
            val user= User(uname.text.toString(), pass.text.toString())

            val db= DatabaseHandler(context)

            val suc = db.readData(user)
            if(suc==1)
            {
                //MOVE TO RENT
                val intent = Intent(this, Rent::class.java)
                startActivity(intent)
            }


        }
        else
        {
            Toast.makeText(context, "All Fields Are Required", Toast.LENGTH_SHORT).show()
        }

    }
}