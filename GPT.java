public class GenericMethodExample {

    // Generic method to find the maximum element in an array
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0)
            return null;

        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {3, 7, 1, 9, 4};
        System.out.println("Maximum Integer: " + findMax(intArray));

        Double[] doubleArray = {3.4, 1.2, 5.6, 2.1};
        System.out.println("Maximum Double: " + findMax(doubleArray));

        String[] stringArray = {"apple", "banana", "orange"};
        System.out.println("Maximum String: " + findMax(stringArray));
    }
}
