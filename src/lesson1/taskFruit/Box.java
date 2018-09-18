package lesson1.taskFruit;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private T fruit;
    //private ArrayList<T> fruits;
    private double quantity; //количество

    Box (T fruit, int quantity) {
        this.fruit = fruit;
        this.quantity = quantity;
    }

    void addQuiantity (Fruit<?> fruit, int quantity) {
        /*if (fruit instanceof T) {
            this.quantity += quantity;
        }else {
            System.out.println("В данной коробке другие фрукты");
        }*/

    }

    double getWeight() {
        return (fruit.getWeight() * quantity);
    }

    double getQuantity() {
        return this.quantity;
    }

    boolean compareBox () {
        //true - равны
        //false - не равны
        return false;
    }

    void shiftFriuts(Box boxIncoming) {
        if (this.quantity > 0) {
            boxIncoming.quantity += this.quantity;
            this.quantity = 0;
            this.fruit = null;
        }
    }
}
