import java.util.*;


public class Arrays2 {
    public static void main(String[] args) {
// Q5 example         
// Anonymous array of integers
System.out.println(" Anonymous array Example");
int[] numbers = new int[]{1, 2, 3, 4, 5}; // Anonymous array
Arrays.stream(numbers).forEach(System.out::println ); 
System.out.println("Example 2");
for (int e : new int[]{10, 11, 12, 13}) { // Anonymous array in a loop
    System.out.print(e +" ");
}
System.out.println();
// Q6 example 
    int [] arr = {1,3,3,4,6,4,6,7,1,9};
//Methode -1

        // For loop or while loop: The traditional for loop is commonly used to traverse arrays in Java.
        //  It allows you to specify the starting index, ending index, and step size for traversing the array

System.out.println("for loop methode ");
for (int i =0 ; i<arr.length;i++){
    System.out.print(arr[i] + " ");
}
System.out.println();
System.out.println("while loop methode");
int i =0;
while(i<arr.length){
System.out.print(arr[i]+" ");
i++;
}
System.out.println();
// Enhanced for loop (for-each loop): The enhanced for loop is a simplified way to traverse arrays in Java, introduced in Java 5.
// It automatically iterates over each element in the array without the need for an index variable. Here's an example:
System.out.println("Enhanced for loop methode");
for (int element :arr ){
    System.out.print(element + " ");
}
System.out.println();
// Q7 Example 

System.out.println("example of length (property of array)");
int[] num = {1, 2, 3, 4, 5};
int size = num.length;
System.out.println("Size of array: " + size);
System.out.println("exmple of length()");
String str = "Java DSA Cource";
int length = str.length();
System.out.println("Length of string: " + length);

// Output->

// PS D:\Java code\code> cd "d:\Java code\code\" ; if ($?) { javac Arrays2.java } ; if ($?) { java Arrays2 }
//  Anonymous array Example
// 1
// 2
// 3
// 4
// 5
// Example 2
// 10 11 12 13 
// for loop methode
// 1 3 3 4 6 4 6 7 1 9
// while loop methode
// 1 3 3 4 6 4 6 7 1 9
// Enhanced for loop methode
// 1 3 3 4 6 4 6 7 1 9
// example of length (property of array)
// Size of array: 5
// exmple of length()
// Length of string: 15

    }

}
