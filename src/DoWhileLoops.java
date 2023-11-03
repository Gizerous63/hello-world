import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
//        boolean isContinue = false;
//        do {  // условие выполнится первый раз в любом случае. Даже если boolean isContinue = false,
//            // а в условии цикла while isContinue по умолчанию true.
//            System.out.println("HELLO!!!!");
//        }
//        while (isContinue);

//        System.out.println("Введи число 5");
//        int value = new Scanner(System.in).nextInt();
//        while (value!=5){ // != означает неравно
//            System.out.println("Введи число 5");
//            value = new Scanner(System.in).nextInt();
//        }
//        System.out.println("Вы ввели число 5");// ТАКОЙ ВАРИАНТ ГРАМОЗДКИЙ, ПОЭТОМУ ДЕЛАЕМ ЧЕРЕЗ DO

        int value;
        do {
            System.out.println("Введи число 5");
            value = new Scanner(System.in).nextInt();
        }
        while (value!=5);
        System.out.println("Вы ввели число 5");



    }
}
