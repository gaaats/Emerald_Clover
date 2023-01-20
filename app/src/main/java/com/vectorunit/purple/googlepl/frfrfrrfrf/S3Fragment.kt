package com.vectorunit.purple.googlepl.frfrfrrfrf

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.vectorunit.purple.googlepl.R
import com.vectorunit.purple.googlepl.adaaapter.SantaDapter
import com.vectorunit.purple.googlepl.databinding.FragmentS3Binding
import com.vectorunit.purple.googlepl.pagerrrr.Onnnnyelem
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random


class S3Fragment : Fragment() {

    val test = "gtgtgttggt"

    val f1 = "sasffrrffr"
    val f3 = "sasffgtgttggtrrffr"
    val f4 = "sasfrgtffrrffr"
    val f5 = "sasffrgttgrffr"
    val f9 = "sasffrrffr"
    val f6 = "sasffgtgtrrffr"
    val f7 = "sasffrrffr"
    val f8 = "sasffrgtgtgtrffr"

    val res = f1 +f3+f4+f5+f6+f7+f8+f9

    private val intList = gtgjitjjgjtgtjiijtg()
    private val fragmentS3Binding get() = frgyhyjuji ?: throw RuntimeException("FragmentS3Binding = null")

    private var tgtgtgt5 = 300

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        frgyhyjuji = FragmentS3Binding.inflate(inflater, container, false)
        return fragmentS3Binding.root
    }


    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        if (test == "gtgtgtgtgttgthjujikkkiigtgt"){
            gtjigtjtgjigt()
        }

        gtkotgtjtjgjijgt()
        val gtgijtijtgitg = fragmentS3Binding.recVLeft.layoutManager as LinearLayoutManager
        val rgjithgtuhtg = fragmentS3Binding.recVCenter.layoutManager as LinearLayoutManager
        val difrfrfrr5 = fragmentS3Binding.recVRight.layoutManager as LinearLayoutManager

        gttjgjtjjgjtijitgj()
        initAdaptersRecV()
        submitListsForRecV()

        gtuhgtgthgtddhdgdgd(
            gtgijtijtgitg,
            rgjithgtuhtg,
            difrfrfrr5
        )
        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtjigtjtgjigt() {
        Snackbar.make(
            fragmentS3Binding.root,
            "You win $res points",
            Snackbar.LENGTH_LONG
        ).show()
    }

    private val hyju6ju5u5 = SantaDapter()
    private val hhyyh = SantaDapter()


    private var frgyhyjuji: FragmentS3Binding? = null
    private val ftgtgtg = SantaDapter()

    private fun gtuhgtgthgtddhdgdgd(
        linearLayoutManagerLeftdferfgtghyt: LinearLayoutManager,
        linearLayoutManagerCenterrrrrrrr: LinearLayoutManager,
        frgthyhyhyyh: LinearLayoutManager
    ) {
        tgijtjgtgjtijitg(
            linearLayoutManagerLeftdferfgtghyt,
            linearLayoutManagerCenterrrrrrrr,
            frgthyhyhyyh
        )
    }

    private fun tgijtjgtgjtijitg(
        linearLayoutManagerLeftdferfgtghyt: LinearLayoutManager,
        linearLayoutManagerCenterrrrrrrr: LinearLayoutManager,
        frgthyhyhyyh: LinearLayoutManager
    ) {
        fragmentS3Binding.btnGoSpin.setOnClickListener {
            gtitgjgtjjgtjtgji(linearLayoutManagerLeftdferfgtghyt, 8, 12)
            gtitgjgtjjgtjtgji(linearLayoutManagerCenterrrrrrrr, 12, 18)
            gtitgjgtjjgtjtgji(frgthyhyhyyh, 20, 27)
        }
    }


    private fun gtkotgtjtjgjijgt() {
        fragmentS3Binding.btnImgExittttttMoney.setOnClickListener {
            fuhhuhfrurfhuhrhurf()
        }
    }

    private fun fuhhuhfrurfhuhrhurf() {
        requireActivity().onBackPressed()
    }


    private fun submitListsForRecV() {
        hyju6ju5u5.submitList(gtijgjtjigtjitgjtg())
        hhyyh.submitList(gtijgjtjigtjitgjtg())
        ftgtgtg.submitList(gtijgjtjigtjitgjtg())
    }

    override fun onDestroy() {
        frgyhyjuji = null
        super.onDestroy()
    }




    @SuppressLint("ClickableViewAccessibility")
    private fun gttjgjtjjgjtijitgj() {
        fragmentS3Binding.recVLeft.setOnTouchListener { _, _ -> true }
        fragmentS3Binding.recVRight.setOnTouchListener { _, _ -> true }
        fragmentS3Binding.recVCenter.setOnTouchListener { _, _ -> true }
    }

    val nnnnnnnnnn by lazy {
        listOf(

            "Noah",
            "Oliver",
            "Elijah",
            "James",
            "William",
            "Benjamin",
            "Lucas",
            "Henry",
            "Theodore",
            "Jack",
            "Levi",
            "Alexander",
            "Jackson",
            "Mateo",
            "Daniel",
            "Michael",
            "Mason",
            "Sebastian",
            "Ethan",
            "Logan",
            "Owen",
            "Samuel",
            "Jacob",
            "Asher",
            "Aiden",
            "John",
            "Joseph",
            "Wyatt",
            "David",
            "Leo",
            "Luke",
            "Julian",
            "Hudson",
            "Grayson",
            "Matthew",
            "Ezra",
            "Gabriel",
            "Carter",
            "Isaac",
            "Jayden",
            "Luca"
        )
    }


    private fun gtitgjgtjjgtjtgji(
        ghyhhyhyhyhy: LinearLayoutManager,
        gtggtjijttgjgt: Int,
        gjtigjgtjigtji: Int
    ) {
        lifecycleScope.launch {
            val hyhyy5 = Random.nextInt(gtggtjijttgjgt, gjtigjgtjigtji)
            var gt5gt5gt = 100L
            for (i in 1..hyhyy5) {
                ghyhhyhyhyhy.scrollToPositionWithOffset(i, 0)
                delay(gt5gt5gt)
                gt5gt5gt += 5
            }
            if (gjtigjgtjigtji == 27) {
                Snackbar.make(
                    fragmentS3Binding.root,
                    "${nnnnnnnnnn.random()}, You earned ${Random.nextInt(from = 100, until = 4000)} points",
                    Snackbar.LENGTH_LONG
                ).show()
            }
        }
    }


    private fun initAdaptersRecV() {
        fragmentS3Binding.recVLeft.adapter = hyju6ju5u5
        fragmentS3Binding.recVRight.adapter = hhyyh
        fragmentS3Binding.recVCenter.adapter = ftgtgtg
    }



    private fun gtijgjtjigtjitgjtg(): List<Onnnnyelem> {
        val fkgtjigtjigtijgt = mutableListOf<Onnnnyelem>()
        for (i in 1..50) {
            fkgtjigtjigtijgt.add(
                Onnnnyelem(
                    Random.nextInt(Int.MAX_VALUE),
                    intList.random(),
                )
            )
        }
        return fkgtjigtjigtijgt
    }

    private fun gtgjitjjgjtgtjiijtg(): List<Int> {
        return listOf(
            R.drawable.f1,
            R.drawable.f2,
            R.drawable.f3,
            R.drawable.f4,
            R.drawable.f5,
            R.drawable.f6,
            R.drawable.f7
        )
    }


}