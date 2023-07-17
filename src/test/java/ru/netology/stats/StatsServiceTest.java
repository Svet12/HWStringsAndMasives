package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void testCalculatingTheSumOfAllSales() {

        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        int expectedSum = 180;
        int actualSum = service.salesAmount(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testCalculatingTheAverageAmountOfSalesPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        double average = 0;

        if (sales.length > 0) {
            double sum = 0;
            for (int j = 0; j < sales.length; j++) {
                sum += sales[j];
            }
            average = sum / sales.length;
        }
        int expectedAverage = 15;
        int actualAverage = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);

    }

    @Test
    public void testCalculationOfTheNumberOfTheMonthInWhichThereWasMaximumOfSales() {

        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int numberMaxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[numberMaxMonth]) {
                numberMaxMonth = i;
            }
            int expectedNumberMaxMonth = 5;
            int actualNumberMaxMonth = service.maxMonth(sales);

            Assertions.assertEquals(expectedNumberMaxMonth, actualNumberMaxMonth);

        }
    }

    @Test
    public void testCalculationOfTheNumberOfTheMonthInWhichThereWasMinimumOfSales() {

        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int numberMinMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[numberMinMonth]) {
                numberMinMonth = i;
            }
        }
        int expectedNumberMinMonth = 8;
        int actualNumberMinMonth = service.minMonth(sales);

        Assertions.assertEquals(expectedNumberMinMonth, actualNumberMinMonth);
    }

    @Test
    public void testCalculationOfTheNumberOfMonthsInWhichSalesWereBelowAverage() {

        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

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
        int expectedMonthsIsBelowAverage = 5;
        int actualNumberMonthsIsBelowAverage = service.belowAverage(sales);

        Assertions.assertEquals(expectedMonthsIsBelowAverage, actualNumberMonthsIsBelowAverage);
    }

    @Test
    public void testCalculationOfTheNumberOfMonthsInWhichSalesWereAboveAverage() {

        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

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
        int expectedMonthsIsAboveAverage = 5;
        int actualNumberMonthsIsAboveAverage = service.aboveAverage(sales);

        Assertions.assertEquals(expectedMonthsIsAboveAverage, actualNumberMonthsIsAboveAverage);
    }
}

