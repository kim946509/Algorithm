import java.util.*;

class Node{
	private int index;
	private int distance;
    
	public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public void show() {
        System.out.print("(" + this.index + "," + this.distance + ") ");
    }
}

public class java5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
		for(int i=0;i<3;i++) {
			graph.add(new ArrayList<Node>());
		}
//		(���,�Ÿ�)
		graph.get(0).add(new Node(1,7));
		graph.get(0).add(new Node(2,5));
		
		graph.get(1).add(new Node(0,7));
		graph.get(2).add(new Node(0,5));
		
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                graph.get(i).get(j).show();
            }
            System.out.println();
        }
	}

}
