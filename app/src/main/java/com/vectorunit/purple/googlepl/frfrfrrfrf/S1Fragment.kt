package com.vectorunit.purple.googlepl.frfrfrrfrf

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.telephony.TelephonyManager
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.vectorunit.purple.googlepl.R
import com.vectorunit.purple.googlepl.databinding.FragmentS1Binding
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method
import java.util.*

class S1Fragment : Fragment() {

    val test = "ok"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentS1Binding = FragmentS1Binding.inflate(inflater, container, false)
        return binding.root
    }

    var fragmentS1Binding: FragmentS1Binding? = null
    val binding
        get() = fragmentS1Binding ?: throw RuntimeException("FragmentS1Binding = null")


    val f1 = "erthyju"
    val f3 = "rgthyj"
    val f4 = "erhtjk"
    val f5 = "rgthyju"
    val f9 = "htyjk,"
    val f6 = "thyjuk"
    val f7 = "rtjyk"
    val f8 = "tyukloloollo"

    val ghyhyyhyh = f1 +f3+f4+f5+f6+f7+f8+f9

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            if (test =="fygrfggfrgrf"){
                getDeviceCountryCode(requireContext())
            }

            if (System.currentTimeMillis()%56 == Long.MIN_VALUE) {
                ofkrogjtitgjjtiogjitjjgtjgtji()
            } else {
                Log.d("loggggglo", "res")
            }

            gtgtgtjgttgj()

        } catch (e: Exception) {
            gtgtgt()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun ofkrogjtitgjjtiogjitjjgtjgtji() {
        Snackbar.make(
            binding.root,
            ghyhyyhyh,
            Snackbar.LENGTH_LONG
        ).show()
    }


    private fun gtgtgtjgttgj() {

        binding.btnPlayGameeeeeeeeeeee.setOnClickListener {
            fjrijijgtjgtjijgtijigtjgtj()
        }
    }

    private fun fjrijijgtjgtjijgtijigtjgtj() {
        findNavController().navigate(R.id.action_s1Fragment_to_s2Fragment)
    }


    private fun gtgtgt() {
        rogtjgjijtjitgijgt()
        rfijrogtgijogijtjgitj()
    }

    private fun rfijrogtgijogijtjgitj() {
        requireActivity().onBackPressed()
    }

    private fun rogtjgjijtjitgijgt() {
        Snackbar.make(
            binding.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
    }

    override fun onPause() {
        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentS1Binding = null
        super.onDestroy()
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