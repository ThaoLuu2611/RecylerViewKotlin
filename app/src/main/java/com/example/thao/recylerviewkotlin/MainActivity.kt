package com.example.thao.recylerviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recylerView.layoutManager = LinearLayoutManager(this)
        val personList = ArrayList<Person>()
        personList.add(Person("Jennier","America"))
        personList.add(Person("Lee Han","Korea"))
        personList.add(Person("Luu Thao","VietNam"))
        recylerView.adapter = PersonAdapter(personList)

    }
    fun testDevelop1()
    {

    }

    fun testDevelop2()
    {

    }
}
