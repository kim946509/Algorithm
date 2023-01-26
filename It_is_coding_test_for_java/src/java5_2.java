import java.util.LinkedList;
import java.util.Queue;

public class java5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(5);
		queue.offer(2);
		queue.offer(3);
		queue.offer(7);
		queue.poll();
		queue.offer(1);
		queue.offer(4);
		queue.poll();
		System.out.println(queue);
		queue.clear();
	}

}
