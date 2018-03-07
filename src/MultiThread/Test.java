package MultiThread;

import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		ThreadDemo T1 = new ThreadDemo("Thread 1");
		T1.start();
		
		ThreadDemo T2 = new ThreadDemo("Thread 2");
		T2.start();
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("a");
		pq.add("a");
		pq.add("a");
		System.out.println(pq.size());

	}

}
