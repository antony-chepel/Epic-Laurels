package com.generamobile.headsoc.cbxhgyasd

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.generamobile.headsoc.databinding.ActivityPolwwiwjuhshuduwBinding
import com.generamobile.headsoc.euhuhuad.Xiosjdwuhuhashud

class Polwwiwjuhshuduw : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var ygisjdwuh : ActivityPolwwiwjuhshuduwBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ygisjdwuh = ActivityPolwwiwjuhshuduwBinding.inflate(layoutInflater)
        setContentView(ygisjdwuh.root)
        sharedPreferences = getSharedPreferences("record_epic", MODE_PRIVATE)
        uashdwji()
    }


    private fun uashdwji() = with(ygisjdwuh){
        val dijidjf = intent.getIntExtra("scores_epic",0)
        val iwiwjwidok = intent.getIntExtra("doubles_epic",0)
        val dopkdkokokovc = dijidjf * iwiwjwidok
        val stdtaasduh = sharedPreferences.getInt("record_epic",0)

        if(dopkdkokokovc < stdtaasduh){
            xizjcxzjijc.text = "Total west scores - $dopkdkokokovc"
            ygsgydhuhu.text = "Record scores - $stdtaasduh"
        } else {
            xizjcxzjijc.text = "Total west scores - $dopkdkokokovc"
            ygsgydhuhu.text = "Record scores - $dopkdkokokovc"
        }
        qpqplqlpqo.setOnClickListener {
            startActivity(Intent(this@Polwwiwjuhshuduw, Xiosjdwuhuhashud::class.java))
        }
    }
}