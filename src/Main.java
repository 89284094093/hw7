public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задание 4 блок 1
//Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему.
        System.out.println("задание 4 блок 1");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //  Задание 1 блок 2
        System.out.println(" заданиек1 блок 2");
        for (int year = 1904; year <= 2096; year = year + 4) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ;
            System.out.println(year + "год является высокосным");


            //Задание 2 блок 1
//      С помощью цикла for выведите в консоль все числа от 10 до 1.
            System.out.println("задание 2 блок 1");
            for (int n = 10; n >= 1; n--) {
                System.out.println(n);


                // Задание 1 блок 1
//       С помощью цикла for выведите в консоль все числа от 1 до 10.
                System.out.println("задание 1 блок 1");
                for (int k = 1; k <= 10; k++) {
                    System.out.println(k);


                    // Задание 3 блок 1
//       Выведите в консоль все четные числа от 0 до 17.
                    System.out.println("задание 3 блок 1");
                    for (int m = 0; m < 17; m = m + 2) {
                        System.out.println(m);


                        //Задание 2 блок 2
//     Напишите программу, которая выводит в консоль последовательность цифр:

//             7 14 21 28 35 42 49 56 63 70 77 84 91 98
                        System.out.println("задание 2 блок 2");
                        for (int g = 0; g <= 98; g = g + 7) {
                            System.out.println(g);
                        }

//                                     Задание 3 блок 2
//            Напишите программу, которая выводит в консоль последовательность цифр:
                        //1 2 4 8 16 32 64 128 256 512
                        System.out.println("задание 3 блок 2");
                        int number = 1;
                        System.out.println(number + " ");
                        for (int v = 0; v < 9; v++) {
                            number = number * 2;
                            System.out.println(number + " ");
                        }

//                                        Задание 1 блок 3
//Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей "в банку".
//Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей" .
                        System.out.println("задание 2 блок 3");
                        int money = 29000;
                        int allMoney = 0;
                        for (int b = 1; b <= 12; b++) {
                            allMoney = allMoney + money;
                            System.out.println("Месяц  " + b + ", сумма накоплений равна " + allMoney + "рублей");
                        }
                    }
                }
                //Задание 2 блок 3
//Перепишите решение задачи выше при условии, что деньги вы откладывать будете не "в банку", а в банк под проценты – 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей" .
                System.out.println("задание 2 блок 3");
                int moneyOFPercent=0;
                int money1=29000;
                 int percentOFMonth=1;
                 for (int b=1;b<=12;b++) {
                     moneyOFPercent=moneyOFPercent+(money1*percentOFMonth)/100;
                     System.out.println("месяц " + b +"сумма накоплений " + moneyOFPercent + "рублей");
                 }
            }
        }
    }
}