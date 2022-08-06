public class Main {
    public static void main(String[] args) {
        //  Задание 1
        short rag = 35;
        byte box = 3;
        int mirrow = 500;
        long watch = 10_000l;
        float sugar = 10.12f;
        double ring = 20.99999999999;
        boolean smallRing = ring < 21;
        char music = 14;

        // Задание 2
        double man1 = 78.2;
        double man2 = 82.7;
        double totalWeight = man1 + man2;
        double weightDifference = man2 - man1;

                System.out.println("Ответ задача 2: вес двух боксеров - " + totalWeight + " кг." +
                        ", разница в весе боксеров - " + weightDifference + " кг.");
          // Задание 3
        int bananas = 80 * 5;
        int milk = (200 / 100) * 105;
        int ice = 100 * 2;
        int egg = 4 * 70;
        double breakfast = bananas + milk + ice + egg;
        double breakfastKg = breakfast / 1000;
                System.out.println("Ответ задача 3: Вес завтрака в граммах = " + breakfast +
                        ", вес завтрака в килограммах = " + breakfastKg);
        // Задание 4
        short weight = 7;
        double kg = 1000;
        double firstVershion = 250 / kg;
        double secondVariation = 500 / kg;
        double firstDiet = weight / firstVershion;
        double secondDiet = weight / secondVariation;
        double onEverageDays = (firstDiet + secondDiet) / 2;
        System.out.println ("1 диета:" + firstDiet + " дней, 2 диета:" + secondDiet + " дней,"
                + " среднее кол.дней диеты " + onEverageDays);
        // Задание 5
        int m = 67_760;
        int d = 83_690;
        int c = 76_230;
        double salaryIncrease = 0.1;
        double m10 = m * salaryIncrease;
        double d10 = d * salaryIncrease;
        double c10 = c * salaryIncrease;
        double mTotal = m + m10;
        double dTotal = d + d10;
        double cTotal = c + c10;
        double year = 12;
        double mY = (mTotal * year) - (m * year);
        double dY = (dTotal * year) - (d * year);
        double cY = (cTotal * year) - (c * year);
       System.out.println("Ежемесячный доход Маши составил = " + mTotal + " руб., " +
               " ее годовой доход вырос на: " + mY +" руб."+
                       " Ежемесячный доход Дениса составил = " + dTotal+ " руб.," +
               " его годовой доход вырос на: " + dY +" руб."+
               " Ежемесячный доход Кристины составил = " + cTotal + " руб." +
               "ее годовой доход вырос на: " + cY +" руб.");


    }

}