import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
//        if (5==2){ //оператор цикл ЕСЛИ
//            System.out.println("Верно");
//        }
//        else{ // В ПРОТИВНОМ СЛУЧАЕ (ИНАЧЕ)
//            System.out.println("Неверно");
//        }

//        int i = 3;
//        if (i<10){
//            System.out.println("Очень мало");
//        }
//        else if (i>20){ // ИНАЧЕ ЕСЛИ
//            System.out.println("Очень много");
//        }
//        else { // ИНАЧЕ, если ни одно из уусловий не выполнено
//            System.out.println("Достаочно");
//        }


        System.out.println("Введите любое число");
        int i = new Scanner(System.in).nextInt();
        if (i<10){
            System.out.println("Очень мало");
        }
        else if (i>20){ // ИНАЧЕ ЕСЛИ
            System.out.println("Очень много");
        }
        else { // ИНАЧЕ, если ни одно из уусловий не выполнено
            System.out.println("Достаточно");
        }

    }


}
