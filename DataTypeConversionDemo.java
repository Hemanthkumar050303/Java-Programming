public class DataTypeConversionDemo {
    public static void main(String[] args) {
        // Implicit Conversion (Widening)
        byte byteValue = 10;
        short shortValue = byteValue; // byte to short
        int intValue = shortValue;    // short to int
        long longValue = intValue;    // int to long
        float floatValue = longValue; // long to float
        double doubleValue = floatValue; // float to double

        System.out.println("Implicit Conversion (Widening):");
        System.out.println("byte to short: " + shortValue);
        System.out.println("short to int: " + intValue);
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);

        // Explicit Conversion (Narrowing)
        double largeDoubleValue = 100.04;
        float largeFloatValue = (float) largeDoubleValue; // double to float
        long largeLongValue = (long) largeFloatValue;     // float to long
        int largeIntValue = (int) largeLongValue;         // long to int
        short largeShortValue = (short) largeIntValue;    // int to short
        byte largeByteValue = (byte) largeShortValue;     // short to byte

        System.out.println("\nExplicit Conversion (Narrowing):");
        System.out.println("double to float: " + largeFloatValue);
        System.out.println("float to long: " + largeLongValue);
        System.out.println("long to int: " + largeIntValue);
        System.out.println("int to short: " + largeShortValue);
        System.out.println("short to byte: " + largeByteValue);

        // Overflow and Underflow Scenarios
        int overflowIntValue = 128;
        byte overflowByteValue = (byte) overflowIntValue; // overflow

        int underflowIntValue = -129;
        byte underflowByteValue = (byte) underflowIntValue; // underflow

        System.out.println("\nOverflow and Underflow Scenarios:");
        System.out.println("Overflow: int to byte (128 to " + overflowByteValue + ")");
        System.out.println("Underflow: int to byte (-129 to " + underflowByteValue + ")");
    }
}
