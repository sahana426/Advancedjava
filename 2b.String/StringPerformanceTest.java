package StringPerformanceTest;
public class StringOperationsDemo {

    public static void main(String[] args) {
        int iterations = 10000;
        String text = "AIET";

        // Test with StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }

        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer - startBuffer;
        System.out.println("Time taken by StringBuffer: " + timeBuffer + " nanoseconds");

        // Test with StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }

        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " nanoseconds");

        // Compare and justify
        if (timeBuilder < timeBuffer) {
            System.out.println("\n✅ StringBuilder is faster than StringBuffer in a single-threaded environment.");
        } else {
            System.out.println("\n✅ StringBuffer is faster (unexpected in single-threaded test, might vary due to JVM).");
        }
    }
}
