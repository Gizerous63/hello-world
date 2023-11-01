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


//        System.out.println("Введите любое число");
//        int i = new Scanner(System.in).nextInt();
//        if (i<10){
//        System.out.println("Очень мало");
//        }
//        else if (i>20){ // ИНАЧЕ ЕСЛИ    else связывает эти условия.
//        Если без него, просто if, то в любом случае будут проверяться все условия
//        System.out.println("Очень много");
//        }
//        else { // ИНАЧЕ, если ни одно из уусловий не выполнено
//        System.out.println("Достаточно");
//        }


//        System.out.println("Введите первое число: ");
//        int a = new Scanner(System.in).nextInt();
//        System.out.println("Введите второе число: ");
//        int b = new Scanner(System.in).nextInt();
//
//        if ((a>5 && b<5) || a<5){ // логическое И &&    логическое ИЛИ ||  Если много словий, то эти выражения ставятся в скобки
//        System.out.println("HW");
//        }
//        if (a<5 && b>5){ // || сработает в TRUE если хоть одно из условий в скобках будет TRUE
//        System.out.println("GW");
//        }


//        int twixPrice = 77; //задаем переменную, как цену продуктам
//        int marsPrice = 78;
//        int snickersPrice = 100;
//        int bonAquaPrice = 50;
//        boolean isCanBuy = false; // что б решить проблему с условиями (связать не связанные условия) вводим переменную-флаг
//        // МОГУ ЛИ Я КУПИТЬ (называют за частую эту переменную с приставкм IS) и задаем ей заранее ложь ибо вконце она
//        // должне сыграть роль того, что мне не хватает денег
//        System.out.println("Введите количество денег: ");
//        int moneyAmount = new Scanner(System.in).nextInt();
//        if (moneyAmount >= twixPrice) {
//            System.out.println("Вы можете купить twix");
//            isCanBuy = true; // это уточнение, если выполняется условие с твиксом
//        }
//        if (moneyAmount >= marsPrice) {   //если  дальнейшие IF поменять на ELSE IF (сделать связаые условия), а в конце указать ELSE не хватает,
//            // то алгоритм выберет превую подходящее условие и остановиться
//            System.out.println("Вы можете купить mars");
//            isCanBuy = true;
//            if (moneyAmount % 6 == 0){ // это вложенное условие     % 3 == 0 означает кратно шести без остатка,
//                // тоесть поделить на 6 и остаток равен 0
//                System.out.println("Вы выграли приз!!!");
//            }
//        }
//        if (moneyAmount >= snickersPrice) {
//            System.out.println("Вы можете купить snickers");
//            isCanBuy = true;
//        }
//        if (moneyAmount >= bonAquaPrice) {
//            System.out.println("Вы можете купить воду"); // без ELSE условие не полное ибо не учтено сумма денег меньше за проплату
//            isCanBuy = true;
//        }
//        if (isCanBuy == false) {
//            System.out.println("Вам не хватает средств");
//        }

        //ДОМАШНЕЕ ЗАДАНИЕ

        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;
// в этом коде мы пошли от веса
//        if (first>second && first>third){
//            greatest = first;
//        }
//        else if (second>first && second>third){
//            greatest = second;
//        }
//        else{
//            greatest = third;
//        }
//
//        if (first<second && first<third){
//            smallest = first;
//        }
//        else if (second<first && second<third){
//            smallest = second;
//        }
//        else{
//            smallest = third;
//        }
//
//        if ((first<second && first>third) || (first>second && first<third)){
//            average = first;
//        }
//        else if ((second<first && second>third) || (second>first && second<third)){
//            average = second;
//        }
//        else{
//            average = third;
//        }

        // в этом коде мы пойдем от номера веса первый, второй, третий
//        if (first>second && first>third){
//            greatest = first;
//        }
//        else if (first<second && first<third){
//            smallest = first;
//        }
//        else{
//            average = first;
//        }
//
//        if (second>first && second>third){
//            greatest = second;
//        }
//        else if (second<first && second<third){
//            smallest = second;
//        }
//        else{
//            average = second;
//        }
//
//        if (third>first && third>second){
//            greatest = third;
//        }
//        else if (third<first && third<second){
//            smallest = third;
//        }
//        else{
//            average = third;
//        }

        // этот код мы сделаем с помощью тернарных операторов
        greatest = first > second && first > third ? first : second > third ? second : third; // Тернарный оператор
        // где пишется первое условие потом ? результат в случае выполнения : результат или
        // условие в случае не выполненя первого условия ? результат второго условия : результат в слусае не выполненя двух условий.
        // Другими словами если выполнено условие первое ? то рез первое число : если нет, то второе условие ? то рез. второе число : если нет то третье число
        smallest = first < second && first < third ? first : second < third ? second : third;
        if ((first>second && first<third) || (first<second && first>third)){
            average = first;
        }
        else if ((second>first && second<third) || (second<first && second>third)){
            average = second;
        }
        else {
            average = third;
        }

        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);

    }
}
