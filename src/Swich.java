import java.util.Scanner;

public class Swich {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите возраст");
//        int age = scanner.nextInt();
//        switch (age){ // этот оператор используеться на замену IF ELSE. Роботает по томуже принципу
//            case 0 :
//                System.out.println("Вы родились");
//                break; // в конце каждого условия втавится  break для завершения цикла этого условия
//            case 7 :
//                System.out.println("Вы пошли  школу");
//                break;
//            case 18 :
//                System.out.println("Вы пошли в институт");
//                break;
//            default: // натподобии ELSE, что б показать действия, если ниодно условие не выполняется
//                System.out.println("Ничего не подошло");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        String age = scanner.nextLine(); // что б вводить не числа, а словами int меняем на String (стори)
        switch (age){ // этот оператор используеться на замену IF ELSE. Роботает по томуже принципу
            case "ноль" :
                System.out.println("Вы родились");
                break; // в конце каждого условия втавится  break для завершения цикла этого условия
            case "семь" :
                System.out.println("Вы пошли  школу");
                break;
            case "восемнадцать" :
                System.out.println("Вы пошли в институт");
                break;
            default: // натподобии ELSE, что б показать действия, если ниодно условие не выполняется
                System.out.println("Ничего не подошло");
        }

    }
}
