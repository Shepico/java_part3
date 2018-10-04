package lesson1.taskFruit;

public class Fruit<T> {
    private String sort;
    private double weight;

    Fruit (String sort, double weight){
        this.sort = sort;
        this.weight = weight;
    }

    double getWeight() {
        return this.weight;
    }
}
