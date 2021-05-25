package com.example.amonsrentals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class Rent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rent)
    }
    fun rent(view: View)
    {
        val context= this

        val fname= findViewById<EditText>(R.id.full_name)
        val pay= findViewById<EditText>(R.id.payment)
        val p_number= findViewById<EditText>(R.id.phone_number)
        val car= findViewById<EditText>(R.id.vehicle)
        val  date = findViewById<EditText>(R.id.date)
        val dur= findViewById<EditText>(R.id.duration)
        if(fname.length() >0 && pay.length()>0 && p_number.length()>0 &&  car.length()>0 &&  date.length()>0 &&  dur.length()>0)
        {
            var rent= Rental(fname.text.toString(), pay.text.toString(), p_number.text.toString(), car.text.toString(), date.text.toString(), dur.text.toString())
            var db= DatabaseHandler(context)

            val suc= db.insertRent(rent)

            if(suc==1)
            {
                //MOVE TO WELCOME
                val intent= Intent(this, Welcome::class.java)

                startActivity(intent)
            }

        }
        else
        {
            Toast.makeText(context, "All Fields Are Required", Toast.LENGTH_SHORT).show()
        }
    }





}