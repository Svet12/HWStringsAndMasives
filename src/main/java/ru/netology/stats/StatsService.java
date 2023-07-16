package ru.netology.stats;

public class StatsService {
    public int salesAmount(int[] sales) {                // всего продаж

        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];

        }
        return sum;
    }


    public int averageSalesAmount(int[] sales) {          // среднее значение продаж
        double average = 0;
        if (sales.length > 0) {
            double sum = 0;
            for (int j = 0; j < sales.length; j++) {
                sum += sales[j];
            }
            average = sum / sales.length;
        }

        return (int) average;
    }


    public int minMonth(int[] sales) {                   // минимальные продажи
        int numberMinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[numberMinMonth]) {
                numberMinMonth = i;
            }
        }
        return numberMinMonth;
    }


    public int maxMonth(int[] sales) {          // максимальные
        int numberMaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[numberMaxMonth]) {
                numberMaxMonth = i;
            }
        }
        return numberMaxMonth;
    }


    public int belowAverage(int[] sales) {

        double sum = 0;
        double average = 0;
        int monthsIsBelowAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        average = sum / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthsIsBelowAverage++;
            }
        }
        return monthsIsBelowAverage;
    }

    public int aboveAverage(int[] sales) {                                // выше среднего
        double sum = 0;
        double average = 0;
        int monthsIsAboveAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        average = sum / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthsIsAboveAverage++;
            }
        }
        return monthsIsAboveAverage;
    }

}






