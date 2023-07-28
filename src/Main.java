public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
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
        int countryY = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int totalPopulation = 0;
        int yearBirthRate = 0;
        int yearMortality = 0;

//        int totalPopulationBirthRate = 0;
        //        Год …, численность населения составляет …
        while (totalPopulation < 10) {
            totalPopulation = countryY * birthRate;
            int totalPopulationBirthRate = totalPopulation / 1000;
//            System.out.println("Рождаемость в 1 год " + totalPopulationBirthRate);

            totalPopulation = countryY * mortality;
            int totalPopulationMortality = totalPopulation / 1000;
//            System.out.println("Смертность в 1 год " + totalPopulationMortality);

            for (int i = 1; i <= 10; i++) {
                yearBirthRate = totalPopulationBirthRate * i;
//                System.out.println(i + " " + yearBirthRate);
            }

            for (int i = 1; i <= 10; i++) {
                yearMortality = totalPopulationMortality * i;
//                System.out.println(i + " " + yearMortality);
            }

            for (int i = 1; i <= 10; i++) {
                int people = yearBirthRate - yearMortality;
                int result = people * i;
                System.out.println("Год " + i + ", численность населения составляет " + result);

            }

        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int savingsAccount = 0;
        int interestOnDeposit = 7;
        int initialDepositAmount = 15_000;
        int interestPerMonth = 0;
        int i = 0;
        while (interestPerMonth <= 12_000_000) {
            i++;
            savingsAccount = initialDepositAmount * interestOnDeposit;
            interestPerMonth = savingsAccount / 100;
            interestPerMonth = interestPerMonth * i;
            System.out.println("Месяц " + i + " Итого " + interestPerMonth);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int savingsAccount = 0;
        int interestOnDeposit = 7;
        int initialDepositAmount = 15_000;
        int interestPerMonth = 0;
        int i = 0;
        while (interestPerMonth < 12_000_000) {
            i++;
            savingsAccount = initialDepositAmount * interestOnDeposit;
            interestPerMonth = savingsAccount / 100;
            interestPerMonth = interestPerMonth * i;
            interestPerMonth += 1;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + interestPerMonth);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int savingsAccount = 0;
        int interestOnDeposit = 7;
        int initialDepositAmount = 15_000;
        int interestPerMonth = 0;
        int month = 0;
        int year = 12;
        int months = year * 9;
        do {
            month++;
            savingsAccount = initialDepositAmount * interestOnDeposit;
            interestPerMonth = savingsAccount / 100;
            interestPerMonth = interestPerMonth * month;

            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + interestPerMonth);
            }
        } while (month <= months);
    }




}
