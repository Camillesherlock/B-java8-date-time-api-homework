package com.thoughtworks.capability.gtb;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */

public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int year = date.getYear();
    Period timeDifference;
    LocalDate nextLaborDay = LocalDate.of(year,5,1);
    if(date.isAfter(nextLaborDay)){
      nextLaborDay = nextLaborDay.plusYears(1);
    }
    timeDifference = Period.between(date,nextLaborDay);
    return timeDifference.getDays();
  }

}
