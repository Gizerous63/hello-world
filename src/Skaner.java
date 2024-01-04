import java.io.InputStream;
import java.util.Scanner;

public class Skaner {
    public Skaner(InputStream in) {

    }

    public static void main(String[] args) {
//        System.out.println("Введите свой вес(кг):"); //для ввода данных для формылы с консоли
//        double weight = new Scanner(System.in).nextDouble(); // new обозначает создание нового объекта, класса
//        System.out.println("Введите свой рост(м):");
//        double height = new Scanner(System.in).nextDouble();
//
//        System.out.println("BMI= " + weight / (height*height));
//
//
//        System.out.println("\t\t*****Добро пожаловать в калькулятор*****");
//        System.out.println("Введите первое число:");
//        int a = new Scanner(System.in).nextInt();
//        System.out.println("Введите второе число");
//        int b = new Scanner(System.in).nextInt();
//        System.out.println("(" + a + "+" + b + ")" + "*" + a + "=" + (a+b)*a);
//
//        //ДОМАШНЕЕ ЗАДАНИЕ
//        System.out.println("Калькулятор дробей");
//        System.out.println("Введите превое дробное число");
//        double c = new Scanner(System.in).nextDouble();
//        System.out.println("Введите второе дробное число");
//        double d = new Scanner(System.in).nextDouble();
//        System.out.println(c + " + " + d + " = " + (c+d)); // числа с плавуюцей точкой double нужно ставить при сложении в скобки

//        Scanner s = new Scanner(System.in);
//        System.out.println("Введите слово");
//        String string = s.nextLine(); // s мы ранее присвоили сканер, Line-читает с клавиатуры одну строчку.
//        // строчка до тех пор пока не нажмем ентер
//        System.out.println("Вы ввели " + string);

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число");
        int x = s.nextInt();
        System.out.println("Вы ввели " + x);
    }


}
