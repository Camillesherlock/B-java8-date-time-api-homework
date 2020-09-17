package com.thoughtworks.capability.gtb;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */

public class Practice1 {
 private static Month MONTH_OF_LABORDAY = Month.MAY;
 private static int DAY_OF_LABORDAY = 1;
 private static int GAP_YEAR = 1;
  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    LocalDate nextLaborDay = LocalDate.of(date.getYear(),MONTH_OF_LABORDAY,DAY_OF_LABORDAY);
    if(date.isAfter(nextLaborDay)){
      nextLaborDay = nextLaborDay.plusYears(GAP_YEAR);
    }
    return (nextLaborDay.toEpochDay()-date.toEpochDay());

}}
