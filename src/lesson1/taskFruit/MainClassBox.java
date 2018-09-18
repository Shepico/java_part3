package lesson1.taskFruit;

public class MainClassBox {

    public static void main (String[] args ){
        Apple apple = new Apple("1");
        Orange orange = new Orange("2");

        Box<Apple> boxApple = new Box<>(apple, 30);
        Box<Orange> boxOrange = new Box<>(orange, 20);

        Box<Apple> boxApple2 = new Box<>(apple, 10);
        System.out.println(boxApple2.getWeight());
        boxApple.shiftFriuts(boxApple2);
        System.out.println(boxApple2.getWeight());

        boxApple.addQuiantity(apple,5);
        System.out.println(boxApple.getWeight());

        System.out.println(boxOrange.compareBox(boxApple));
    }
}
