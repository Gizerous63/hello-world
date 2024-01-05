import java.util.Scanner;

public class Metod3 {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            int priseBook = inputBookPrise();

            addBook(name, pageCount, priseBook);

            //todo использовать новый метод тут
            printInfo();
        }
    }

    private static int inputBookPrise() {
        System.out.println("Введите цену книги:");
        return new Scanner(System.in).nextInt();
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0, 0);
    }

    public static void addBook(String bookName, int pageCount, int priseBook) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : "N/A") + " стр.," + "Цена - " + (priseBook > 0 ? priseBook + " грн.": "Не оценена") + "\n";
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }
}
