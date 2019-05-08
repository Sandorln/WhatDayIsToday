package com.sandorln.whatdayistoday.viewmodel

import androidx.lifecycle.ViewModel
import com.sandorln.whatdayistoday.data.DayData
import com.sandorln.whatdayistoday.data.MonthData
import com.sandorln.whatdayistoday.view.calendar.CalendarMonthFragment

class CalendarMainVM : ViewModel() {
    private var listMonthData = mutableListOf<MonthData>()
    var listFrgMonth = mutableListOf<CalendarMonthFragment>()

    init {
        /* test 용 */
        for (index in 1..12) {
            val mapDays = mutableMapOf<Int, DayData>()

            for (days in 1..42)
                mapDays[days] = DayData("휴일 $days", "메모 : $days", days)

            val monthData = MonthData(0, 0, 42, 2019, index, mapDays)
            listMonthData.add(monthData)

            val monthFrg = CalendarMonthFragment()
            monthFrg.monthData = monthData
            listFrgMonth.add(monthFrg)
        }
    }
}