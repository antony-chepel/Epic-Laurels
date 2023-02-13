package com.generamobile.headsoc.cbxhgyasd
import kotlinx.coroutines.Dispatchers
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.GlobalScope
import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.generamobile.headsoc.R
import com.generamobile.headsoc.euhuhuad.Xiosjdwuhuhashud
import com.generamobile.headsoc.tdfgreas.Iopsowjijisd
import com.generamobile.headsoc.tdfgreas.Cwowoowijduw.Companion.ncnxnvjisdji
import com.generamobile.headsoc.tdfgreas.Cwowoowijduw.Companion.iidjifisd
import com.generamobile.headsoc.tdfgreas.Cwowoowijduw.Companion.eokwkokosd
import com.generamobile.headsoc.tdfgreas.Cwowoowijduw.Companion.roekookkoasjidjias

import com.google.android.gms.ads.identifier.AdvertisingIdClient



import kotlinx.coroutines.launch

class Fisushaudwsd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eiwijsuhdwasd)
        uhkokokocxvkohudshuvds()
    }




    private fun qqkoqokwplplsdok(){
        val kkkcixijjivhudhus = AdvertisingIdClient(applicationContext)
        kkkcixijjivhudhus.start()
        val xplxclppasok = kkkcixijjivhudhus.info.id
        Log.d("getAdvertisingId = ", xplxclppasok.toString())
        Hawk.put(roekookkoasjidjias, xplxclppasok)
    }

    private fun jixcjiuhhuds() {
        val oskokwkoqokjisjida = Intent(this@Fisushaudwsd, Xiosjdwuhuhashud::class.java)
        Hawk.put(eokwkokosd, null)
        Hawk.put(ncnxnvjisdji, null)
        startActivity(oskokwkoqokjisjida)
        finish()
    }



    private fun tywwijwjisauhdhuas(): String? {
        val appooskkdwji: String? = Hawk.get(iidjifisd)
        Log.d("ADACt Data", appooskkdwji.toString())
        return appooskkdwji
    }



    private fun uhkokokocxvkohudshuvds() {

        val rjidjisokokkocxv = tywwijwjisauhdhuas()

        if (rjidjisokokkocxv == "0") {
            jixcjiuhhuds()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                qqkoqokwplplsdok()
            }
            fkookkocjijivxchuhusd()
        }
    }


    private fun fkookkocjijivxchuhusd() {
        val zllzlookijhusdhua = Intent(this@Fisushaudwsd, Iopsowjijisd::class.java)
        startActivity(zllzlookijhusdhua)
        finish()
    }



}