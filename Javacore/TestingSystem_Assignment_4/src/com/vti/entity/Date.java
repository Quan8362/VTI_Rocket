package com.vti.entity;

public class Date {
    private int day;
    private int moth;
    private int year;

    public Date(int day, int moth, int year) {
        this.day = day;
        this.moth = moth;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMoth() {
        return moth;
    }

    public void setMoth(int moth) {
        this.moth = moth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", moth=" + moth +
                ", year=" + year +
                '}';
    }

    public boolean isLeapYear() {
        year = this.year;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
