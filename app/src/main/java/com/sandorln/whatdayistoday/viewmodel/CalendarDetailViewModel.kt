package com.sandorln.whatdayistoday.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sandorln.whatdayistoday.data.DayData

class CalendarDetailViewModel : ViewModel() {

    val memo = MutableLiveData<String>()

    private val _overTime = MutableLiveData<Int>()
    val overTime: LiveData<Int> get() = _overTime

    fun setUP(dayData: DayData){
        memo.value = dayData.memo
        _overTime.value = dayData.overTime
    }
}