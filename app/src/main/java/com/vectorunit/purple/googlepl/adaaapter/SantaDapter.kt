package com.vectorunit.purple.googlepl.adaaapter

import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.vectorunit.purple.googlepl.R
import com.vectorunit.purple.googlepl.databinding.ElelelelleBinding
import com.vectorunit.purple.googlepl.pagerrrr.Diiiiifaaaaaa
import com.vectorunit.purple.googlepl.pagerrrr.Onnnnyelem
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter


class SantaDapter :
    ListAdapter<Onnnnyelem, SantaDapter.Skoojfrijrjf>(Diiiiifaaaaaa()) {


    class Skoojfrijrjf(view: View) : RecyclerView.ViewHolder(view) {
        val bindingdfrgtt = ElelelelleBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Skoojfrijrjf {
        LayoutInflater.from(parent.context)
            .inflate(R.layout.elelelelle, parent, false).also {
                return Skoojfrijrjf(it)
            }
    }

    override fun onBindViewHolder(holder: Skoojfrijrjf, position: Int) {
        getItem(position).also {
            holder.bindingdfrgtt.imgOnSingleItem.setImageResource(it.iiiiimmm)
        }

    }
}

