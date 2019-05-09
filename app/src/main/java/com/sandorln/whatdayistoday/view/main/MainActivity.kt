package com.sandorln.whatdayistoday.view.main

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.sandorln.whatdayistoday.R
import com.sandorln.whatdayistoday.databinding.AMainBinding
import com.sandorln.whatdayistoday.viewmodel.MainVM

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {

    private val binding: AMainBinding by lazy { DataBindingUtil.setContentView<AMainBinding>(this, R.layout.a_main) }
    private val viewModel: MainVM by lazy { ViewModelProviders.of(this)[MainVM::class.java] }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.vm = viewModel
        binding.act = this
        viewModel.setupNavigationItem(supportFragmentManager)
    }


    /**
     * Main Bottom Navigation Item Change 시
     * _ ViewModel 에서 처리하도록
     */
    override fun onNavigationItemSelected(selectItem: MenuItem): Boolean =
        viewModel.selectNavigationItem(selectItem, supportFragmentManager)
}
