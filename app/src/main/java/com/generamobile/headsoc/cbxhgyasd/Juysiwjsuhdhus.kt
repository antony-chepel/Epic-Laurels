package com.generamobile.headsoc.cbxhgyasd
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import java.io.IOException
import android.widget.Toast
import android.content.Intent
import com.generamobile.headsoc.R
import com.generamobile.headsoc.databinding.ActivityQokwosjdwhugyygwdBinding
import android.util.Log
import com.orhanobut.hawk.Hawk
import com.generamobile.headsoc.tdfgreas.Cwowoowijduw.Companion.reokkoajsdijias
import com.generamobile.headsoc.tdfgreas.Cwowoowijduw.Companion.roekookkoasjidjias
import android.content.pm.PackageManager
import android.net.Uri

import android.annotation.SuppressLint
import android.app.Activity

import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore

import android.webkit.*


import com.generamobile.headsoc.tdfgreas.Cwowoowijduw.Companion.apoaksjqi
import com.generamobile.headsoc.tdfgreas.Cwowoowijduw.Companion.tdfy
import com.appsflyer.AppsFlyerLib






import org.json.JSONException
import org.json.JSONObject

import java.io.File


class Juysiwjsuhdhus : AppCompatActivity() {

    var kkcixjvuhsd = ""
    var jnnjcjnxvuhhusdu: ValueCallback<Array<Uri>>? = null
    var tokkokorkojids: String? = null
    var rokkookdkosf = ""

    lateinit var pzlzlplposkodkowk: ActivityQokwosjdwhugyygwdBinding
    private var hhhcbvjijisdjs = false
    private val twyhuhusdjiaijasd = 1
    lateinit var pqllpqlpskodjiwji: WebView






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pzlzlplposkodkowk = ActivityQokwosjdwhugyygwdBinding.inflate(layoutInflater)
        setContentView(pzlzlplposkodkowk.root)

        pqllpqlpskodjiwji = pzlzlplposkodkowk.gdtdiijxjics
        Snackbar.make(
            pzlzlplposkodkowk.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val hucxkokovkxo = CookieManager.getInstance()
        hucxkokovkxo.setAcceptCookie(true)
        hucxkokovkxo.setAcceptThirdPartyCookies(pqllpqlpskodjiwji, true)
        woowqpwlpokskodkoas()
        val rokeokoksd: Activity = this
        pqllpqlpskodjiwji.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(pzlzlpoxokjisd: WebView, otkokkooskdf: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(otkokkooskdf)) {
                        return false
                    }
                    if (sopssoadjiasjida(otkokkooskdf)) {

                        val hhhcxijjijids = Intent(Intent.ACTION_VIEW)
                        hhhcxijjijids.data = Uri.parse(otkokkooskdf)
                        startActivity(hhhcxijjijids)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                pzlzlpoxokjisd.loadUrl(otkokkooskdf)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)

                prlrlelpkodkosf(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(rokeokoksd, description, Toast.LENGTH_SHORT).show()
            }


        }
        pqllpqlpskodjiwji.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                qoqkowkooskda: WebView, gjijijicvbi: ValueCallback<Array<Uri>>,
                llodspdfeowkf: FileChooserParams
            ): Boolean {
                this@Juysiwjsuhdhus.jnnjcjnxvuhhusdu?.onReceiveValue(null)
                this@Juysiwjsuhdhus.jnnjcjnxvuhhusdu = gjijijicvbi
                var nnncxijxjiuhhudf: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (nnncxijxjiuhhudf!!.resolveActivity(packageManager) != null) {

                    var orokkokdoskofkds: File? = null
                    try {
                        orokkokdoskofkds = hhvciijjidsjifhuew()
                        nnncxijxjiuhhudf.putExtra("PhotoPath", tokkokorkojids)
                    } catch (ex: IOException) {

                    }

                    if (orokkokdoskofkds != null) {
                        tokkokorkojids = "file:" + orokkokdoskofkds.absolutePath
                        nnncxijxjiuhhudf.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(orokkokdoskofkds)
                        )
                    } else {
                        nnncxijxjiuhhudf = null
                    }
                }
                val zoozkkokoxjijisd = Intent(Intent.ACTION_GET_CONTENT)
                zoozkkokoxjijisd.addCategory(Intent.CATEGORY_OPENABLE)
                zoozkkokoxjijisd.type = "image/*"
                val rokekokokdkfsjifsjisjfd: Array<Intent?> =
                    nnncxijxjiuhhudf?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val psspslplplpsdowokd = Intent(Intent.ACTION_CHOOSER)
                psspslplplpsdowokd.putExtra(Intent.EXTRA_INTENT, zoozkkokoxjijisd)
                psspslplplpsdowokd.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                psspslplplpsdowokd.putExtra(Intent.EXTRA_INITIAL_INTENTS, rokekokokdkfsjifsjisjfd)
                startActivityForResult(
                    psspslplplpsdowokd, twyhuhusdjiaijasd
                )
                return true
            }

            @Throws(IOException::class)
            private fun hhvciijjidsjifhuew(): File {
                var jjjcxujixjivusdh = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!jjjcxujixjivusdh.exists()) {
                    jjjcxujixjivusdh.mkdirs()
                }

                jjjcxujixjivusdh =
                    File(jjjcxujixjivusdh.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return jjjcxujixjivusdh
            }

        }

        pqllpqlpskodjiwji.loadUrl(okkoqkokoskod())
    }












    private fun okkoqkokoskod(): String {
        val cxhvhysdjisdvjis = "deeporg"
        val osoiwijijds = "ad_id="

        val roekokoeokwokijasjidjiasuh = "sub_id_6="
        val appaalskooksakod = "sub_id_1="

        val qppqqokskokodskoaokdji: String? = Hawk.get(roekookkoasjidjias, "null")
        val fodjigjif = Build.VERSION.RELEASE
        val jjcuhdsfejief = "naming"

        val eokkokasodkoa = Hawk.get(tdfy, "null")
        val apapaokskodokw = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
        val gcjijijijixcv = "sub_id_4="
        val hhvbcuhdjifdjis = "deviceID="

        val popsokdiwjuhdhusahu: String? = Hawk.get(apoaksjqi, "null")
        val ckckkckckxcijsdhuuhdvs:String? = Hawk.get(reokkoajsdijias, "null")
        val eookkoskoadko = "sub_id_5="

        val qpaookskokodwjiuhsahnds = "com.generamobile.headsoc"
        val bbvncncijbjiv = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        if (ckckkckckxcijsdhuuhdvs != "null"){
            kkcixjvuhsd = "$eokkokasodkoa$appaalskooksakod$ckckkckckxcijsdhuuhdvs&$hhvbcuhdjifdjis$bbvncncijbjiv&$osoiwijijds$qppqqokskokodskoaokdji&$gcjijijijixcv$qpaookskokodwjiuhsahnds&$eookkoskoadko$fodjigjif&$roekokoeokwokijasjidjiasuh$jjcuhdsfejief"
            rookekokosadhuqw(bbvncncijbjiv.toString())
        } else {
            kkcixjvuhsd = "$eokkokasodkoa$appaalskooksakod$popsokdiwjuhdhusahu&$hhvbcuhdjifdjis$bbvncncijbjiv&$osoiwijijds$qppqqokskokodskoaokdji&$gcjijijijixcv$qpaookskokodwjiuhsahnds&$eookkoskoadko$fodjigjif&$roekokoeokwokijasjidjiasuh$cxhvhysdjisdvjis"
            rookekokosadhuqw(bbvncncijbjiv.toString())
        }

        Log.d("TESTAG", "Test Result $kkcixjvuhsd")
        return apapaokskodokw.getString("SAVED_URL", kkcixjvuhsd).toString()
    }




    private fun sopssoadjiasjida(yyctxfvxc: String): Boolean {

        val appppxxlxllxijsd = packageManager
        try {

            appppxxlxllxijsd.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    fun prlrlelpkodkosf(kogkooovcbo: String?) {
        if (!kogkooovcbo!!.contains("t.me")) {

            if (rokkookdkosf == "") {
                rokkookdkosf = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    kogkooovcbo
                ).toString()

                val dpleldkof = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val qpwlpokskokodajijijixc = dpleldkof.edit()
                qpwlpokskokodajijijixc.putString("SAVED_URL", kogkooovcbo)
                qpwlpokskokodajijijixc.apply()
            }
        }
    }





    override fun onBackPressed() {


        if (pqllpqlpskodjiwji.canGoBack()) {
            if (hhhcbvjijisdjs) {
                pqllpqlpskodjiwji.stopLoading()
                pqllpqlpskodjiwji.loadUrl(rokkookdkosf)
            }
            this.hhhcbvjijisdjs = true
            pqllpqlpskodjiwji.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                hhhcbvjijisdjs = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }


    private fun rookekokosadhuqw(cokxokokkdf: String) {
        OneSignal.setExternalUserId(
            cokxokokkdf,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(hhhbcxijjid: JSONObject) {
                    try {
                        if (hhhbcxijjid.has("push") && hhhbcxijjid.getJSONObject("push").has("success")) {
                            val qpqlpqwlpoks = hhhbcxijjid.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $qpqlpqwlpoks"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (hhhbcxijjid.has("email") && hhhbcxijjid.getJSONObject("email").has("success")) {
                            val splwlpskodjiwjid =
                                hhhbcxijjid.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $splwlpskodjiwjid"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (hhhbcxijjid.has("sms") && hhhbcxijjid.getJSONObject("sms").has("success")) {
                            val xoocppclvokdjidhusd = hhhbcxijjid.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $xoocppclvokdjidhusd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    override fun onActivityResult(rookokokd: Int, appaoskjidwji: Int, gjijivcijbi: Intent?) {
        if (rookokokd != twyhuhusdjiaijasd || jnnjcjnxvuhhusdu == null) {
            super.onActivityResult(rookokokd, appaoskjidwji, gjijivcijbi)
            return
        }
        var eokodsijjasd: Array<Uri>? = null


        if (appaoskjidwji == AppCompatActivity.RESULT_OK) {
            if (gjijivcijbi == null || gjijivcijbi.data == null) {

                eokodsijjasd = arrayOf(Uri.parse(tokkokorkojids))
            } else {
                val mmcmxkkcvji = gjijivcijbi.dataString
                if (mmcmxkkcvji != null) {
                    eokodsijjasd = arrayOf(Uri.parse(mmcmxkkcvji))
                }
            }
        }
        jnnjcjnxvuhhusdu?.onReceiveValue(eokodsijjasd)
        jnnjcjnxvuhhusdu = null
    }



    @SuppressLint("SetJavaScriptEnabled")
    private fun woowqpwlpokskodkoas() {

        val kckckxvjijisdjivs = pqllpqlpskodjiwji.settings
        kckckxvjijisdjivs.javaScriptCanOpenWindowsAutomatically = true
        kckckxvjijisdjivs.displayZoomControls = false

        kckckxvjijisdjivs.pluginState = WebSettings.PluginState.ON
        kckckxvjijisdjivs.builtInZoomControls = true
        kckckxvjijisdjivs.useWideViewPort = true

        kckckxvjijisdjivs.allowContentAccess = true
        kckckxvjijisdjivs.allowFileAccess = true
        kckckxvjijisdjivs.domStorageEnabled = true

        kckckxvjijisdjivs.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        kckckxvjijisdjivs.loadWithOverviewMode = true

        kckckxvjijisdjivs.setSupportMultipleWindows(false)
        kckckxvjijisdjivs.setSupportZoom(true)
        kckckxvjijisdjivs.userAgentString = kckckxvjijisdjivs.userAgentString.replace("; wv", "")
        kckckxvjijisdjivs.javaScriptEnabled = true


    }



}