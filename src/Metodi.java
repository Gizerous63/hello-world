import java.sql.SQLOutput;
import java.util.Scanner;
import static java.lang.System.*;
public class Metodi {
        static double a = 0;
        static double b = 0;

        public static void main(String[] args) {
            //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
            a = inputDouble();
            b = inputDouble();
            sum();      //Метод суммирования чисел
            multiply(); //Метод умножения чисел
            diff();     //Метод вычитания чисел
            divide();   //Метод деления чисел
        }
        private static void divide() {
            System.out.println ("Часное " + a + "/" + b + "=" + (a/b));
        }
        private static void diff() {
            System.out.println ("Разница " + a + "-" + b + "=" + (a-b));
        }
        private static void multiply() {
            System.out.println ("Произведение " + a + "*" + b + "=" + (a*b));
        }
        private static void sum() {
            System.out.println ("Сумма " + a + "+" + b + "=" + (a+b));
        }
        private static double inputDouble() {
            System.out.println ("Введите число: ");
            return new Scanner(System.in).nextDouble();
//            double input = new Scanner(System.in).nextDouble();  эту запись можно сократить как сверху
//            return input;
        }
}
