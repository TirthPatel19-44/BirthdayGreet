package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        another method for button click event
//        button1.setOnClickListener {
//        }
    }

    fun createBirthdayCard(view: View) {


//        val name = nameInput.editableText.toString()
//      just like prompt/alert in web-dev "toast" is a method here for
//        Toast.makeText(this, "Button was clicked", Toast.LENGTH_LONG).show()
//        }
//        Toast.makeText(this, "name is $name", Toast.LENGTH_LONG).show()

        val name = nameInput.editableText.toString()

        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
        startActivity(intent)
    }

}
