public class MnogomerMasiv {
    public static void main(String[] args){
//        int[] [] matrice = {{1,4,5}, // первая []-индекс строки, вторая []-индекс столбика
//                             {2,8,6}, // можно в столбик, можно в одну строку
//                             {4,8,5}}; // это двумерный массив
//        System.out.println(matrice[1][2]); // получится число 6
//        System.out.println(matrice[0] [1]);// получится число 4
//
//        String[] [] strings = new String[2][3]; // создали двумергый массив с 2 строками и 3 столбцами
//        strings [1] [2] = "Привет";
//        System.out.println( strings [1] [2]);

        //ВЫВЕДЕМ ДВУХМЕРНЫЙ МАССИВ НА ЭКРАН
        int[] [] matrica = {{1,4,5},
                            {2,8,6},
                            {4,8,5}};
        for (int i = 0; i<matrica.length; i++){ // это цикл задает строку
            for (int j = 0; j<matrica[i].length; j++){ // выберает значения внутры определенной строки
                System.out.print(matrica[i][j] + " ");//print без ln, чтоб во внутреннем цыкле выводить в одной строке
            }
            System.out.println();// что б после первого прохода внутреннего цикла был перемещение на новую строку
        }
    }
}
