package ru.netology.stats;

import static java.lang.Long.sum;

public class StatsService {

    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long calculateAverage(long[] sales) {
        long sum = calcSum(sales);
        return sum / sales.length;
    }

    public long findMax(long[] sales) {
        int currentMax = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[currentMax]) {
                currentMax = month;
            }
            month = month + 1;
        }
        return currentMax + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long calculateMonthsSalesBelowAverage(long[] sales) {
        int monthQuantity = 0;
        long averageSales = calculateAverage(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                monthQuantity = monthQuantity + 1;
            }
            averageSales = averageSales;
        }
        return monthQuantity;
    }

    public long calculateMonthsSalesAboveAverage(long[] sales) {
        long monthQuantity = 0;
        long averageSales = calculateAverage(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                monthQuantity = monthQuantity + 1;
            }
            averageSales = averageSales;
        }
        return monthQuantity;
    }
}



















