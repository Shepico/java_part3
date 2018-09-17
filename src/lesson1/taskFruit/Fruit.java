package lesson1.taskFruit;

public class Fruit {
    private String sort;
    private double weight;

    Fruit (String sort, int weight){
        this.sort = sort;
        this.weight = weight;
    }

    double getWeight() {
        return this.weight;
    }
}
