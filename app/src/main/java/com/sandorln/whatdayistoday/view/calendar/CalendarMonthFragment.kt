package com.sandorln.whatdayistoday.view.calendar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sandorln.whatdayistoday.R
import com.sandorln.whatdayistoday.data.MonthData
import com.sandorln.whatdayistoday.view.calendar.adapter.DayAdapter
import kotlinx.android.synthetic.main.f_calendar_month.*

/**
 * MonthAdapter 에서 사용될 Fragment
 * _ RecyclerView (Day) 가 존재
 */
class CalendarMonthFragment : Fragment() {

    lateinit var monthData: MonthData

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.f_calendar_month, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        rc_month.layoutManager = GridLayoutManager(view.context, 7)
        rc_month.addItemDecoration(DividerItemDecoration(view.context, GridLayoutManager.HORIZONTAL))
        rc_month.addItemDecoration(DividerItemDecoration(view.context, GridLayoutManager.VERTICAL))
        rc_month.adapter = DayAdapter()
    }
}