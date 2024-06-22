import java.util.Arrays;

public class EqualizeArraysLength {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30};
        
        System.out.println("Original arrays:");
        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));
        if (array1.length != array2.length) {
            int minLength = Math.min(array1.length, array2.length);
            array1 = Arrays.copyOf(array1, minLength);
            array2 = Arrays.copyOf(array2, minLength);
            
            System.out.println("\nArrays after adjusting to equal length:");
            System.out.println("Array1: " + Arrays.toString(array1));
            System.out.println("Array2: " + Arrays.toString(array2));
        } else {
            System.out.println("\nArrays are already of equal length.");
        }
    }
}
