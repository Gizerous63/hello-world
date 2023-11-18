public class Foreach {
    public static void main(String[] args){
        String [] strings = new String[5];
        strings [0] = "Hello";
        strings [1] = "Buy";
        strings [2] = "Java";
        for (String s:strings){ // String - тип переменнлой, s - переменная, которая с каждым прохождения принимает
            // значения элементов массива по очереди; strings - имя массива, к которому ссылаться
            System.out.println(s);
        }
        int[] numbers = {1,2,3};// таким образом мы уже прописали значения каждого элеиента массива
        int sum = 0;
        for (int x: numbers){
            sum = sum + x; // сумма всех элементов массива

        }
        System.out.println(sum);
        System.out.println(sum / numbers.length); // среднее значение




    }
}
