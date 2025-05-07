package strings;

public class StringPerformanceTest {

    public static void main(String[] args) {
        int iterations = 1000000;
        String testString = "rafik";
        long start, end;

        start = System.nanoTime();
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += testString;
        }
        end = System.nanoTime();
        System.out.println("String concat time: " + (end - start) / 100000 + " ms");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(testString);
        }
        end = System.nanoTime();
        System.out.println("StringBuilder concat time: " + (end - start) / 100000 + " ms");

        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(testString);
        }
        end = System.nanoTime();
        System.out.println("StringBuffer concat time: " + (end - start) / 100000 + " ms");

        String longString = sb.toString();

        start = System.nanoTime();
        new StringBuilder(longString).reverse();
        end = System.nanoTime();
        System.out.println("StringBuilder reverse time: " + (end - start) / 100000 + " ms");

        start = System.nanoTime();
        new StringBuffer(longString).reverse();
        end = System.nanoTime();
        System.out.println("StringBuffer reverse time: " + (end - start) / 100000 + " ms");
    }
}

