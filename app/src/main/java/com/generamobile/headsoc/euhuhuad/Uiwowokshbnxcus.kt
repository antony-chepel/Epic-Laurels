package com.generamobile.headsoc.euhuhuad

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.generamobile.headsoc.R
import com.generamobile.headsoc.cbxhgyasd.Polwwiwjuhshuduw
import com.generamobile.headsoc.databinding.ActivityUiwowokshbnxcusBinding
import kotlin.random.Random

class Uiwowokshbnxcus : AppCompatActivity() {
    var rewijjijisdhuwu = 0
    private lateinit var llxozczpxlasko : ActivityUiwowokshbnxcusBinding
    private lateinit var gijrijijdisjf: SharedPreferences
    val ijijriijrjie = listOf(
        50,
        100,
        150,
        200,
        250,
        280,
        300,
        320,
        360,
        410,
        490,
        520,
        515,
        600,
        1000
    )

    var swosdjiwji = 0
    var mmxckvsdji = 0

    val tteueiwjijisd = listOf(
        0.3,
        0.2,
        0.5,
        0.8,
        1.0,
        1.2,
        1.5,
        2.0,

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        llxozczpxlasko = ActivityUiwowokshbnxcusBinding.inflate(layoutInflater)
        setContentView(llxozczpxlasko.root)
        val nncjxijvsdi = listOf(
            R.drawable.elus_1,
            R.drawable.elus_2,
            R.drawable.elus_3,
            R.drawable.elus_4,
            R.drawable.elus_5,
            R.drawable.elus_6,
        )
        val owk = nncjxijvsdi[Random.nextInt(6)]
        val qpqpqpqlko = nncjxijvsdi[Random.nextInt(6)]
        val jjcxhuvuhdshu = nncjxijvsdi[Random.nextInt(6)]
        val osdoak = nncjxijvsdi[Random.nextInt(6)]
        llxozczpxlasko.yijzxjci.setImageResource(owk)
        llxozczpxlasko.psoodkowkdko.setImageResource(qpqpqpqlko)
        llxozczpxlasko.nnxcjnvc.setImageResource(jjcxhuvuhdshu)
        llxozczpxlasko.eopksokadkodkoas.setImageResource(osdoak)

        gijrijijdisjf = getSharedPreferences("record_epic", MODE_PRIVATE)
        yijwquehu()

    }


    private fun yijwquehu() = with(llxozczpxlasko){
        ropkodkosfsji.setOnClickListener {
            ropkodkosfsji.alpha = 0.6f
            ropkodkosfsji.isEnabled = false
            ropkodkosfsji.isClickable = false
            rewijjijisdhuwu +=1
            val iiisodk = ijijriijrjie[Random.nextInt(15)]
            val sijdwji = tteueiwjijisd[Random.nextInt(8)]
            swosdjiwji +=iiisodk
            mmxckvsdji +=sijdwji.toInt()
            val fokkrokoasdkof = swosdjiwji * mmxckvsdji
            gijrijijdisjf.edit().putInt("record_epic",fokkrokoasdkof).apply()
            owkowoksijd.text = "West scores : $swosdjiwji"
            mmcxkxcioivjjisdji.text = "Doubles bonuses : $mmxckvsdji x"
            if(rewijjijisdhuwu ==4){
                startActivity(Intent(this@Uiwowokshbnxcus, Polwwiwjuhshuduw::class.java)
                    .putExtra("scores_epic",swosdjiwji)
                    .putExtra("doubles_epic",mmxckvsdji)

                )
        }



        }

        yyuwuwij.setOnClickListener {
            yyuwuwij.alpha = 0.6f
            yyuwuwij.isEnabled = false
            yyuwuwij.isClickable = false
            rewijjijisdhuwu +=1
            val kcxvijijds = ijijriijrjie[Random.nextInt(15)]
            val reushd = tteueiwjijisd[Random.nextInt(8)]
            swosdjiwji +=kcxvijijds
            mmxckvsdji +=reushd.toInt()
            val llxlcoksjiajic = swosdjiwji * mmxckvsdji
            gijrijijdisjf.edit().putInt("record_epic",llxlcoksjiajic).apply()
            owkowoksijd.text = "West scores : $swosdjiwji"
            mmcxkxcioivjjisdji.text = "Doubles bonuses : $mmxckvsdji x"
            if(rewijjijisdhuwu ==4){
                startActivity(Intent(this@Uiwowokshbnxcus, Polwwiwjuhshuduw::class.java)
                    .putExtra("scores_epic",swosdjiwji)
                    .putExtra("doubles_epic",mmxckvsdji)

                )
            }



        }

        oeooeijsjid.setOnClickListener {
            oeooeijsjid.alpha = 0.6f
            oeooeijsjid.isEnabled = false
            oeooeijsjid.isClickable = false
            rewijjijisdhuwu +=1
            val jcjvn = ijijriijrjie[Random.nextInt(15)]
            val eokskod = tteueiwjijisd[Random.nextInt(8)]
            swosdjiwji +=jcjvn
            mmxckvsdji +=eokskod.toInt()
            val uxucuzhuc = swosdjiwji * mmxckvsdji
            gijrijijdisjf.edit().putInt("record_epic",uxucuzhuc).apply()
            owkowoksijd.text = "West scores : $swosdjiwji"
            mmcxkxcioivjjisdji.text = "Doubles bonuses : $mmxckvsdji x"
            if(rewijjijisdhuwu ==4){
                startActivity(Intent(this@Uiwowokshbnxcus, Polwwiwjuhshuduw::class.java)
                    .putExtra("scores_epic",swosdjiwji)
                    .putExtra("doubles_epic",mmxckvsdji)

                )
            }



        }

        ppwlpwlpwllpwkosdko.setOnClickListener {
            ppwlpwlpwllpwkosdko.alpha = 0.6f
            ppwlpwlpwllpwkosdko.isEnabled = false
            ppwlpwlpwllpwkosdko.isClickable = false
            rewijjijisdhuwu +=1
            val hcxb = ijijriijrjie[Random.nextInt(15)]
            val sopdskosdko = tteueiwjijisd[Random.nextInt(8)]
            swosdjiwji +=hcxb
            mmxckvsdji +=sopdskosdko.toInt()
            val rijdjif = swosdjiwji * mmxckvsdji
            gijrijijdisjf.edit().putInt("record_epic",rijdjif).apply()
            owkowoksijd.text = "West scores : $swosdjiwji"
            mmcxkxcioivjjisdji.text = "Doubles bonuses : $mmxckvsdji x"
            if(rewijjijisdhuwu ==4){
                startActivity(Intent(this@Uiwowokshbnxcus, Polwwiwjuhshuduw::class.java)
                    .putExtra("scores_epic",swosdjiwji)
                    .putExtra("doubles_epic",mmxckvsdji)

                )
            }

        }
    }
}