package com.sandorln.whatdayistoday.view.calendar.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sandorln.whatdayistoday.data.MonthData
import com.sandorln.whatdayistoday.databinding.ItemMonthBinding
import kotlinx.android.synthetic.main.item_month.view.*

/**
 * CalendarMainActivity ViewPager Adapter
 * _ 무한 스크롤 개발 예정
 */
class MonthAdapter(private val listMonth: List<MonthData>) : RecyclerView.Adapter<MonthAdapter.MonthViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonthViewHolder =
        MonthViewHolder(ItemMonthBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun getItemCount(): Int = listMonth.size

    override fun onBindViewHolder(holder: MonthViewHolder, position: Int) {
        holder.itemView.apply {
            rc_days.layoutManager = GridLayoutManager(context, 7)
            rc_days.adapter = DayAdapter(listMonth[position].mapDayData)
        }
    }

    inner class MonthViewHolder(val binding: ItemMonthBinding) : RecyclerView.ViewHolder(binding.root)
}