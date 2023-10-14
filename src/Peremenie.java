public class Peremenie {
    public static void main(String[] args) {
        int myInt = 30; // переменная целое число 32 битное число
        short myShort = 15; // 16 битное число от -32768 до 32767
        long myLong = 345647; // 64 битное число

        double myDouble = 324.55; // вещественные числа, дроби 64 бита всегда дабл поумолчанию для дробей
        float myFloat = 345.45f; // 2 битное число. вконце нужно f чтоб знала что float

        char myChar = 'r'; //в однарных кавычках пишется символ

        boolean myBoolean = true; // логический тип данных может принимать true или false

        byte myByte = 15;// 8 битное число от -128 до 127
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(36/5); // можно производить математические действия выводится результат но только число перед точкой
        System.out.println(36.0/5); // если сделать с дробью то результат тоже с дробью коректный результат
        System.out.println("18" + 1); //если число в "" то это число как строка и будет 181, но нельзя -*/

        System.out.println("\t\tПривет конвектор с байт в Гб");
        System.out.println("В " + myShort  + "gb: " +  (myShort * 1024) + " byte\n"); // пример маленькой формулы

        // индекс массы тела масса / на рост2       ЭТО ПРИМЕР ПОЯСНЕНИЯ

        double weight = 75;
        double height = 1.82;
        System.out.println("\t\t***Добро пожаловать в индекс BMI***");
        System.out.println("BMI: " + weight / (height*height)); // нужно с точкой и нулем иначе не делится

        // Домашнее задание
        // F=C*1.8+32
        System.out.println("\n\t\t***Добро пожаловать в конвектор температуры***");
        System.out.println("В " + 20 + "C: " + (20 * 1.8 + 32) + "F");

        System.out.println("\n\t\t***Добро пожаловать в конвектор валют***");
        System.out.println(myInt + "$ " + "= " + myInt * 40 + "грн");
    }
}
