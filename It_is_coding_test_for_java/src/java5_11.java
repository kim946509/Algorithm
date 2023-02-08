import java.util.*;
import java.awt.Point;

public class java5_11 {
 	public static int n,m;
	public static int graph[][];
	
	public static int move(int x,int y) {
		Queue<Point> queue = new LinkedList<Point>();
		queue.add(new Point(x,y));
		int dx[]= {-1,1,0,0};
		int dy[] = {0,0,-1,1};
		int nx,ny;
		
		while(!queue.isEmpty()) {
			Point p = queue.poll();
			x=p.x;
			y=p.y;
			for(int i=0;i<4;i++) {
				nx = x+dx[i];
				ny = y+dy[i];
				
				if (nx<0||nx>=n||ny<0||ny>=m) {
					continue;
				}
				
				if (graph[nx][ny]==0)
					continue;
				if (graph[nx][ny]==1) {
					graph[nx][ny]=graph[x][y]+1;
					queue.add(new Point(nx,ny));
				}
			}
		}
		return graph[n-1][m-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		sc.nextLine();
		graph=new int [n][m];
		for(int i=0;i<n;i++) {
			String str=sc.nextLine();
			for (int j=0;j<m;j++) {
				graph[i][j]=str.charAt(j)-'0';
			}
		}
		
		System.out.println(move(0,0));
		
		
	}

}
