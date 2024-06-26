package com.example.androidmaster.superheroapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidmaster.R

class SuperheroAdapter(var superheroList: List<SuperheroItemResponse> = emptyList()) :
    RecyclerView.Adapter<SuperheroViewHolder>() {

        fun updateList (list: List<SuperheroItemResponse>){
            superheroList = list
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        return SuperheroViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_superhero, parent, false)
        )
    }

    override fun onBindViewHolder(viewholder: SuperheroViewHolder, position: Int) {
        viewholder.bind(superheroList[position])
    }

    override fun getItemCount() = superheroList.size
}