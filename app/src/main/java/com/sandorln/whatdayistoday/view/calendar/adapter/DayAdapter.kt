package com.sandorln.whatdayistoday.view.calendar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sandorln.whatdayistoday.R

/**
 * CalendarMonthFragment RecyclerView Adapter
 * _ Grid View
 */
class DayAdapter : RecyclerView.Adapter<DayAdapter.DayViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayViewHolder =
        DayViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_days, parent, false))
    override fun getItemCount(): Int = 42
    override fun onBindViewHolder(holder: DayViewHolder, position: Int) {}

    inner class DayViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}