package ru.netology.stats;

public class StatsService {

    public long calcSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long calculateAverage(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }

    public int findMax(long[] sales) {
        int currentMax = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > sales[currentMax]) {
                currentMax = month;
            }
            month = month + 1;
        }
        return currentMax + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale < sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateMonthsSalesBelowAverage(long[] sales) {
        int monthQuantity = 0;
        int averageSales = 15;
        for (long sale : sales) {
            if (sale <= averageSales) {
                monthQuantity = monthQuantity + 1;
            }
            averageSales = averageSales;
        }
            return monthQuantity;
        }

    public int calculateMonthsSalesAboveAverage(long[] sales) {
        int monthQuantity = 0;
        int averageSales = 15;
        for (long sale : sales) {
            if (sale > averageSales) {
                monthQuantity = monthQuantity + 1;
            }
            averageSales = averageSales;
        }
        return monthQuantity;
    }
}

















