package com.vectorunit.purple.googlepl.pagerrrr

import android.annotation.SuppressLint
import android.content.Context
import android.telephony.TelephonyManager
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method
import java.util.*

class Diiiiifaaaaaa : DiffUtil.ItemCallback<Onnnnyelem>() {
    val rrrr = "ffff"

    override fun areItemsTheSame(oldItem: Onnnnyelem, newItem: Onnnnyelem): Boolean {
        return oldItem.fgt5gt5gt == newItem.fgt5gt5gt
    }

    override fun areContentsTheSame(oldItem: Onnnnyelem, newItem: Onnnnyelem): Boolean {
        if (rrrr == "frfgthyhyhy"){

        }
        return oldItem == newItem
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