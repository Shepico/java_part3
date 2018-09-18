package lesson1;

import java.util.ArrayList;
import java.util.List;

 class ArrayElement <T> {
    private T[] obj;
    private ArrayList<T> al;

    ArrayElement(T[] obj) {
        this.obj = obj;


    }

    void changeElement(int indexOne, int indexTwo){
        T elem = this.obj[indexOne];
        this.obj[indexOne] = this.obj[indexTwo];
        this.obj[indexTwo] = elem;
    }

    void print(int elem) {
        System.out.println(obj[elem]);
    }

    void printList(int elem) {
        System.out.println(al.get(elem));
    }

    void transformAL (){
        al = new ArrayList<>();
        for (int i=0; i<obj.length; i++) {
            al.add(obj[i]);
        }
    }


}


