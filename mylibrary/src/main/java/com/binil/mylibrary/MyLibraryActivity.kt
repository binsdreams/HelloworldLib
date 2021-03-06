package com.binil.mylibrary

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
open class MyLibraryActivity : AppCompatActivity() {

    companion object{
        open fun getIntent(context: Context): Intent {
            return Intent(context,MyLibraryActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)
        setSupportActionBar(findViewById(R.id.toolbar))
    }

}