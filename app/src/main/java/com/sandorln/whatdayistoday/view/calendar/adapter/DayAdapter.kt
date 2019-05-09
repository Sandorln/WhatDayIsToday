package com.sandorln.whatdayistoday.view.calendar.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sandorln.whatdayistoday.data.DayData
import com.sandorln.whatdayistoday.databinding.ItemDaysBinding
import com.sandorln.whatdayistoday.view.calendar.CalendarDayDetailActivity

/**
 * CalendarMonthFragment RecyclerView Adapter
 * _ Grid View
 */
class DayAdapter(private val mapDayData: Map<Int, DayData>) :
    RecyclerView.Adapter<DayAdapter.DayViewHolder>() {

    var viewHeight = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayViewHolder {
        viewHeight = parent.height / 6
        val binding = ItemDaysBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DayViewHolder(binding)
    }

    override fun getItemCount(): Int = 42

    override fun onBindViewHolder(holder: DayViewHolder, position: Int) {
        holder.itemView.apply {
            layoutParams.height = viewHeight
            setOnClickListener {
                context.startActivity(Intent(context, CalendarDayDetailActivity::class.java))
            }
        }
        holder.binding.apply {
            day = position
            dayData = mapDayData[position]
        }
    }

    inner class DayViewHolder(val binding: ItemDaysBinding) : RecyclerView.ViewHolder(binding.root)
}