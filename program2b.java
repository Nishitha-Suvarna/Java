package githublab;
import java.util.*;
public class program2b {
	    public static void main(String[] args) {

	        // Test with StringBuffer
	        StringBuffer buffer = new StringBuffer();
	        long startTimeBuffer = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            buffer.append("AIET");
	        }
	        long endTimeBuffer = System.nanoTime();
	        long durationBuffer = endTimeBuffer - startTimeBuffer;

	        // Test with StringBuilder
	        StringBuilder builder = new StringBuilder();
	        long startTimeBuilder = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            builder.append("AIET");
	        }
	        long endTimeBuilder = System.nanoTime();
	        long durationBuilder = endTimeBuilder - startTimeBuilder;

	        // Output Results
	        System.out.println("--- Performance Test ---");
	        System.out.println("Time taken by StringBuffer : " + durationBuffer + " ns");
	        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ns");

	        // Justification
	        if (durationBuffer > durationBuilder) {
	            System.out.println("\n✅ StringBuilder is faster than StringBuffer.");
	        } else {
	            System.out.println("\n✅ StringBuffer is faster than StringBuilder.");
	        }

	        System.out.println("\nNote: StringBuffer is thread-safe (synchronized), which makes it slower in single-threaded cases.");
	        System.out.println("      StringBuilder is faster but not thread-safe. It's preferred for single-threaded performance.");
	    }
	}


