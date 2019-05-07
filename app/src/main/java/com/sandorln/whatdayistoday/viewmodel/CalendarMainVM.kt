package com.sandorln.whatdayistoday.viewmodel

import androidx.lifecycle.ViewModel
import com.sandorln.whatdayistoday.data.MonthData
import com.sandorln.whatdayistoday.view.calendar.CalendarMonthFragment

class CalendarMainVM : ViewModel() {
    private var listMonthData = mutableListOf<MonthData>()
    var listFrgMonth = mutableListOf<CalendarMonthFragment>()

    init {
        /* test 용 */
        for (index in 1..12) {
            val monthData = MonthData(0, 0, 42, 2019, index)
            listMonthData.add(monthData)

            val monthFrg = CalendarMonthFragment()
            monthFrg.monthData = monthData
            listFrgMonth.add(monthFrg)
        }
    }
}