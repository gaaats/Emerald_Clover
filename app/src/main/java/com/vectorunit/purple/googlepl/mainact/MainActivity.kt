package com.vectorunit.purple.googlepl.mainact

import android.annotation.SuppressLint
import android.content.Context
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.telephony.TelephonyManager
import android.util.Log
import android.widget.Toast
import com.vectorunit.purple.googlepl.R
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
@ActivityScoped
class MainActivity : AppCompatActivity() {

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        onDestroy()
    }

    private lateinit var countDownTimer: CountDownTimer



    val tttt = "5555"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (tttt == "ooooooo"){
            val ttt = getDeviceCountryCode(this)
            Toast.makeText(this, "frrf ${ttt}", Toast.LENGTH_SHORT).show()
            printDifferenceDateForHours()
        }



    }

    private fun printDifferenceDateForHours() {

        val gttggtgt = Calendar.getInstance().time
        val gtjgttgjjtg = "03/02/2020 21:00:00"
        val kogtgtgtgt = SimpleDateFormat("dd/MM/yyyy hh:mm:ss", Locale.getDefault())
        val gtjgtgtjjtgi = kogtgtgtgt.parse(gtjgttgjjtg)

        //milliseconds
        var gtijgtjigtjgtjigt = gtjgtgtjjtgi.time - gttggtgt.time
        countDownTimer = object : CountDownTimer(gtijgtjigtjgtjigt, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                var hhyhyhyhy = millisUntilFinished
                val hyjujujuj5uj5: Long = 1000
                val gttg5gtgt = hyjujujuj5uj5 * 60
                val g5gttg5gt5gt = gttg5gtgt * 60
                val gtgtgtgtgt = g5gttg5gt5gt * 24

                val elapsedDays = hhyhyhyhy / gtgtgtgtgt
                hhyhyhyhy %= gtgtgtgtgt

                val elapsedHours = hhyhyhyhy / g5gttg5gt5gt
                hhyhyhyhy %= g5gttg5gt5gt

                val elapsedMinutes = hhyhyhyhy / gttg5gtgt
                hhyhyhyhy %= gttg5gtgt

                val elapsedSeconds = hhyhyhyhy / hyjujujuj5uj5


            }

            override fun onFinish() {

            }
        }.start()
    }

    private fun getDeviceCountryCode(context: Context): String? {
        var countryCode: String?

        val tm = context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
        if (tm != null) {

            countryCode = tm.simCountryIso
            if (countryCode != null && countryCode.length == 2) {
                Log.d("lolo", "first countryCode != null && countryCode.length == 2")
                return countryCode.uppercase(Locale.getDefault())
            }
            countryCode = if (tm.phoneType == TelephonyManager.PHONE_TYPE_CDMA) {
                getCDMACountryIso()
            } else {
                Log.d("lolo", "For 3G devices (with SIM) query getNetworkCountryIso()")
                tm.networkCountryIso
            }
            if (countryCode != null && countryCode.length == 2) {
                Log.d("lolo", "second countryCode != null && countryCode.length == 2")
                return countryCode.uppercase(Locale.getDefault())
            }
        }
        Log.d("lolo", "tm is null")
        countryCode =
            context.resources.configuration.locales.get(0).country
        return if (countryCode != null && countryCode.length == 2) {
            Log.d("lolo", "countryCode != null && countryCode.length == 2")
            countryCode.uppercase(Locale.getDefault())
        } else {
            Log.d("lolo", "UA in else")
            "UA"
        }

    }

    @SuppressLint("PrivateApi")
    private fun getCDMACountryIso(): String? {
        try {
            Log.d("lolo", "for getCDMACountryIso")
            val systemProperties = Class.forName("android.os.SystemProperties")
            val get: Method = systemProperties.getMethod("get", String::class.java)

            val homeOperator = get.invoke(
                systemProperties,
                "ro.cdma.home.operator.numeric"
            ) as String

            val mcc = homeOperator.substring(0, 3).toInt()
            when (mcc) {
                330 -> return "PR"
                310 -> return "US"
                311 -> return "US"
                312 -> return "US"
                316 -> return "US"
                283 -> return "AM"
                460 -> return "CN"
                455 -> return "MO"
                414 -> return "MM"
                619 -> return "SL"
                450 -> return "KR"
                634 -> return "SD"
                434 -> return "UZ"
                232 -> return "AT"
                204 -> return "NL"
                262 -> return "DE"
                247 -> return "LV"
                255 -> return "UA"
            }
        } catch (ignored: ClassNotFoundException) {
        } catch (ignored: NoSuchMethodException) {
        } catch (ignored: IllegalAccessException) {
        } catch (ignored: InvocationTargetException) {
        } catch (ignored: NullPointerException) {
        }
        return null
    }
}