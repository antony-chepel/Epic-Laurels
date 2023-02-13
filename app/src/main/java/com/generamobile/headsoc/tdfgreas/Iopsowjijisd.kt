package com.generamobile.headsoc.tdfgreas
import java.util.concurrent.TimeUnit
import android.content.Intent
import com.generamobile.headsoc.tdfgreas.Cwowoowijduw.Companion.eokwkokosd
import com.generamobile.headsoc.tdfgreas.Cwowoowijduw.Companion.apoaksjqi
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.generamobile.headsoc.cbxhgyasd.Juysiwjsuhdhus
import com.generamobile.headsoc.databinding.ActivityEiwijsuhdwasdBinding
import com.generamobile.headsoc.euhuhuad.Xiosjdwuhuhashud
import com.generamobile.headsoc.tdfgreas.Cwowoowijduw.Companion.ncnxnvjisdji
import com.generamobile.headsoc.tdfgreas.Cwowoowijduw.Companion.iidjifisd
import com.generamobile.headsoc.tdfgreas.Cwowoowijduw.Companion.reokkoajsdijias



import com.orhanobut.hawk.Hawk
import java.util.concurrent.Executors


class Iopsowjijisd : AppCompatActivity() {
    lateinit var kofokrkokosdjifisdj: ActivityEiwijsuhdwasdBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        kofokrkokosdjifisdj = ActivityEiwijsuhdwasdBinding.inflate(layoutInflater)
        setContentView(kofokrkokosdjifisdj.root)

        val pposlsldjiwjidjq: String? = Hawk.get(iidjifisd, "null")

        if (pposlsldjiwjidjq == "1") {
            AppsFlyerLib.getInstance()
                .init("PtLjvvUzhsMtesv4nDAT5V", aplapslpqokjsiajdias, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        xokxkokojidjisa()

    }

    private val aplapslpqokjsiajdias = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(eokdskod: MutableMap<String, Any>?) {
            val rokewkokod = eokdskod?.get("campaign").toString()
            Hawk.put(reokkoajsdijias, rokewkokod)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }

    private fun rokekookskoakda() {
        val uhcxhuvjsdijisdv = Intent(this@Iopsowjijisd, Juysiwjsuhdhus::class.java)
        Hawk.put(eokwkokosd, null)
        Hawk.put(ncnxnvjisdji, null)
        startActivity(uhcxhuvjsdijisdv)
        finish()
    }



    private fun xokxkokojidjisa() {


        val owowijsdauh: String = Hawk.get(eokwkokosd)
        val zzoozozkijsdji: String? = Hawk.get(apoaksjqi, "null")

        val ppxolzcsaji: String? = Hawk.get(iidjifisd, "null")
        val rijjidsfji: String = Hawk.get(ncnxnvjisdji, "null")
        var pdlsokkofskofsd: String? = Hawk.get(reokkoajsdijias)


        if (ppxolzcsaji == "1") {
            val owowijwqhushd = Executors.newSingleThreadScheduledExecutor()
            owowijwqhushd.scheduleAtFixedRate({
                if (pdlsokkofskofsd != null) {

                    if (pdlsokkofskofsd!!.contains("tdb2") || owowijsdauh.contains(rijjidsfji) || zzoozozkijsdji!!.contains("tdb2")) {
                        owowijwqhushd.shutdown()
                        rokekookskoakda()
                    } else {
                        owowijwqhushd.shutdown()
                        okfkojijixucvkokdos()
                    }
                } else {
                    pdlsokkofskofsd = Hawk.get(reokkoajsdijias)
                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (owowijsdauh.contains(rijjidsfji)) {
            rokekookskoakda()
        } else {
            okfkojijixucvkokdos()
        }

    }


    private fun okfkojijixucvkokdos() {
        val pwpllwpkoskoad = Intent(this@Iopsowjijisd, Xiosjdwuhuhashud::class.java)
        Hawk.put(eokwkokosd, null)
        Hawk.put(ncnxnvjisdji, null)
        startActivity(pwpllwpkoskoad)
        finish()
    }







}