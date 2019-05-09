package com.sandorln.whatdayistoday.viewmodel

import androidx.lifecycle.ViewModel
import com.sandorln.whatdayistoday.data.DayData
import com.sandorln.whatdayistoday.data.MonthData

class CalendarMainVM : ViewModel() {
    var listMonthData = mutableListOf<MonthData>()

    init {
        for (index in 1..12) {
            val mapDays = mutableMapOf<Int, DayData>()

            for (days in 0..42)
                mapDays[days] = DayData("휴일 $days", "메모 : $days", days)

            val monthData = MonthData(0, 0, 42, 2019, index, mapDays)
            listMonthData.add(monthData)
        }
    }
}