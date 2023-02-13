package com.generamobile.headsoc.euhuhuad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.generamobile.headsoc.databinding.ActivityXiosjdwuhuhashudBinding
import com.google.android.material.snackbar.Snackbar

class Xiosjdwuhuhashud : AppCompatActivity() {
    private lateinit var kxijsauhd : ActivityXiosjdwuhuhashudBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kxijsauhd = ActivityXiosjdwuhuhashudBinding.inflate(layoutInflater)
        setContentView(kxijsauhd.root)
        oijduhs()
    }


    private fun oijduhs() = with(kxijsauhd){
        epLSett.setOnClickListener {
            Snackbar.make(kxijsauhd.root,"Coming soon...",Snackbar.LENGTH_SHORT).show()
        }
        epLEx.setOnClickListener {
            finish()
        }
        imEpStrt.setOnClickListener {
            startActivity(Intent(this@Xiosjdwuhuhashud,Uiwowokshbnxcus::class.java))
        }
    }
}