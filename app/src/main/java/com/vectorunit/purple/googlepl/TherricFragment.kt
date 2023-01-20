package com.vectorunit.purple.googlepl

import android.app.Activity
import android.content.Context
import android.os.Bundle
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.gtgthyjuujuj
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.frrfrffrrf
import android.os.Handler
import android.util.Log
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager

import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.vectorunit.purple.googlepl.databinding.FragmentTherricBinding
import com.vectorunit.purple.googlepl.utitititls.Coooonsnns



@AndroidEntryPoint
@ActivityScoped
class TherricFragment : Fragment() {
    var temNaming = "loading"

    @Inject
    lateinit var dataManager: DataStoreManager



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTherricBinding.inflate(inflater, container, false)
        return binding.root
    }


    private var _binding: FragmentTherricBinding? = null
    private val binding
        get() = _binding ?: throw RuntimeException("FragmentTherricBinding = null")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        try {

            val ttttt = "null"
            if(ttttt == "3333"){
                TimerTextHelper2().apply {
                    this.start()
                    val gggg = this.elapsedTime
                    Toast.makeText(requireContext(), "frfrr ${gggg}", Toast.LENGTH_SHORT ).show()
                    this.stop()
                }

                val aaaa = ActivityTimer2()
                Log.d("lolo", "aa ${aaaa}")
            }

            lifecycleScope.launch {
                val gthyhyhyyh =
                    dataManager.gtgthyyhhyyh(gthyhyhyhyjudd = gtgthyjuujuj)
                        ?: Coooonsnns.KEY_NO_DATArfrfrffr

                delay(500)

                when (gthyhyhyyh) {
                    "yes" -> {
                        thhyyhujujujuj()
                    }
                    "no" -> {
                        tgjjgtjjgjgtgtjigt()

                    }
                    Coooonsnns.KEY_NO_DATArfrfrffr -> {
                        gtjtgjjtgjtgjtgi()
                    }

                }

            }


        } catch (e: Exception) {
            detdefdfe()
        }
        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtjtgjjtgjtgjtgi() {
        findNavController().navigate(R.id.action_therricFragment_to_s1Fragment)
    }

    private suspend fun thhyyhujujujuj() {
        initAppsFlyerLibeer(context = requireActivity())

        val gthyjuj56u5 = dataManager.gtgthyyhhyyh(frrfrffrrf)

        while (true) {
            if (temNaming != "loading") {
                delay(1000)
                if (gthyjuj56u5 == null) {
                    dataManager.vfvfbgggt3gt2tg2tg(key = frrfrffrrf, value = temNaming)
                }
                delay(500)
                tgjjgtjjgjgtgtjigt()
                break
            } else {
                delay(1000)
            }
        }
    }

    private fun tgjjgtjjgjgtgtjigt() {
        findNavController().navigate(R.id.action_therricFragment_to_forikFragment)
    }


    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }



    private fun detdefdfe() {
        Snackbar.make(
            binding.root,
            "Oops something went wrong, please try again...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().finish()
    }

    private fun initAppsFlyerLibeer(context: Context) {
        AppsFlyerLib.getInstance()
            .init(Coooonsnns.KEY_APPS_IDgtgtgtgt, conversionDataListener, context)
        AppsFlyerLib.getInstance().start(context)
    }

    private val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString().apply {
                Log.d("lolo", "onConversionDataSuccess")
                temNaming = this

            }
        }

        override fun onConversionDataFail(p0: String?) {

        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {
        }

        override fun onAttributionFailure(p0: String?) {
        }
    }


}

class TimerTextHelper2() : Runnable {
    private val handler = Handler()

    @Volatile
    private var startTime: Long = 0

    @Volatile
    var elapsedTime: Long = 0
        private set

    override fun run() {
        val millis = System.currentTimeMillis() - startTime
        var seconds = (millis / 1000).toInt()
        val minutes = seconds / 60
        seconds = seconds % 60
        if (elapsedTime == -1L) {
            handler.postDelayed(this, 500)
        }
    }

    fun start() {
        startTime = System.currentTimeMillis()
        elapsedTime = -1
        handler.post(this)
    }

    fun stop() {
        elapsedTime = System.currentTimeMillis() - startTime
        handler.removeCallbacks(this)
    }
}

class ActivityTimer2 {
    var activity: Activity? = null
        private set
    private var m_Enabled = false
    private var m_Timer: Timer? = null
    var delay: Long = 0
    private var m_Period: Long = 100
    private val _self: ActivityTimer2
    var isFireOnlyOnce = false

    init {
        _self = this
    }

    // Disable any existing timer before we enable a new one
    var isEnabled: Boolean
        get() = m_Enabled
        set(enabled) {
            if (m_Enabled == enabled) return

            // Disable any existing timer before we enable a new one
            Disable()
            if (enabled) {
                Enable()
            }
        }

    private fun Enable() {
        if (m_Enabled) return
        m_Enabled = true
        m_Timer = Timer()
        if (isFireOnlyOnce) {
            m_Timer!!.schedule(object : TimerTask() {
                override fun run() {
                    OnTick()
                }
            }, delay)
        } else {
            m_Timer!!.schedule(object : TimerTask() {
                override fun run() {
                    OnTick()
                }
            }, delay, m_Period)
        }
    }

    private fun Disable() {
        if (!m_Enabled) return
        m_Enabled = false
        if (m_Timer == null) return
        m_Timer!!.cancel()
        m_Timer!!.purge()
        m_Timer = null
    }

    private fun OnTick() {

        if (isFireOnlyOnce) Disable()
    }

    var period: Long
        get() = m_Period
        set(period) {
            if (m_Period == period) return
            m_Period = period
        }

    fun setActivity(activity: Activity) {
        if (this.activity === activity) return
        this.activity = activity
    }


    fun start() {
        if (m_Enabled) return
        Enable()
    }
}
