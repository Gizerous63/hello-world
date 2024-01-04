import javax.swing.*;
import java.util.Scanner;

public class MetodiDva {
    static int number = 0;
        public static void main(String[] args) {

            output();

//            while (true){
//
//                if (number % 2 == 0){
//                    System.out.println("TRUE");
//                }
//                else {
//                    System.out.println("FALSE");
//                }
//            }
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами

    }

    private static int inputNumber() {
        System.out.println("Введите целое число:");
        return new Scanner(System.in).nextInt();
    }
    private static void output() {

//        while (true) {
//            if (inputNumber() % 2 == 0) {
//                System.out.println("TRUE");
//            } else {
//                System.out.println("FALSE");
//            }
//            System.out.println(inputNumber() % 2 == 0 ? true : false); можно через тернарник
            System.out.println(inputNumber() % 2 == 0);// верхнюю запись проще можно так записать, но небудет повторятся цикл



    }
}
