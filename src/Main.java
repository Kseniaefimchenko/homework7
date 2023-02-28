public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача1");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + deposit;
            month = month + 1;
            System.out.println("Месяц: " + month + ". Сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();
        for (int back = 10; back >= 1; back = back - 1) {
            System.out.print(back + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача3");
        int birthRate = 17;
        int mortality = 8;
        int totalPopulation = 12_000_000;

        int annualBirthRate = totalPopulation / 1000 * 17;
        int annualMortality = totalPopulation / 1000 * 8;

        for (int year = 1; year <= 10; year++) {
            totalPopulation = totalPopulation + (annualBirthRate - annualMortality);
            System.out.println("Год " + year + ". Численность населения составляет " + totalPopulation);
        }
    }

    public static void task4() {
        System.out.println("Задача4");
        int depositAmount = 15000;
        int month = 0;
        int total = 0;
        double monthlySavings = depositAmount * 0.07 + depositAmount;

        for (; total <= 12_000_000; month++) {
            total = total + total / 100;
            total = (int) (total + monthlySavings);
            if (month % 9 == 0) {
                System.out.println("Месяц " + month + ". Итого " + total);
            }
        }
    }

    public static void task5() {
        System.out.println("Задача5");
        int depositAmount = 15000;
        int month = 0;
        int total = 0;
        double monthlySavings = depositAmount * 0.07 + depositAmount;

        for (; total <= 12_000_000; month = month + 6) {
            total = total + total / 100;
            total = (int) (total + monthlySavings);
            System.out.println("Месяц " + month + ". Итого " + total);
        }
    }

    public static void task6() {
        System.out.println("Задача6");
        int depositAmount = 15000;
        int total = 0;

        for (int year = 0; year <= 9 * 12; year = year + 6) {
            total = total + total / 100;
            total = (int) ((int) total + (depositAmount * 0.07 + depositAmount));
            System.out.println("Месяц " + year + ". Итого " + total);
        }
    }

    public static void task7() {
        System.out.println("Задача7");
        int firstFriday = 7;
        int currentDay = firstFriday;
        while (currentDay <= 31) {
            System.out.println("Сегодня пятница " + currentDay + ". Необходимо подготовить отчет");
            currentDay = currentDay + 7;
        }
    }

    public static void task8() {
        System.out.println("Задача8");

       int year = 2023;
       int before = 1896;
       for (; before <= year + 100; before = before + 79){
           System.out.println(before);
        }
        }
    }
