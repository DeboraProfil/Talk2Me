package com.ilustris.tinder2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class Login : AppCompatActivity() {

    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Login: Button
    private lateinit var edt: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}