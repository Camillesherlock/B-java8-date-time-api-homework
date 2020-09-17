package com.thoughtworks.capability.gtb;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {
    private static int NEXT_WORKDAY_NEAR_FRIDAY=3;
    private static int NEXT_WORKDAY_NEAR_SATURDAY=2;
    private static int NEXT_WORKDAY_DEFAULT=1;

  public static LocalDate getNextWorkDate(LocalDate date) {
      switch (date.getDayOfWeek()) {
          case FRIDAY:
              return date.plusDays(NEXT_WORKDAY_NEAR_FRIDAY);
          case SATURDAY:
              return date.plusDays(NEXT_WORKDAY_NEAR_SATURDAY);
          default:
              return date.plusDays(NEXT_WORKDAY_DEFAULT);
      }
  }
}
