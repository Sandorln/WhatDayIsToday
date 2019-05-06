package com.sandorln.whatdayistoday.viewmodel

import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModel
import com.sandorln.whatdayistoday.R
import com.sandorln.whatdayistoday.view.calendar.CalendarMainFragment
import com.sandorln.whatdayistoday.view.community.CommunityMainFragment
import com.sandorln.whatdayistoday.view.createteam.CreateTeamMainFragment

class MainVM : ViewModel() {

    private lateinit var active: Fragment

    private val calendarMainFragment = CalendarMainFragment()
//    private val communityMainFragment = CommunityMainFragment()
//    private val createTeamMainFragment = CreateTeamMainFragment()

    /**
     * BottomNavigation 첫 초기화 작업
     */
    fun setupNavigationItem(fm: FragmentManager) {
        fm.beginTransaction().add(R.id.f_mainContent, calendarMainFragment, "calendar")
//            .add(R.id.f_mainContent, communityMainFragment, "community").hide(communityMainFragment)
//            .add(R.id.f_mainContent, createTeamMainFragment, "createteam").hide(createTeamMainFragment)
            .commit()
        active = calendarMainFragment
    }

    /**
     * MainActivity _ BottomNavigation Menu Select Event 처리
     * MainActivity 에서 listener 생성 후 ViewModel 에서 처리하는 방식
     */
    fun selectNavigationItem(selectItem: MenuItem, fm: FragmentManager): Boolean {
        return when (selectItem.itemId) {
            R.id.navi_calendar -> {
                fm.beginTransaction().hide(active).show(calendarMainFragment).commit()
                active = calendarMainFragment
                true
            }
            R.id.navi_community -> {
//                fm.beginTransaction().hide(active).show(communityMainFragment).commit()
//                active = communityMainFragment
                true
            }
            R.id.navi_createTeam -> {
//                fm.beginTransaction().hide(active).show(createTeamMainFragment).commit()
//                active = createTeamMainFragment
                true
            }
            else -> false
        }
    }
}