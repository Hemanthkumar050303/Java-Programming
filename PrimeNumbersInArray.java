public class PrimeNumbersInArray {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int primeCount = 0;
        
        System.out.println("Prime numbers in the array:");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                primeCount++;
            }
        }
        
        System.out.println("\nTotal prime numbers: " + primeCount);
    }
    
    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
