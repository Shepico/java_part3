package lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StartClass {

    public static void main (String[] args) {
        Integer[] arrInt = {1,2,3,4,5};
        String[] arrStr = {"one", "two", "three"};
        ArrayElement<Integer> arr = new ArrayElement<Integer>(arrInt);
        ArrayElement<String> arr2 = new ArrayElement<String>(arrStr);

        arr.changeElement(2,3);
        arr.print(2);

        arr2.changeElement(0,1);
        arr2.print(1);

        arr2.transformAL();
        arr2.printList(0);



    }

}
