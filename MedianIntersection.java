public class MedianIntersection {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        int medianIndex = findMedianIntersection(array1, array2);
        
        if (medianIndex != -1) {
            System.out.println("Median intersection index: " + medianIndex);
            System.out.println("Median intersection value: " + array1[medianIndex]);
        } else {
            System.out.println("No intersection found.");
        }
    }
    
    public static int findMedianIntersection(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    return i; 
                }
            }
        }
        return -1; // No intersection found
    }
}
