package arraysProject;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    int[] myIntArray = new int[10];
    myIntArray[0] = 45;
    myIntArray[1] = 1;
    myIntArray[5] = 50;

    // System.out.println(Arrays.toString(myIntArray));

    double[] myDoubleArray = new double[10];
    myDoubleArray[2] = 3.5;
    // System.out.println(myDoubleArray[2]);

    int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // System.out.println("first = " + firstTen[0]);
    int arrayLength = firstTen.length;
    // System.out.println("length of array = " + arrayLength);
    // System.out.println("last = " + firstTen[arrayLength - 1]);

    int[] newArray;
    // newArray = new int[] { 5, 4, 3, 2, 1 };
    // System.out.println(Arrays.toString(newArray));
    newArray = new int[5]; // Default values 0's
    // System.out.println(Arrays.toString(newArray));

    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = newArray.length - i;
    }

    for (int i = 0; i < newArray.length; i++) {
      System.out.println(newArray[i] + " ");
    }

    System.out.println();

    // Enhanced for loop
    for (int element : newArray) {
      System.out.println(element + " ");
    }

    System.out.println();
    System.out.println(Arrays.toString(newArray));
    Object objectVarialbe = newArray;
    if (objectVarialbe instanceof int[]) {
      System.out.println("objectVariable is really an int array");
    }

    // Everything is passing object classes and types more...
    Object[] objectArray = new Object[3];
    objectArray[0] = "Hello";
    objectArray[1] = new StringBuilder("World");
    objectArray[2] = newArray;

    System.out.println(Arrays.toString(objectArray));












  }
  
}
