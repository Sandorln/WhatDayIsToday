package com.sandorln.whatdayistoday.view.calendar.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.sandorln.whatdayistoday.R
import kotlinx.android.synthetic.main.item_days.view.*

/**
 * CalendarMonthFragment RecyclerView Adapter
 * _ Grid View
 */
class DayAdapter : RecyclerView.Adapter<DayAdapter.DayViewHolder>() {
    var viewHeight: Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayViewHolder {
        viewHeight = parent.height / 6
        return DayViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_days, parent, false))
    }

    override fun getItemCount(): Int = 42
    override fun onBindViewHolder(holder: DayViewHolder, position: Int) {
        holder.itemView.apply {
            layoutParams =
                ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, viewHeight)
            tx_dayNum.text = position.toString()
        }
    }

    inner class DayViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}