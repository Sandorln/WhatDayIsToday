package com.sandorln.whatdayistoday.view.calendar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.sandorln.whatdayistoday.databinding.FCalendarMainBinding
import com.sandorln.whatdayistoday.viewmodel.CalendarMainVM

class CalendarMainFragment : Fragment() {
    lateinit var binding: FCalendarMainBinding
    private val viewModel: CalendarMainVM by lazy { ViewModelProviders.of(this)[CalendarMainVM::class.java] }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FCalendarMainBinding.inflate(inflater, container, false)
        binding.vm = viewModel
        binding.act = this
        return binding.root
    }

}