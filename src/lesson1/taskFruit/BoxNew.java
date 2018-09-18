package lesson1.taskFruit;

import java.util.ArrayList;

public class BoxNew <T extends Fruit>{
    ArrayList<T> fruits;

    BoxNew(){
        fruits = new ArrayList<>();
    }

    double getWeight(){
        if (fruits.size()>0){
            return(fruits.get(0).getWeight() * fruits.size());
        }
        return 0;
    }

    boolean compareBox (Box bx) {

        //true - равны
        //false - не равны
        return (this.getWeight() == bx.getWeight() ? true : false);
    }
}


