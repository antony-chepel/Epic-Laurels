package com.generamobile.headsoc

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.facebook.applinks.AppLinkData
import com.generamobile.headsoc.cbxhgyasd.Fisushaudwsd
import com.generamobile.headsoc.databinding.ActivityMainBinding
import com.generamobile.headsoc.euhuhuad.Boowowijshudwsad
import com.generamobile.headsoc.tdfgreas.Cwowoowijduw
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var orkkoekojisajida: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        orkkoekojisajida = ActivityMainBinding.inflate(layoutInflater)
        setContentView(orkkoekojisajida.root)

        bgiivcjibjif(this)

        val xhhcuhhusahu = Executors.newSingleThreadScheduledExecutor()
        var qpqlkowkokosd: String? = Hawk.get(Cwowoowijduw.ncnxnvjisdji, null)
        var yhuchujijijizas: String? = Hawk.get(Cwowoowijduw.eokwkokosd, null)
        xhhcuhhusahu.scheduleAtFixedRate({
            if (qpqlkowkokosd != null && yhuchujijijizas != null) {
                xhhcuhhusahu.shutdown()
                tyxyuucijsjai()
            } else {
                qpqlkowkokosd = Hawk.get(Cwowoowijduw.ncnxnvjisdji)
                yhuchujijijizas = Hawk.get(Cwowoowijduw.eokwkokosd)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch (Dispatchers.IO){
            trueuijsijdjia
        }
    }



    private suspend fun frkoekokodjisjif() {
        val nncxjxjuhsdhuv = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://epiclaurels.art/")
            .build()
            .create(Boowowijshudwsad::class.java)
        val itijifjigjif = nncxjxjuhsdhuv.eyeiijwjijiijasdija().body()?.rokekookkojif.toString()
        val qoqookwksjid = nncxjxjuhsdhuv.eyeiijwjijiijasdija().body()?.ppsoskdokwjiwdij.toString()
        val isdjidjwiiwijduhshuahdu = nncxjxjuhsdhuv.eyeiijwjijiijasdija().body()?.nnnckxkijdf.toString()


        Hawk.put(Cwowoowijduw.tdfy, itijifjigjif)
        Hawk.put(Cwowoowijduw.iidjifisd, qoqookwksjid)
        Hawk.put(Cwowoowijduw.eokwkokosd, isdjidjwiiwijduhshuahdu)

    }

    private fun tyxyuucijsjai() {
        val gokgfkofgokjivjicb = Intent(this@MainActivity, Fisushaudwsd::class.java)
        startActivity(gokgfkofgokjivjicb)
        finish()
    }

    private suspend fun rokekoekojisdjxcjnjmn() {
        val oekkowkokoskd = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(Boowowijshudwsad::class.java)
        val appapaoaoakkos = oekkowkokoskd.usaiidjijxzjicjxzc().body()?.rokdsfoko
        Log.d("Data from API", appapaoaoakkos.toString())

        Hawk.put(Cwowoowijduw.ncnxnvjisdji, appapaoaoakkos)
    }

    private val trueuijsijdjia: Job = GlobalScope.launch (Dispatchers.IO){
        rokekoekojisdjxcjnjmn()
        frkoekokodjisjif()
    }

    fun bgiivcjibjif(yywuwwijsd: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            yywuwwijsd
        ) { sooskoxkocji: AppLinkData? ->
            sooskoxkocji?.let {
                val woowowowkijsdji = sooskoxkocji.targetUri?.host.toString()
                Hawk.put(Cwowoowijduw.apoaksjqi, woowowowkijsdji)
            }
        }
    }


}