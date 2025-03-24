package com.limulcomp.daybydaycrm_spring.services;

import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Utilitaires {
    public static List<LocalDate> getAllDaysOfMonth() {
        LocalDate now = LocalDate.now();
        LocalDate startOfMonth = now.withDayOfMonth(1);
        LocalDate endOfMonth = now.withDayOfMonth(now.lengthOfMonth());

        List<LocalDate> daysOfMonth = new ArrayList<>();
        for (LocalDate date = startOfMonth; !date.isAfter(endOfMonth); date = date.plusDays(1)) {
            daysOfMonth.add(date);
        }

        return daysOfMonth;
    }

    public static String getCurrentMonthInFrench() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        String[] months = new DateFormatSymbols().getMonths();
        return months[month];
    }
}
