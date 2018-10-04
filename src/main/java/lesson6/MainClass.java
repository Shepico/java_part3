package lesson6;

public class MainClass {
    final static int findNumber = 4;
    static int indexFind = 0;

    public static void main (String[] args) {
        int[] intArr = {1,2,3,4,5,6,7,8,4,9};
        int[] childArray = rebuildArray(intArr);
        for (int i=0; i<childArray.length; i++) {
            System.out.println(childArray[i]);
        }

    }

    public static int[] rebuildArray(int[] parentArray) {

        int[] childArray;

        for (int i=0; i<parentArray.length; i++) {
            if (parentArray[i] == findNumber) {
                indexFind = i + 1;
            }
        }

        if (indexFind == 0) {
            throw new RuntimeException();
        }else {
            childArray = new int[parentArray.length - indexFind];
            for (int i=indexFind, j=0; i<parentArray.length; i++, j++) {
                childArray[j] = parentArray[i];
            }
        }


        return childArray;
    }
}
