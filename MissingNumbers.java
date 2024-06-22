public class MissingNumbers {
    public static void main(String[] args) {
        int[] series = {1, 5, 11, 19};
        
        System.out.println("Missing numbers:");
        for (int i = 1; i < series.length; i++) {
            int expected = series[i-1] + 4; // Difference between consecutive numbers
            while (expected < series[i]) {
                System.out.print(expected + " ");
                expected += 4;
            }
        }
    }
}
