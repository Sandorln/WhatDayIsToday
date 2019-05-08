package com.sandorln.whatdayistoday.data

/**
 * DayAdapter 에서 사용 될 DataClass
 * _ holiday : 공휴일
 * _ memo : 사용자가 남긴 메모
 * _ overTime : 추가 근무 시간 (초 단위)
 */
data class DayData(val holiday: String, val memo: String, val overTime: Int)