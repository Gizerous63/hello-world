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
        for (int i = numbers.length - 1; i >= 0; i--){ //numbers.length - 1 потому что массив нач с 0
            // и в массиве с 10 индексов крайняя цифра 9 (10-1)
            numbers[i] = i+1;
        }
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }

        //** Задание особой сложности. Развернуть массив(см конец урока).
        System.out.println("================================================");

        for (int i = 0; i < numbers.length / 2; i++){ // делим по полам, тоесть проходим в цикле полдлины цикла,
            // ибо поройдя полмассива мы поменяем все местами, а пройдя вторую половину, опыть все поменяется
            int temp = numbers[i]; // тут мы создаем временную переменную
            // temp и запомнить в ней первое значение массива
            numbers[i] = numbers[numbers.length - (1 + i)];// первому значению массва присвоено последнее значение массива.
            // -1 по той же, что массиве с 10 индексов крайняя цифра 9 (10-1)
            numbers[numbers.length - (1 + i)] = temp; // теперь нужно последнему значению массива нужно присвоить старое
            // значение первого массива, но оно уже стерто предыдущей записью, поэтому создаем временную переменную temp/
            // 1 + i для подсчета индекса. А именно “число 0 ин масс = длинна 10 - (1-0), тоесть число 9 индекса”
            //“число 1 ин масс = длинна 10 - (1-1), тоесть число 8 индекса” и т.д.
        }
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // Сгенерировать случайный вес 10 человек от 40 до 100 кг
//        double[] weights = new double[10]; // допустим для пяти человек
//        for (int i = 0; i < weights.length; i++){
//           weights[i] = (new Random().nextDouble() * 60) + 40; // так как new Random().nextDouble() выдает от 0 до 1,
//            // а нам нужно сгенерировать от 40 до 100, то 100 разбиваем на 60 и 40
//        }
//        for (int i = 0; i < weights.length; i++){
//            System.out.println(weights[i]);
//        }
//        double middleWeight = 0;
//        for (int i = 0; i < weights.length; i++){
//            middleWeight += weights[i];
//        }
//        System.out.println("Средний вес: " + middleWeight / weights.length);
//
//
//        int peopleCount = 0;
//        for (int i = 0; i < weights.length; i++){
//            if (weights[i] >= 60 && weights[i] <= 80){
//                peopleCount++; // то тогда количество людей увеличивается
//            }
//        }
//        System.out.println("Количество людей с весом от 60 до 80 кг:" + peopleCount);

        //МОЖНО СОКРАТИТЬ ЗАКИНУВ ВСЕ В ОДИН ЦИКЛ
        double[] weights = new double[10]; // допустим для десяти человек
        double middleWeight = 0; // средний вес
        int peopleCount = 0; // число людей с весом
        for (int i = 0; i < weights.length; i++){
            weights[i] = (new Random().nextDouble() * 60) + 40;
            middleWeight += weights[i];
            if (weights[i] >= 60 && weights[i] <= 80){
                peopleCount++;
            }
            System.out.println(weights[i]);
        }
        System.out.println("Средний вес: " + middleWeight / weights.length);
        System.out.println("Количество людей с весом от 60 до 80 кг:" + peopleCount);













    }


}




