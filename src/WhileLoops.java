import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
//        boolean t = 5 < 10;
//        System.out.println(t);
//        boolean f = 11 < 10;
//        System.out.println(f);
//        boolean a = 5 <= 5; // может быть двоное равенство
//        System.out.println(a);
//        boolean b = 5 == 5; // ставится двоное равенство потомучто просто равество уже делает присвоение
//        System.out.println(b);



//        int value = 3;
//        while (value<5){ // это условие цикла, тоесть до тех пок пока.....
//            System.out.println("Hello");
//            value = value+1; // для цикла задаем условия переменной, что с каждым циклом она на один больше
//
//
//        }
//
//        System.out.println("*****Добро пожаловать в сравнитель");
//        System.out.println("Ведите превое число a");
//        int a = new Scanner(System.in).nextInt();
//        System.out.println("Ведите второе число b");
//        int b = new Scanner(System.in).nextInt();
//        boolean t = a<b;
//        System.out.println(t);

//        System.out.println("******Добро пожаловать в цикл******");
//        System.out.println("Введите превое число a");
//        int a = new Scanner(System.in).nextInt();
//        System.out.println("Введите превое число b");
//        int b = new Scanner(System.in).nextInt();
//        while (a<=b){
//            System.out.println("Hello");
//            a = a+1;
//        }
//        boolean isContinue = true;// создадим пременную, которую будем менять
//        while (isContinue){ // можно было написать isContinue == true, но в скобочках цикла или условия уже по умолчанию true
//            System.out.println("HELLO!!!!");
//            System.out.println("Ведите: продолжить: 1/отменить:0 ");
//            int input = new Scanner(System.in).nextInt();
//            if (input == 0){
//                isContinue = false; // при этом цикл закончится, так как не отвечает условию while
//            }

//            boolean isContinue = true;
//            int x = 0; // задаем первоначальные переменные для координат робота
//            int y = 0;
//            while (isContinue) {
//                System.out.println("Выберите куда передвинуть робота:\n1 - вперед\n2 - назад\n3 - вправо\n4 - влево");
//                int input = new Scanner(System.in).nextInt();
//                if (input == 1) {
//                    y++; // равносильно как и у=у+1
//                }
//                else if (input == 2) {
//                    y--; //равносильно как и у=у-1
//                }
//                else if (input == 3) {
//                    x++;
//                }
//                else if (input == 4) {
//                    x--;
//                }
//                else {
//                    System.out.println("Error!!!!");
//                    isContinue = false; // так закрываем цикл так как не отвечает условию while
//                }
//
//                System.out.println("Координаты робота: по вертикали: " + y + "; по горизонтали: " + x);
//            }

        //ДОМАШНЕЕ ЗАДАНИЕ


        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        boolean isContinue = true;
        while(isContinue) {
            System.out.println("Бросьте в котелок Жабьи глаза :");
            int eyes = new Scanner(System.in).nextInt();
            System.out.println("Бросьте в котелок Слезы вурдолака:");
            int tears = new Scanner(System.in).nextInt();
            System.out.println("Бросьте в котелок Кости ворона:");
            int bones = new Scanner(System.in).nextInt();
            System.out.println("Босьте в котелок Пельмени: ");
            int lings = new Scanner(System.in).nextInt();
            if (eyes == 3 && bones == 1 ){
                System.out.println("Вы получили эликсир ЗОРКОСТИ!!!!");
            }
            else if (bones == 2 && lings == 4){
                System.out.println("Вы получили эликсир СТОЙКОСТИ!!!!");
            }
            else if (tears == 7 && lings == 1 && eyes == 2){
                System.out.println("Вы получили эликсир СКРЫТНОСТИ!!!!");
            }
            else if (tears == 5 && lings == 10 && eyes == 4){
                System.out.println("Вы получили ЗАПРЕТНЫЙ ЭЛЕКСИР!!!!");
            }
            else{
                System.out.println("Не хватает ингридиентов согласно рецептов");
                isContinue = false;
            }
        }

        //todo реализовать ввод пользователем кол-ва ингредиентов.

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
    }
}
