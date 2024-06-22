public class GreatestUsingNestedIf {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        int num3 = 20;
        
        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println("num1 (" + num1 + ") is the greatest.");
            } else {
                System.out.println("num3 (" + num3 + ") is the greatest.");
            }
        } else {
            if (num2 >= num3) {
                System.out.println("num2 (" + num2 + ") is the greatest.");
            } else {
                System.out.println("num3 (" + num3 + ") is the greatest.");
            }
        }
    }
}
