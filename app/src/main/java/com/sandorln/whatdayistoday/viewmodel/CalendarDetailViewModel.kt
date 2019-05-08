package com.sandorln.whatdayistoday.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sandorln.whatdayistoday.data.DayData

class CalendarDetailViewModel : ViewModel() {
    val dayData = MutableLiveData<DayData>()
}