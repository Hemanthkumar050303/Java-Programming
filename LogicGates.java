public class LogicGates {
    public static void main(String[] args) {
        boolean input1 = true;
        boolean input2 = false;
        
        // OR gate
        boolean resultOR = input1 || input2;
        System.out.println("OR gate: " + resultOR);
        
        // AND gate
        boolean resultAND = input1 && input2;
        System.out.println("AND gate: " + resultAND);
    }
}
