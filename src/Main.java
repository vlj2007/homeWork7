public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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

    }
}