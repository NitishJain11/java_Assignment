import java.util.*;

public class BasicArrays {

    public static void main(String[] args) {
//Q5 -> Example
        // Declare and allocate memory for an integer array
        int[] myIntArray = new int[5];

        // Declare and allocate memory for a boolean array
        boolean[] myBooleanArray = new boolean[3];

        // Declare and allocate memory for an object array
        String[] myStringArray = new String[4];

        // Array elements are initialized to default values
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(myBooleanArray));
        System.out.println(Arrays.toString(myStringArray));
// Q6-> Example
        System.out.println("Example of 1D arrays");
        // 1D array
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
// Q6 -> Example 
        System.out.println("example of 2D arrays");
        // 2-D array
        int rows = 3;
        int column = 3;
        int[][] arr2 = new int[rows][column];
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[1][0] = 4;
        arr2[1][1] = 5;
        arr2[1][2] = 6;
        arr2[2][0] = 7;
        arr2[2][1] = 8;
        arr2[2][2] = 9;
        for (int[] i : arr2) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
