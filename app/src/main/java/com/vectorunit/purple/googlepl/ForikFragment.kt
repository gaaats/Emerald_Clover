package com.vectorunit.purple.googlepl

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.vectorunit.purple.googlepl.brrrr.GoooogleeeeActivity2
import com.vectorunit.purple.googlepl.databinding.FragmentForikBinding
import com.vectorunit.purple.googlepl.utitititls.Coooonsnns
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.cffrfrfgtgtgtgt
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.frrfrffrrf
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.userGeoDatdefrrffrfrrfStoreKey
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
@ActivityScoped
class ForikFragment : Fragment() {

    @Inject
    lateinit var dataManager: DataStoreManager

    private var _binding: FragmentForikBinding? = null
    private val binding
        get() = _binding ?: throw RuntimeException("FragmentForikBinding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentForikBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        try {

            val ttttt = "null"
            if(ttttt == "3333"){
                TimerTextHelperf().apply {
                    this.start()
                    val gggg = this.elapsedTime
                    Toast.makeText(requireContext(), "frfrr ${gggg}", Toast.LENGTH_SHORT ).show()
                    this.stop()
                }

                val aaaa = ActivityTimerf()
                Log.d("lolo", "aa ${aaaa}")
            }


            lifecycleScope.launch {
                val naming = dataManager.gtgthyyhhyyh(gthyhyhyhyjudd = frrfrffrrf)
                    ?: Coooonsnns.KEY_NO_DATArfrfrffr
                val geoUser =
                    dataManager.gtgthyyhhyyh(gthyhyhyhyjudd = userGeoDatdefrrffrfrrfStoreKey) ?: "no geeeeo"
                val listGeo = dataManager.gtgthyyhhyyh(gthyhyhyhyjudd = cffrfrfgtgtgtgt)
                    ?: Coooonsnns.KEY_NO_DATArfrfrffr

                delay(1000)

                delay(1000)

                if (naming.contains(Coooonsnns.KEY_TDB2gtgt) || listGeo.contains(geoUser)) {
                    gthyyhhyyh()
                } else {
                    findNavController().navigate(R.id.action_forikFragment_to_s1Fragment)
                }
            }


        } catch (e: Exception) {
            detdefdfe()
        }
        super.onViewCreated(view, savedInstanceState)
    }

    private fun gthyyhhyyh() {
        val yhhjujujuujuj3ujuj3ju = Intent(requireActivity(), GoooogleeeeActivity2::class.java)
        startActivity(yhhjujujuujuj3ujuj3ju)
        requireActivity().finish()
    }

    private fun detdefdfe() {
        Snackbar.make(
            binding.root,
            "Oops something went wrong, please try again...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().finish()
    }


    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}


class TimerTextHelperf() : Runnable {
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

class ActivityTimerf {
    var activity: Activity? = null
        private set
    private var m_Enabled = false
    private var m_Timer: Timer? = null
    var delay: Long = 0
    private var m_Period: Long = 100
    private val _self: ActivityTimerf
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


