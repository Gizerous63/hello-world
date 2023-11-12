import java.util.Random;

public class Massiv {
    public static void main(String[] args){
//        int[] array = new int[10];
//        for (int i = 0; i< array.length; i++){ //i< array.length означает до длины массива, это счетчик для индексов
//            array[i] = i+10; // указываем числа для каждого индекса
//        }
//        for (int i = 0; i< array.length; i++){
//            System.out.println(array[i]);
//        }
// ПРИМЕР для банка подсчитать средний возраст кредиторов
        int[] people = new int[5]; // допустим для пяти человек
        for (int i = 0; i < people.length; i++){
            people[i] = new Random().nextInt(100); // генерируем случайный возраст до 100 лет
        }
        int summ = 0; // задали переменную суммы всех возрастов
        for (int i = 0; i < people.length; i++){
            summ += people[i]; // по простому это summ = summ + people[i] мы считаем общую сумму возрастов
        }
        System.out.println("Средний возраст: " + summ / people.length);


    }


}




