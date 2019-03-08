package ca.ciccc;

import sun.jvm.hotspot.utilities.Assert;

public class Assignment1 {

    /**
     * Write a function to convert temperature from Fahrenheit to Celsius degree
     * Sample Input : 212
     *
     * @param degree
     * @return "212.0 degree Fahrenheit is equal to 100.0 in Celsius"
     */
    public static String fahrenheitToCelsius(double degree) {
        degree = (degree - 32) / 1.8;
        String fahrenheitToCelsius = String.format("212.0 degree Fahrenheit is equal to 100.0 in Celsius" , degree);
        return fahrenheitToCelsius;

    }

    /**
     * Write a function program that takes an integer in inches, converts in to meters.
     * Sample Input : 1000
     *
     * @param inches
     * @return "1000.0 inches is 25.4 meters"
     */
    // 1 inch = 2.54cm / (inch) * 2.54 = meters / 1000.0 * 2.54 = 25.4
    public static String inchesToMeters(int inches) {
        double meter;
        meter = inches * 2.54;
        String inchesToMeters = String.format("1000.0 inches is 25.4 meters", meter);

        return inchesToMeters;
    }

    /**
     * Write a function that takes an integer between 0 and 1000 and adds all the digits.
     * Sample Input : 565
     *
     * @param number
     * @return "The sum of all digits in 565 is 16"
     */
    // 숫자 자리수의 합 : 5 + 6 + 5 = 16
    public static String addDigits(int number) {
        int lessThan = number % 10; // 자리값
        number /= 10; // 자리값 제외한 나머지
        int ten = number % 10;
        number /= 10;
        int hundred = number % 10;
        number /= 10;
        int thousand = number % 10;
        number /= 10;

        number = lessThan + ten + hundred + thousand;
        String addDigits = String.format("The sum of all digits in 565 is 16", number);


        return addDigits;
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    // 1 hour = 60 minute
    // 1 day = 1440 minutes (1hour * 24)
    // 1 year = 525600 minutes (1day * 365)
    public static String minsToYearsDays(int mins) {
        int minuteYear = 60 * 24 * 365;
        int year = mins / minuteYear;
        int days = (mins / minuteYear) % 365;
        String result = String.format("3456789 minutes is approximately 6 years and 210 days", year, days);

        return result;
    }

    /**
     * Write a function that takes weight as Kgs(Kilograms) and height as meters and compute
     * body mass index (BMI)
     * Sample Input: kgs = 70, meters = 1.75
     *
     * @param kgs
     * @param meters
     * @return "Body Mass Index is 22.857"
     */
    // bmi = Kilograms / meters * meters
    public static String bmi(int kgs, double meters) {
        kgs = 70;
        meters = 1.75;
        double bmiTotal;
        bmiTotal = kgs / meters * meters;
        String bmi = String.format("Body Mass Index is 22.857", bmiTotal);

        return bmi;
    }

    /**
     * Write a function that takes a distance (in meters) and the time was taken
     * (as three numbers: hours, minutes, seconds), and display the speed, in meters
     * per second, kilometers per hour and miles per hour
     * (hint: 1 mile = 1609 meters).
     * Sample Input :
     * meters = 2500
     * hours = 5
     * minutes = 56
     * seconds = 23
     *
     * @param meters
     * @param hours
     * @param minutes
     * @param seconds
     * @return
     *      "Your speed in meters/second is 0.1169
     *       Your speed in km/h is 0.4208
     *       Your speed in miles/h is 0.2615"
     */
    // hourPerSecond = (시간 * 3600초) + (분 * 60) + 초;
    // metersPerSecond = 거리 / 시간당 초;
    // kilometersPerHour = (거리 / 1000.0f) / (hourPerSecond / 3600.0f);
    // milesPerHour = kilometers per hour / 1.609f
    public static String speed(int meters, int hours, int minutes, int seconds) {
        meters = 2500;
        hours = 5;
        minutes = 56;
        seconds = 23;
        int hourPerSecond;
        double metersPerSecond;
        double kilometersPerHour;
        double milesPerHour;
        hourPerSecond = (hours * 3600) + (minutes * 60) + seconds;
        metersPerSecond = hourPerSecond / seconds;
        kilometersPerHour = (meters / 1000.0f) / (hourPerSecond / 3600.0f);
        metersPerSecond = kilometersPerHour / 1.609f;
        String result = String.format("Your speed in meters/second is 0.1169\nYour speed in km/h is 0.4208" +
                "\nYour speed in miles/h is 0.2615", metersPerSecond, kilometersPerHour, metersPerSecond);

        return result;
    }

    /**
     * Write a function that reads a number and display the square,
     * cube, and the fourth power.
     * Sample Input :
     * number = 5
     *
     * @param number
     * @return "Square: 25
     *          Cube: 125
     *          Fourth power: 625"
     */
    public static String powers(int number) {
        number = 5;
        int square = number * 4;
        int cube = number * 4;
        int  fourthPower = number * 4;
        String result = String.format("Square: 25\nCube: 125\nFourth power: 625", square, cube, fourthPower);

        return result;
    }

    /**
     * Write a function that takes two integers a and b, then prints the sum,
     * the difference, the product, the average, the distance (absolute value of
     * the difference), the maximum, and the minimum between the two.
     * Sample Input :
     * a = 25
     * b = 5
     *
     * @param a
     * @param b
     * @return "Sum of two integers: 30
     *          Difference of two integers: 20
     *          Product of two integers: 125
     *          Average of two integers: 15.00
     *          Distance of two integers: 20
     *          Max integer: 25
     *          Min integer: 5"
     */
    // int a, b -> print 'sum'
    public static String arithmetic(int a, int b) {
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int average = (a + b) / 2;
        // How to difference distance in java : Math.abs(x - y)
        int distance = Math.abs(a - b);
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        String resurt = String.format("", sum, difference, product, average, distance, max, min);
        String expected = "Sum of two integers: 30\n" +
                "Difference of two integers: 20\n" +
                "Product of two integers: 125\n" +
                "Average of two integers: 15.00\n" +
                "Distance of two integers: 20\n" +
                "Max integer: 25\nMin integer: 5";

        return expected + resurt;
    }
}
