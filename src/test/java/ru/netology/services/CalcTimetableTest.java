package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTimetableTest<CalcTimetableService> {

    @Test
    public void test1() {
        CalcTimetable service = new CalcTimetable();

        int income;
        int expences;
        int threshold;

        int actual = ((CalcTimetable) service).calculate(income = 10_000, expences = 3_000, threshold = 20_000);
        int expended = 3;

        Assertions.assertEquals(expended, actual);
    }

    @Test
    public void test2() {
        CalcTimetable service = new CalcTimetable();

        int income;
        int expences;
        int threshold;

        int actual = ((CalcTimetable) service).calculate(income = 100_000, expences = 60_000, threshold = 150_000);
        int expended = 2;

        Assertions.assertEquals(expended, actual);
    }

}