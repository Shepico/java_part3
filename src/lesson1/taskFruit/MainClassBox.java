package lesson1.taskFruit;

public class MainClassBox {

    public static void main (String[] args ){
        Apple apple = new Apple("1");
        Orange orange = new Orange("2");

        Box<Apple> boxApple = new Box<>(apple, 20);
       // boxApple.addQuiantity(5);
        System.out.println(boxApple.getQuantity());
    }
}
