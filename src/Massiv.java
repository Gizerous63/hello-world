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
//        int[] people = new int[5]; // допустим для пяти человек
//        for (int i = 0; i < people.length; i++){
//            people[i] = new Random().nextInt(100); // генерируем случайный возраст до 100 лет
//        }
//        int summ = 0; // задали переменную суммы всех возрастов
//        for (int i = 0; i < people.length; i++){
//            summ += people[i]; // по простому это summ = summ + people[i] мы считаем общую сумму возрастов
//        }
//        System.out.println("Средний возраст: " + summ / people.length);


        //ДОМАШНЕЕ ЗАДАНИЕ
        // 1. Создать массив из 10 целых чисел. Значения могут быть любыми и распечатать с 0 до последнего
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i+1;
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        System.out.println("================================================");

        // Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        for (int i = numbers.length - 1; i >= 0; i--){
            numbers[i] = i+1;
        }
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }

        //** Задание особой сложности. Развернуть массив(см конец урока).
        System.out.println("================================================");








    }


}




