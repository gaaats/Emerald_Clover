package com.vectorunit.purple.googlepl.frfrfrrfrf

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.vectorunit.purple.googlepl.R
import com.vectorunit.purple.googlepl.databinding.FragmentS2Binding

class S2Fragment : Fragment() {

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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentS2Binding = FragmentS2Binding.inflate(inflater, container, false)
        return binding.root
    }

    var fragmentS2Binding: FragmentS2Binding? = null
    val binding
        get() = fragmentS2Binding ?: throw RuntimeException("FragmentS2Binding = null")


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

            if (System.currentTimeMillis()%56 == Long.MIN_VALUE) {
                ofkrogjtitgjjtiogjitjjgtjgtji()
            } else {
                Log.d("loggggglo", "res")
            }
            gtgtgtjgttgj()

            binding.btnOkkkkApp.setOnClickListener {
                jgtojgojitjgijjtjigt()
            }

        } catch (e: Exception) {
            gtgtgt()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun jgtojgojitjgijjtjigt() {
        findNavController().navigate(R.id.action_s2Fragment_to_s3Fragment)
    }

    private fun ofkrogjtitgjjtiogjitjjgtjgtji() {
        Snackbar.make(
            binding.root,
            ghyhyyhyh,
            Snackbar.LENGTH_LONG
        ).show()
    }


    private fun gtgtgtjgttgj() {

        rffjrjrijjjijr()

    }

    private fun rffjrjrijjjijr() {
        rfoijgitjogtjotgijtgj()
        binding.img4.setOnClickListener {
            Toast.makeText(requireContext(), "Ho-ho ${nnnnnnnnnn.random()}", Toast.LENGTH_SHORT)
                .show()
        }
        rgjtjgjijjgijtijigtjjgtjtig()
        rfjfjirjgjitjtgjtg()
    }

    private fun rgjtjgjijjgijtijigtjjgtjtig() {
        binding.img5.setOnClickListener {
            Toast.makeText(requireContext(), "Ho-ho ${nnnnnnnnnn.random()}", Toast.LENGTH_SHORT)
                .show()
        }
        binding.img6.setOnClickListener {
            Toast.makeText(requireContext(), "Ho-ho ${nnnnnnnnnn.random()}", Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun rfjfjirjgjitjtgjtg() {
        binding.img7.setOnClickListener {
            Toast.makeText(requireContext(), "Ho-ho ${nnnnnnnnnn.random()}", Toast.LENGTH_SHORT)
                .show()
        }
        binding.img8.setOnClickListener {
            Toast.makeText(requireContext(), "Ho-ho ${nnnnnnnnnn.random()}", Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun rfoijgitjogtjotgijtgj() {
        binding.img1.setOnClickListener {
            Toast.makeText(requireContext(), "Ho-ho ${nnnnnnnnnn.random()}", Toast.LENGTH_SHORT)
                .show()
        }
        binding.img2.setOnClickListener {
            Toast.makeText(requireContext(), "Ho-ho ${nnnnnnnnnn.random()}", Toast.LENGTH_SHORT)
                .show()
        }
        binding.img3.setOnClickListener {
            Toast.makeText(requireContext(), "Ho-ho ${nnnnnnnnnn.random()}", Toast.LENGTH_SHORT)
                .show()
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
        fragmentS2Binding = null
        super.onDestroy()
    }




}
