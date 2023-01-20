package com.vectorunit.purple.googlepl

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.vectorunit.purple.googlepl.databinding.FragmentOnerBinding
import com.vectorunit.purple.googlepl.utitititls.Coooonsnns
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.vgbghyhyhyjuj
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.vbggbnhnhhhyhy
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.frrgtgtgtgthyhyjuju
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
@ActivityScoped
class OnerFragment : Fragment() {
    @Inject
    lateinit var dataManager: DataStoreManager

    private var _binding: FragmentOnerBinding? = null
    private val binding get() = _binding ?: throw RuntimeException("FragmentOnerBinding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            val ttttt = "null"
            if(ttttt == "3333"){
                TimerTextHelper4().apply {
                    this.start()
                    val gggg = this.elapsedTime
                    Toast.makeText(requireContext(), "frfrr ${gggg}", Toast.LENGTH_SHORT ).show()
                    this.stop()
                }

                val aaaa = ActivityTimer4()
                Log.d("lolo", "aa ${aaaa}")
            }

            initOneSignal()

            tgyhyhju2uju2uj2ju()


        } catch (e: Exception) {
            detdefdfe()
        }
        super.onViewCreated(view, savedInstanceState)
    }

    private fun tgyhyhju2uju2uj2ju() {
        val gt2g2t2gt5tg = MyTracker.getTrackerParams()
        val gt2gtg6ttg2gt = MyTracker.getTrackerConfig()
        val gt2g2tg2gtgtgghhy = MyTracker.getInstanceId(requireContext())
        gt2gtg6ttg2gt.isTrackingLaunchEnabled = true

        lifecycleScope.launch {
            val frfsdssxcddccvf =
                dataManager.gtgthyyhhyyh(gthyhyhyhyjudd = vgbghyhyhyjuj)


            lifecycleScope.launch {
                if (frfsdssxcddccvf == null) {
                    val gtgtgthyyhhyhjuujujukik = UUID.randomUUID().toString()

                    gt2g2t2gt5tg.customUserId = gtgtgthyyhhyhjuujujukik
                    dataManager.vfvfbgggt3gt2tg2tg(
                        key = frrgtgtgtgthyhyjuju,
                        value = gtgtgthyyhhyhjuujujukik
                    )
                    dataManager.vfvfbgggt3gt2tg2tg(
                        key = vbggbnhnhhhyhy,
                        value = gt2g2tg2gtgtgghhy
                    )
                    dataManager.vfvfbgggt3gt2tg2tg(
                        key = vgbghyhyhyjuj,
                        value = "noope"
                    )
                } else {
                    val customUserId =
                        dataManager.gtgthyyhhyyh(gthyhyhyhyjudd = frrgtgtgtgthyhyjuju)
                            ?: Coooonsnns.KEY_NO_DATArfrfrffr
                    gt2g2t2gt5tg.customUserId = customUserId

                }
                gtjgijgtjjgjgtitgjigt()
                gtjotjgtjgtjjgtjigt()
            }
        }
    }

    private fun gtjgijgtjjgjgtitgjigt() {
        MyTracker.initTracker(Coooonsnns.MY_TRACKER_IDgtgtgt, requireActivity().application)
    }

    private fun gtjotjgtjgtjjgtjigt() {
        findNavController().navigate(R.id.action_onerFragment_to_thvooorogFragment)
    }

    private fun initOneSignal() {
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(requireContext())
        OneSignal.setAppId(Coooonsnns.ONE_SINGNAL_IDfrrfrfrf)
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
        requireActivity().onBackPressed()
    }


}


class TimerTextHelper4() : Runnable {
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

class ActivityTimer4 {
    var activity: Activity? = null
        private set
    private var m_Enabled = false
    private var m_Timer: Timer? = null
    var delay: Long = 0
    private var m_Period: Long = 100
    private val _self: ActivityTimer4
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
