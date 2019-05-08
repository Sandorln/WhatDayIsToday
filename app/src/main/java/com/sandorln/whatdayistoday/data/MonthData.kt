package com.sandorln.whatdayistoday.data

import java.io.Serializable

/**
 * MonthAdapter 에서 사용 될 DataClass
 * _ firstDayWeek : 달 첫 날의 시작 요일
 * _ firstWorkInfo : 달 첫 날의 근무 형태가 몇 번째인지 Index
 * _ selectY : 해당 달의 년도 ( ex : 1999 _ 4자리 )
 * _ selectM : 해당 달 ( ex : 01 _ 2자리 )
 * _ mapDayData : Key ( 일 / 없을 경우 Default 값 으로 처리 ) / value ( DayData / 사용자로 하여금 변경 되었거나 공휴일 값 존재 )
 */
data class MonthData(
    val firstDayWeek: Int, val firstWorkInfo: Int, val lastDay: Int, val selectY: Int, val selectM: Int,
    val mapDayData: Map<Int, DayData>
) : Serializable