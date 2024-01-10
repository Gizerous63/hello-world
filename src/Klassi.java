public class Klassi {
    public static void main(String[] args) {
        Phone.production = "Japan";
        Phone nokia = new Phone ("Nokia", "0939937445", 500);

        nokia.call();
        nokia.recieveCall(" Вася");

        Phone motorolla = new Phone ("Motorolla", "06777880597", 420);

        motorolla.call();
        motorolla.recieveCall(" Петя");



    }
}
