import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        boolean isContinue = false;
        do {  // условие выполнится первый раз в любом случае. Даже если boolean isContinue = false,
            // а в условии цикла while isContinue по умолчанию true.
            System.out.println("HELLO!!!!");
        }
        while (isContinue);
    }
}
