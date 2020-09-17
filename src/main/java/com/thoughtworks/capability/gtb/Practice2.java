package com.thoughtworks.capability.gtb;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static LocalDate getNextWorkDate(LocalDate date) {
      LocalDate nextWorkday = date;
      ZoneId zone = ZoneId.systemDefault();
      Instant instant = date.atStartOfDay().atZone(zone).toInstant();
      java.util.Date upDate = Date.from(instant);
      Calendar cal = Calendar.getInstance();
      cal.setTime(upDate);
      int w = cal.get(Calendar.DAY_OF_WEEK)-1;
      if(w==5)
      {
          nextWorkday = date.plusDays(3);
      }else
      if(w==6){
          nextWorkday = date.plusDays(2);
      }
      else{
          nextWorkday = date.plusDays(1);
      }
    return nextWorkday;
  }
}
