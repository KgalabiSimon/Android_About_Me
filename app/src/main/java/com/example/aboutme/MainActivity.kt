package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity.INPUT_METHOD_SERVICE as INPUT_METHOD_SERVICE1


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val doneButton :Button = findViewById(R.id.done_button)

        doneButton.setOnClickListener{
            addNickname()
        }

    }


    private fun addNickname(){

        //define val
        val editText: EditText = findViewById(R.id.nick_name_edit)
        val nickNameTextView: TextView = findViewById(R.id.nickname_text)

        nickNameTextView.text = editText.text

        editText.visibility = View.GONE
        nickNameTextView.visibility = View.VISIBLE

        // Hide the keyboard.

        //val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        //imm.(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)

    }
}