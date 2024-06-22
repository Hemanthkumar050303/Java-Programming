public class DataTypeConversionDemo {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println("Implicit Conversion (Widening):");
        System.out.println("byte to short: " + shortValue);
        System.out.println("short to int: " + intValue);
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);
        double largeDoubleValue = 100.04;
        float largeFloatValue = (float) largeDoubleValue; 
        long largeLongValue = (long) largeFloatValue;    
        int largeIntValue = (int) largeLongValue;       
        short largeShortValue = (short) largeIntValue;    
        byte largeByteValue = (byte) largeShortValue;

        System.out.println("\nExplicit Conversion (Narrowing):");
        System.out.println("double to float: " + largeFloatValue);
        System.out.println("float to long: " + largeLongValue);
        System.out.println("long to int: " + largeIntValue);
        System.out.println("int to short: " + largeShortValue);
        System.out.println("short to byte: " + largeByteValue);
        int overflowIntValue = 128;
        byte overflowByteValue = (byte) overflowIntValue; 

        int underflowIntValue = -129;
        byte underflowByteValue = (byte) underflowIntValue;

        System.out.println("\nOverflow and Underflow Scenarios:");
        System.out.println("Overflow: int to byte (128 to " + overflowByteValue + ")");
        System.out.println("Underflow: int to byte (-129 to " + underflowByteValue + ")");
    }
}
