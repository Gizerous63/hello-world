public class BrekContin {
    public static void main(String[] args) {
        int a = 0;
        while (true){
            System.out.println(a);
            a++;
            if (a==10){
                break; // этот оператор прерывает цикл
            }
        }
        System.out.println("Вы вышли из цикла");

        for (int i = 0; i <= 15; i++){
            if (i%2==0){
                continue; // оператор для пропуска цикла в случае выполнения условия if
            }
            System.out.println("Нечетные числа" + i);
        }

    }
}
