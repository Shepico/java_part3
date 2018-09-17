package lesson1.taskFruit;

public class Box <T extends Fruit> {
    private T fruit;

    private double quantity; //количество

    Box () {
    }

    double getWeight() {
        return (fruit.getWeight() * quantity);
    }

    boolean compareBox () {
        //true - равны
        //false - не равны
        return false;
    }

    void addFruit() {

    }

    void shiftFriuts(Box boxIncoming) {
        if (this.quantity > 0) {
            boxIncoming.quantity += this.quantity;
            this.quantity = 0;
        }
    }
}
