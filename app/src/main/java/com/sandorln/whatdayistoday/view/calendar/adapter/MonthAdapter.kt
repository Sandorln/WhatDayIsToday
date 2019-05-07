package com.sandorln.whatdayistoday.view.calendar.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.sandorln.whatdayistoday.viewmodel.CalendarMainVM

/**
 * CalendarMainActivity ViewPager Adapter
 * _ 무한 스크롤 개발 예정
 */
class MonthAdapter(fm: FragmentManager, private val viewModel: CalendarMainVM) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment = viewModel.listFrgMonth[position]
    override fun getCount(): Int = viewModel.listFrgMonth.size
}