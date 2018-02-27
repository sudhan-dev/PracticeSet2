
//to invoke garbage collector and show the details of free memory before and after the garbage collection.

public class PracticeProg5 {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		long mem1, mem2;
		Integer someints[] = new Integer[1000];
		System.out.println("Total memory is: " + r.totalMemory());
		System.out.println("Initial free memory: " + r.freeMemory());
		r.gc();
		mem1 = r.freeMemory();
		System.out.println("Free memory after garbage collection: " + mem1);
		for (int i = 0; i < 1000; i++)
			someints[i] = new Integer(i);
		mem2 = r.freeMemory();
		System.out.println("Free memory after allocation: " + mem2);
		System.out.println("Memory used by allocation: " + (mem1 - mem2));
		for (int i = 0; i < 1000; i++)
			someints[i] = null;
		r.gc();
		mem2 = r.freeMemory();
		System.out.println("Free memory after collecting" + " discarded Integers: " + mem2);
	}
}
