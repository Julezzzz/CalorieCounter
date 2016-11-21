package de.fhdw.bfws115a.team1.caloriecounter.entities;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Viktor on 15.11.2016.
 */

public class Entry {
    private String mName;

    private int mYear;
    private int mMonth;
    private int mDay;
    private int mOrderInDay;

    public Entry(int year, int month, int day) {
        mYear = year;
        mMonth = month;
        mDay = day;
    }

    public Entry(Entry entry) {
        this(entry.getYear(), entry.getMonth(), entry.getDay());
    }

    public int getYear() {
        return mYear;
    }

    public int getMonth() {
        return mMonth;
    }

    public int getDay() {
        return mDay;
    }

    private void setOrderInDay(int order) {
        mOrderInDay = order;
    }

    public int getOrderInDay() {
        return mOrderInDay;
    }
}
