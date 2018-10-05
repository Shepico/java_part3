package lesson6;

public class MainClass {
    final static int findNumber = 4;
    final static int findNumberOne = 1;
    static int indexFind = 0;


    public static void main (String[] args) {
        Integer[] intArr = {1,2,3,4,5,6,7,8,9};
        Integer[] childArray = rebuildArray(intArr);
        for (int i=0; i<childArray.length; i++) {
            System.out.print(childArray[i]+",");
        }
        System.out.println();

        int[] intArr2 = {1,1,4,1,1,4};
        System.out.println(checkArray(intArr2));


    }

    public static Integer[] rebuildArray(Integer[] parentArray) {

        Integer[] childArray;

        for (int i=0; i<parentArray.length; i++) {
            if (parentArray[i] == findNumber) {
                indexFind = i + 1;
            }
        }

        if (indexFind == 0) {
            throw new RuntimeException();
        }else {
            childArray = new Integer[parentArray.length - indexFind];
            for (int i=indexFind, j=0; i<parentArray.length; i++, j++) {
                childArray[j] = parentArray[i];
            }
        }

        return childArray;
    }
//11441 тру
//11451 не тру
//111 не тру
//4444144 тру
    public static  boolean checkArray(int[] arr){
        boolean findOne = false;
        boolean findTwo = false;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] != findNumber && arr[i] != findNumberOne) {
                return false;
            }
            if (arr[i] == findNumber) {
                findOne = true;
            }else if(arr[i] == findNumberOne) {
                findTwo = true;
            }
        }
        if (findOne && findTwo) {
            return true;
        }
        return false;
    }
}
