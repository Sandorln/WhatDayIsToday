package com.sandorln.whatdayistoday.view.calendar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.sandorln.whatdayistoday.R
import com.sandorln.whatdayistoday.data.DayData
import com.sandorln.whatdayistoday.databinding.ACalendarDetailBinding
import com.sandorln.whatdayistoday.viewmodel.CalendarDetailViewModel

class CalendarDayDetailActivity : AppCompatActivity() {
    private val binding: ACalendarDetailBinding by lazy {
        DataBindingUtil.setContentView<ACalendarDetailBinding>(this, R.layout.a_calendar_detail)
    }

    private val viewModel: CalendarDetailViewModel by lazy {
        ViewModelProviders.of(this)[CalendarDetailViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.dayData.value = DayData("공휴일은 언제일까", "메모값이다 메모", 300)
        binding.vm = viewModel
    }
}