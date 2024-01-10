public class Phone {
    static String production;

    String model;
    String number;
    int weight;


    public Phone() {
            }
    public Phone(String model, String number, int weight) {
        this.model = model;
        this.number = number;

        this.weight = weight; // это можно сгенероровать автоматически нажав правой мышью на свободное поле
    }

    public void call (){
        System.out.println("Позвонил абонент с телефона " + model + " Производства "+ production + ", вес которого " + weight + "г," + "по номеру: " + number);
    }


    public void recieveCall (String name){
        recieveCall (name, ""); // этот и следующий мотоды схожи,
        // поэтому в этом мнтоде с меньшими параметрами используэм метод с большими параметрами
    }

    public void recieveCall (String name, String number){
        System.out.println("Позвонил абонент по имени" + name + (number == "" ? "" :" по номеру: " + number));
    }

    static void production (String production){
        Phone.production = production;
    }


}
