public class ForLoops {
    public static void main(String[] args){
        for (int i = 0;i<=10;i++){ // это цикл, три блока. в первом инициализируется переменная
            // и задается стартовая позиция, во втором блок условия (до каких пор будет выполняться цикл),
            // в третьем бдок изменения переменной (i++ можно записать как i = i+1)
            System.out.println("Hello" + i);
        }



        for (int i = 15;i>=0;i = i - 3){
            System.out.println("Hello" + i);
        }
    }
}
