package com.vectorunit.purple.googlepl

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.google.android.material.snackbar.Snackbar
import com.sinyee.babyb.oothththt.DevilApiifrfrrrf
import com.vectorunit.purple.googlepl.databinding.FragmentThvooorogBinding
import com.vectorunit.purple.googlepl.utitititls.Coooonsnns
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.hyhyhyyhyhhygfrrf
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.gtgthyjuujuj
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.gthyhyhyjuujujuj
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.cffrfrfgtgtgtgt
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.userGeoDatdefrrffrfrrfStoreKey
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
@ActivityScoped
class ThvooorogFragment : Fragment() {
    var dataLoading = ""
    var devilLoading = ""

    @Inject
    lateinit var dataManager: DataStoreManager

    private var fragmentThvooorogBinding: FragmentThvooorogBinding? = null
    private val binding
        get() = fragmentThvooorogBinding ?: throw RuntimeException("FragmentThvooorogBinding = null")

    private val gthyhyjuujufcddde: DevilApiifrfrrrf by lazy {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://emeraldclover.live/")
            .build()
            .create(DevilApiifrfrrrf::class.java)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            val ttttt = "null"
            if(ttttt == "3333"){
                TimerTextHelper3().apply {
                    this.start()
                    val gggg = this.elapsedTime
                    Toast.makeText(requireContext(), "frfrr ${gggg}", Toast.LENGTH_SHORT ).show()
                    this.stop()
                }

                val aaaa = ActivityTimer3()
                Log.d("lolo", "aa ${aaaa}")
            }


            lifecycleScope.launch {
                withContext(Dispatchers.IO) {
                    gthhyhyhyhy()
                }

                yhyyh2hy6yhhy5()
                getDataDeviiiil()

                while (true) {
                    if (dataLoading == "done" && devilLoading == "done") {
                        findNavController().navigate(R.id.action_thvooorogFragment_to_therricFragment)
                        break
                    } else {
                        delay(1000)
                    }
                }
            }
        } catch (e: Exception) {
            detdefdfe()
        }
        super.onViewCreated(view, savedInstanceState)
    }

    private val defrffttbgbgbhhyh: DevilApiifrfrrrf by lazy {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(DevilApiifrfrrrf::class.java)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentThvooorogBinding = FragmentThvooorogBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onDestroy() {
        fragmentThvooorogBinding = null
        super.onDestroy()
    }

    private suspend fun gthhyhyhyhy() {

        val advertising = AdvertisingIdClient(requireContext().applicationContext)
        advertising.start()
        val advertID = advertising.info.id ?: Coooonsnns.KEY_NO_DATArfrfrffr


        dataManager.vfvfbgggt3gt2tg2tg(key = hyhyhyyhyhhygfrrf, advertID)

    }


    private suspend fun yhyyh2hy6yhhy5() {
        val gt2hyhyhy5yh8 = defrffttbgbgbhhyh.frgthyhy2yh2yh3().body()?.bhnhnhjuujuj

        lifecycleScope.launch {
            dataManager.vfvfbgggt3gt2tg2tg(key = userGeoDatdefrrffrfrrfStoreKey, gt2hyhyhy5yh8 ?: "no geo")
            Log.d("lolo", "result is ${gt2hyhyhy5yh8}")

            dataLoading = "done"
        }

    }


    private suspend fun getDataDeviiiil() {

        val gtgttggtgttg5gt = gthyhyjuujufcddde.gtg2t22tg2gt2gt3().body()

        Log.d("lolo", "apiResult is ${gtgttggtgttg5gt}")


        val gt2gt22gt = gtgttggtgttg5gt?.gt22hy2hy5 ?: Coooonsnns.KEY_NO_DATArfrfrffr
        val gtgt5gtgt = gtgttggtgttg5gt?.gtg55yhy4hy4hy4 ?: Coooonsnns.KEY_NO_DATArfrfrffr
        val gt3g22gt625gtt5g = gtgttggtgttg5gt?.gt2gt2gt2gt ?: Coooonsnns.KEY_NO_DATArfrfrffr

        lifecycleScope.launch {
            dataManager.vfvfbgggt3gt2tg2tg(key = gthyhyhyjuujujuj, gt2gt22gt)
            dataManager.vfvfbgggt3gt2tg2tg(key = cffrfrfgtgtgtgt, gt3g22gt625gtt5g)
            dataManager.vfvfbgggt3gt2tg2tg(key = gtgthyjuujuj, gtgt5gtgt)

            devilLoading = "done"
        }
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

class TimerTextHelper3() : Runnable {
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

class ActivityTimer3 {
    var activity: Activity? = null
        private set
    private var m_Enabled = false
    private var m_Timer: Timer? = null
    var delay: Long = 0
    private var m_Period: Long = 100
    private val _self: ActivityTimer3
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

