package strings;

public class StringBufferBuilderExplore {
    public static void main(String[] args) {
        System.out.println("PART 1: StringBufffer");
        System.out.println("====================");
        
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(50);
        StringBuffer sb3 = new StringBuffer("Hello");
        
        System.out.println("Default StringBuffer capacity: " + sb1.capacity());
        System.out.println("StringBuffer with custom capacity: " + sb2.capacity());
        System.out.println("StringBuffer with string: " + sb3 + " (length: " + sb3.length() + ", capacity: " + sb3.capacity() + ")");
        
        System.out.println("\nCommon StringBuffer operations:");
        
        sb3.append(" World");
        System.out.println("After append: " + sb3);
        
        sb3.insert(5, " Beautiful");
        System.out.println("After insert: " + sb3);
        
        sb3.delete(6, 16);
        System.out.println("After delete: " + sb3);
        
        sb3.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb3);
        
        sb3.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb3);
        
        sb3.reverse();
        System.out.println("After reverse: " + sb3);
        sb3.reverse();
        
        System.out.println("Character at index 1: " + sb3.charAt(1));
        
        sb3.setCharAt(1, 'e');
        System.out.println("After setCharAt: " + sb3);
        
        System.out.println("Substring(1): " + sb3.substring(1));
        System.out.println("Substring(1, 4): " + sb3.substring(1, 4));
        
        sb3.setLength(2);
        System.out.println("After setLength(2): " + sb3);
        
        sb1.ensureCapacity(100);
        System.out.println("After ensureCapacity(100): " + sb1.capacity());
        
        StringBuffer sb4 = new StringBuffer(100);
        sb4.append("Test");
        System.out.println("Before trimToSize - length: " + sb4.length() + ", capacity: " + sb4.capacity());
        sb4.trimToSize();
        System.out.println("After trimToSize - length: " + sb4.length() + ", capacity: " + sb4.capacity());
        
        System.out.println("\nPART 2: StringBuilder");
        System.out.println("=====================");
        
        StringBuilder sbd1 = new StringBuilder();
        StringBuilder sbd2 = new StringBuilder(50);
        StringBuilder sbd3 = new StringBuilder("Hello");
        
        System.out.println("Default StringBuilder capacity: " + sbd1.capacity());
        System.out.println("StringBuilder with custom capacity: " + sbd2.capacity());
        System.out.println("StringBuilder with string: " + sbd3 + " (length: " + sbd3.length() + ", capacity: " + sbd3.capacity() + ")");
        
        System.out.println("\nCommon StringBuilder operations:");
        
        sbd3.append(" World")
            .append(123)
            .append(true)
            .append(3.14);
        System.out.println("After multiple appends: " + sbd3);
        
        sbd1.appendCodePoint(65);
        System.out.println("After appendCodePoint(65): " + sbd1);
        
        StringBuilder sbCapacity = new StringBuilder(10);
        sbCapacity.append("12345678901234567890");
        System.out.println("\nCapacity vs Length:");
        System.out.println("Content: " + sbCapacity);
        System.out.println("Length: " + sbCapacity.length());
        System.out.println("Capacity: " + sbCapacity.capacity());
        
        System.out.println("\nPART 3: Comparision");
        System.out.println("===================================================");
        
        System.out.println("Thread Safety:");
        System.out.println("- StringBuffer: Thread-safe (synchronized methods)");
        System.out.println("- StringBuilder: Not thread-safe (non-synchronized methods)");
        
        System.out.println("\nPerformance Comparison:");
        
        long startTime = System.nanoTime();
        
        StringBuffer sbBuffer = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sbBuffer.append("a");
        }
        long endTimeBuffer = System.nanoTime();
        
        long bufferTime = endTimeBuffer - startTime;
        System.out.println("Time taken by StringBuffer: " + bufferTime + " ns");
        
        long startTimeBuilder = System.nanoTime();
        StringBuilder sbBuilder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sbBuilder.append("a");
        }
        long endTimeBuilder = System.nanoTime();
        
        long builderTime = endTimeBuilder - startTimeBuilder;
        System.out.println("Time taken by StringBuilder: " + builderTime + " ns");
        System.out.println("StringBuilder is approximately " + (double) bufferTime / builderTime + " times faster");
        
        System.out.println("\nPART 4: Converting to string");
        System.out.println("===========================");
        
        StringBuffer bufferToConvert = new StringBuffer("Convert me to String");
        String convertedFromBuffer = bufferToConvert.toString();
        System.out.println("Converted from StringBuffer: " + convertedFromBuffer);
        
        StringBuilder builderToConvert = new StringBuilder("Also convert me");
        String convertedFromBuilder = builderToConvert.toString();
        System.out.println("Converted from StringBuilder: " + convertedFromBuilder);
        
        System.out.println("\nPART 5: Memory Efficiency");
        System.out.println("=========================");
        
        String regularString = "";
        long memoryStart = Runtime.getRuntime().freeMemory();
        for (int i = 0; i < 10000; i++) {
            regularString += "a";
        }
        long memoryEnd = Runtime.getRuntime().freeMemory();
        System.out.println("Memory used by String concatenation: " + (memoryStart - memoryEnd) + " bytes");
        
        memoryStart = Runtime.getRuntime().freeMemory();
        StringBuilder builderMemory = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            builderMemory.append("a");
        }
        String resultBuilder = builderMemory.toString();
        memoryEnd = Runtime.getRuntime().freeMemory();
        System.out.println("Memory used by StringBuilder: " + (memoryStart - memoryEnd) + " bytes");
    }
}
