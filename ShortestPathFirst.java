public class ShortestPathFirst {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        int iterations1 = array1.length;
        int iterations2 = array2.length;
        
        if (iterations1 < iterations2) {
            System.out.println("First array executes fewer iterations: " + iterations1);
        } else {
            System.out.println("Second array executes fewer iterations: " + iterations2);
        }
    }
}
