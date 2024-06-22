public class GreatestOfThree {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        int num3 = 20;

        // Using nested ternary operators to find the maximum
        int greatest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        System.out.println("The greatest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + greatest);
    }
}
