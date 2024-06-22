public class StringBuilderStringBufferComparison {
    public static void main(String[] args) {
        int iterations = 1000000; // Number of iterations
        
        // Using StringBuilder
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("Hello");
        }
        String result = sb.toString();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ms");
        
        // Using StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("Hello");
        }
        result = stringBuffer.toString();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ms");
    }
}
