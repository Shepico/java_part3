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

    void addQuiantity (T ft, int quantity) {
        this.quantity += quantity;
    }

    double getWeight() {
        return (fruit.getWeight() * quantity);
    }

    boolean compareBox (Box bx) {

        //true - равны
        //false - не равны
        return (this.getWeight() == bx.getWeight() ? true : false);
    }

    void shiftFriuts(Box <T> boxIncoming) {
        if (this.quantity > 0) {
            boxIncoming.quantity += this.quantity;
            this.quantity = 0;
        }
    }
}
