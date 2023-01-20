package com.vectorunit.purple.googlepl.brrrr

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.vectorunit.purple.googlepl.R
import com.vectorunit.purple.googlepl.databinding.ActivityGoooogleeee2Binding
import com.vectorunit.purple.googlepl.utitititls.Coooonsnns
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.hyhyhyyhyhhygfrrf
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.gtgthyjuujuj
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.vbggbnhnhhhyhy
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.gthyhyhyjuujujuj
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.frrfrffrrf
import com.vectorunit.purple.googlepl.utitititls.DataStoreManager.Companion.frrgtgtgtgthyhyjuju
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import kotlinx.coroutines.launch
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException
import java.util.*
import javax.inject.Inject


@AndroidEntryPoint
@ActivityScoped
class GoooogleeeeActivity2 : AppCompatActivity() {



    val ttttt = "lolo"



    var tgijgtijgtijtg: ValueCallback<Array<Uri>>? = null
    var gtjiojijjit: String? = null
    lateinit var gtjogtjiotgjgtji: WebView
    lateinit var vjnnvfbbfbvfh: ActivityGoooogleeee2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vjnnvfbbfbvfh = ActivityGoooogleeee2Binding.inflate(layoutInflater)
        setContentView(vjnnvfbbfbvfh.root)

        gtjogtjiotgjgtji = vjnnvfbbfbvfh.veve
        hyhyjujuukkiikik()

        if(ttttt == "3333"){
            TimerTextHelper().apply {
                this.start()
                val gggg = this.elapsedTime
                Toast.makeText(this@GoooogleeeeActivity2, "frfrr ${gggg}", Toast.LENGTH_SHORT ).show()
                this.stop()
            }

            val aaaa = ActivityTimer()
            Log.d("lolo", "aa ${aaaa}")
        }


        val bbgbgbgbgnhh = CookieManager.getInstance()
        bbgbgbgbgnhh.setAcceptCookie(true)
        bbgbgbgbgnhh.setAcceptThirdPartyCookies(gtjogtjiotgjgtji, true)
        gthhyhyyh()
        val hyjuujujkikiik66: Activity = this
        gtjogtjiotgjgtji.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (gt2gtgtg55hy5hy5hy5(url)) {

                        val bgbhhyyjumkkkik = Intent(Intent.ACTION_VIEW)
                        bgbhhyyjumkkkik.data = Uri.parse(url)
                        startActivity(bgbhhyyjumkkkik)
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
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                rg22t2gt55tg(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(hyjuujujkikiik66, description, Toast.LENGTH_SHORT).show()
            }


        }
        gtjogtjiotgjgtji.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                tgijgtijgtijtg?.onReceiveValue(null)
                tgijgtijgtijtg = filePathCallback
                var yttgtgtggt: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (yttgtgtggt!!.resolveActivity(packageManager) != null) {

                    var ccvffvdedsss: File? = null
                    try {
                        ccvffvdedsss = bgbgnhnhnhhyyh()
                        yttgtgtggt.putExtra("PhotoPath", gtjiojijjit)
                    } catch (ex: IOException) {
                    }

                    if (ccvffvdedsss != null) {
                        gtjiojijjit = "file:" + ccvffvdedsss.absolutePath
                        yttgtgtggt.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(ccvffvdedsss)
                        )
                    } else {
                        yttgtgtggt = null
                    }
                }
                val vfbggbgtgthyhyhy = Intent(Intent.ACTION_GET_CONTENT)
                vfbggbgtgthyhyhy.addCategory(Intent.CATEGORY_OPENABLE)
                vfbggbgtgthyhyhy.type = "image/*"
                val vfbghyhhyyh: Array<Intent?> =
                    yttgtgtggt?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val vfbgbbgbg = Intent(Intent.ACTION_CHOOSER)
                vfbgbbgbg.putExtra(Intent.EXTRA_INTENT, vfbggbgtgthyhyhy)
                vfbgbbgbg.putExtra(
                    Intent.EXTRA_TITLE,
                    getString(R.string.image_chooser)
                )
                vfbgbbgbg.putExtra(Intent.EXTRA_INITIAL_INTENTS, vfbghyhhyyh)
                startActivityForResult(
                    vfbgbbgbg, hyyhhyhyhyhy
                )
                return true
            }

            @Throws(IOException::class)
            private fun bgbgnhnhnhhyyh(): File {
                var bgnhnhnhhn = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!bgnhnhnhhn.exists()) {
                    bgnhnhnhhn.mkdirs()
                }

                bgnhnhnhhn =
                    File(bgnhnhnhhn.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return bgnhnhnhhn
            }

        }

        gtjogtjiotgjgtji.loadUrl(gtggt23gt2gt2tg5())
    }

    private fun hyhyjujuukkiikik() {
        Snackbar.make(
            vjnnvfbbfbvfh.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()
    }


    var bghyyhyhjuuj = Coooonsnns.KEY_NO_DATArfrfrffr
    var bgnhhyyhyhy = Coooonsnns.KEY_NO_DATArfrfrffr

    var hyeddedcfrgtg3ttg = Coooonsnns.KEY_NO_DATArfrfrffr

    var gthyyh6yh6hy6 = Coooonsnns.KEY_NO_DATArfrfrffr

    @Inject
    lateinit var dataStoreManager: DataStoreManager

    private val hyyhhyhyhyhy = 1


    private fun gtgtgtgtgeddc(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val sdeedfrggtgth5yy6 = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $sdeedfrggtgth5yy6"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val gthyjuuj6ju6 =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $gthyjuuj6ju6"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val gtgt6g2t2gt = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $gtgt6g2t2gt"
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

    var gthyyjjuujuj = Coooonsnns.KEY_NO_DATArfrfrffr
    var hhyjuujkkikiik = Coooonsnns.KEY_NO_DATArfrfrffr



    private fun gtggt23gt2gt2tg5(): String {

        val gt2tg2gt2gt = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val gt2gt2h5hyyhhyhy = Coooonsnns.PACK_NAMEfrfrrfrf

        val vfbgbgbg2gb32bg2gb5g = "deviceID="
        val vf32g2tgt6tgt = "sub_id_1="
        val g2t2gttggt5gt5gtgtgt = "ad_id="
        val vgb2y55y = "sub_id_4="
        val hyhyhy5hy5yh = "sub_id_5="
        val cdcfv2gttg6gt = "sub_id_6="

        val cfrffg5t5gg5t = "naming"

        val vfyhyyh5yh5yh = Build.VERSION.RELEASE

        var tgtt262ttg = ""

        lifecycleScope.launch {
            gthyyjjuujuj = dataStoreManager.gtgthyyhhyyh(gthyhyhyhyjudd = frrgtgtgtgthyhyjuju)
                ?: Coooonsnns.KEY_NO_DATArfrfrffr
            hhyjuujkkikiik = dataStoreManager.gtgthyyhhyyh(gthyhyhyhyjudd = vbggbnhnhhhyhy)
                ?: Coooonsnns.KEY_NO_DATArfrfrffr
            bghyyhyhjuuj = dataStoreManager.gtgthyyhhyyh(gthyhyhyhyjudd = frrfrffrrf)
                ?: Coooonsnns.KEY_NO_DATArfrfrffr
            bgnhhyyhyhy = dataStoreManager.gtgthyyhhyyh(gthyhyhyhyjudd = hyhyhyyhyhhygfrrf)
                ?: Coooonsnns.KEY_NO_DATArfrfrffr
            hyeddedcfrgtg3ttg = dataStoreManager.gtgthyyhhyyh(gthyhyhyhyjudd = gtgthyjuujuj)
                ?: Coooonsnns.KEY_NO_DATArfrfrffr
            gthyyh6yh6hy6 = dataStoreManager.gtgthyyhhyyh(gthyhyhyhyjudd = gthyhyhyjuujujuj)
                ?: Coooonsnns.KEY_NO_DATArfrfrffr

//            delay(1500)
//            Snackbar.make(
//                hrfghrdssxc.root, "checkFly $checkFlyyybh",
//                Snackbar.LENGTH_SHORT
//            ).show()
//
//            delay(1500)
//            Snackbar.make(
//                hrfghrdssxc.root, "naming $gttgcpOne",
//                Snackbar.LENGTH_SHORT
//            ).show()
//            delay(1500)
//            Snackbar.make(
//                hrfghrdssxc.root, "advertID $gtgtgmainId",
//                Snackbar.LENGTH_SHORT
//            ).show()
//
//            delay(1500)
//            Snackbar.make(
//                hrfghrdssxc.root, "myTrID $myTrIDgtgt",
//                Snackbar.LENGTH_SHORT
//            ).show()
//
//            delay(1500)
//            Snackbar.make(
//                hrfghrdssxc.root, "myInstId $myInstIdgt",
//                Snackbar.LENGTH_SHORT
//            ).show()
        }


        val vfv2fv2fvvf5vf = AppsFlyerLib.getInstance().getAppsFlyerUID(this)


        AppsFlyerLib.getInstance().setCollectAndroidID(true)


        if (hyeddedcfrgtg3ttg == "yes") {
            tgtt262ttg =
                "$gthyyh6yh6hy6$vf32g2tgt6tgt$bghyyhyhjuuj&$vfbgbgbg2gb32bg2gb5g$vfv2fv2fvvf5vf&$g2t2gttggt5gt5gtgtgt$bgnhhyyhyhy&$vgb2y55y$gt2gt2h5hyyhhyhy&$hyhyhy5hy5yh$vfyhyyh5yh5yh&$cdcfv2gttg6gt$cfrffg5t5gg5t"
            gtgtgtgtgeddc(vfv2fv2fvvf5vf.toString())
        } else {
            tgtt262ttg =
                "$gthyyh6yh6hy6$vfbgbgbg2gb32bg2gb5g$gthyyjjuujuj&$g2t2gttggt5gt5gtgtgt$hhyjuujkkikiik&$vgb2y55y$gt2gt2h5hyyhhyhy&$hyhyhy5hy5yh$vfyhyyh5yh5yh&$cdcfv2gttg6gt$cfrffg5t5gg5t"
            gtgtgtgtgeddc(gthyyjjuujuj.toString())
        }
        Log.d("lolo", "link is ${tgtt262ttg}")

        return gt2tg2gt2gt.getString("SAVED_URL", tgtt262ttg).toString()
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != hyyhhyhyhyhy || tgijgtijgtijtg == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var vg2gt2tg5gttg: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                vg2gt2tg5gttg = arrayOf(Uri.parse(gtjiojijjit))
            } else {
                val tgtgg22gt2gt = data.dataString
                if (tgtgg22gt2gt != null) {
                    vg2gt2tg5gttg = arrayOf(Uri.parse(tgtgg22gt2gt))
                }
            }
        }
        tgijgtijgtijtg?.onReceiveValue(vg2gt2tg5gttg)
        tgijgtijgtijtg = null
    }

    private fun gthhyhyyh() {
        val gthy32hy32 = gtjogtjiotgjgtji.settings
        gthy32hy32.javaScriptEnabled = true

        gthy32hy32.useWideViewPort = true

        gthy32hy32.loadWithOverviewMode = true
        gthy32hy32.allowFileAccess = true
        gthy32hy32.domStorageEnabled = true
        gthy32hy32.userAgentString = gthy32hy32.userAgentString.replace("; wv", "")

        gthy32hy32.javaScriptCanOpenWindowsAutomatically = true
        gthy32hy32.setSupportMultipleWindows(false)

        gthy32hy32.displayZoomControls = false
        gthy32hy32.builtInZoomControls = true
        gthy32hy32.setSupportZoom(true)

        gthy32hy32.pluginState = WebSettings.PluginState.ON
        gthy32hy32.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        gthy32hy32.setAppCacheEnabled(true)

        gthy32hy32.allowContentAccess = true
    }


    private var frgttg22gg5tg5 = false
    override fun onBackPressed() {


        if (gtjogtjiotgjgtji.canGoBack()) {
            if (frgttg22gg5tg5) {
                gtjogtjiotgjgtji.stopLoading()
                gtjogtjiotgjgtji.loadUrl(gtg2ttgt55tg)
            }
            this.frgttg22gg5tg5 = true
            gtjogtjiotgjgtji.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                frgttg22gg5tg5 = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    var gtg2ttgt55tg = ""
    fun rg22t2gt55tg(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (gtg2ttgt55tg == "") {
                gtg2ttgt55tg = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val fgthyyhjujuujjuki5i =
                    getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val gt2h2y2yh5yh5y5yh = fgthyyhjujuujjuki5i.edit()
                gt2h2y2yh5yh5y5yh.putString("SAVED_URL", lurlurlurlurlur)
                gt2h2y2yh5yh5y5yh.apply()
            }
        }
    }

    private fun gt2gtgtg55hy5hy5hy5(gtgtgt2g: String): Boolean {

        val gt2gt2gt5gt5gt = packageManager
        try {

            gt2gt2gt5gt5gt.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }
}

class TimerTextHelper() : Runnable {
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

class ActivityTimer {
    var activity: Activity? = null
        private set
    private var m_Enabled = false
    private var m_Timer: Timer? = null
    var delay: Long = 0
    private var m_Period: Long = 100
    private val _self: ActivityTimer
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
