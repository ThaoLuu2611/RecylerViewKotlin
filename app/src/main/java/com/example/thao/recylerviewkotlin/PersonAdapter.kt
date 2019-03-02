package com.example.thao.recylerviewkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.item_view.view.*

class PersonAdapter(val personList: ArrayList<Person>): RecyclerView.Adapter<PersonAdapter.ViewHolder>(){

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PersonAdapter.ViewHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.item_view, p0, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(p0: PersonAdapter.ViewHolder, p1: Int) {
        val person = personList[p1]
        p0.tvName.text = person.name
        p0.tvAddress.text = person.address

    }
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val tvName = itemView.findViewById(R.id.tvName) as TextView
        val tvAddress = itemView.findViewById(R.id.tvAddress) as TextView
    }
}