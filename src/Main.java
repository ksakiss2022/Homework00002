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

    }
}