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
        System.out.println("Задача 1");
        int save = 15_000;
        int accumulate = 0;
        int months = 0;
        while (accumulate < 2_459_000) {
            accumulate = accumulate + save;
            months += 1;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + accumulate + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int n = 0;
        int m = 10;
        while (n < 10) {
            n++;
            System.out.print(n + " ");
        }
        System.out.println();
        for (; m > 0; m--) {
            System.out.print(m + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int birthRate = 17;
        int mortality = 8;
        int total = 12_000_000;
        int years = 10;
        int year = 1;

        while (year <= years) {
            total += total * (birthRate - mortality) / 1000;
            System.out.println("Год " + year + " , численность населения составляет " + total);
            year++;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double savingsAccount = 15_000d;
        int interestOnDeposit = 7;
        int month = 0;
        double collectTheAmount = 12_000_000d;
        while (savingsAccount <= collectTheAmount) {
            month++;
            savingsAccount += savingsAccount * interestOnDeposit /100;
            System.out.println("Месяц " + month + " Итого " + savingsAccount);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double savingsAccount = 15_000d;
        int interestOnDeposit = 7;
        int month = 0;
        double collectTheAmount = 12_000_000d;

        while (savingsAccount <= collectTheAmount) {
            savingsAccount += savingsAccount * interestOnDeposit /100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + savingsAccount);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        double savingsAccount = 15_000d;
        int interestOnDeposit = 7;
        int month = 0;
        int year = 12;
        int months = year * 9;
        do {
            savingsAccount += savingsAccount * interestOnDeposit /100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + savingsAccount);
            }
        } while (month <= months);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 1;
        int month = 31;
        do {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет.");
            friday += 7;
        } while (friday <= month);
    }

    public static void task8() {
        System.out.println("Задача 8");
        int yearNow = 2023;
        int twoHundredYearsAgo = yearNow - 200;
        int aHundredYearsAhead = yearNow + 100;
        for (int year = 0; year <= aHundredYearsAhead; year += 79) {
            if (year > twoHundredYearsAgo && year < aHundredYearsAhead) {
                System.out.println(year);
            }
        }
    }
}
