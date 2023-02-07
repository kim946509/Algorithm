import java.util.*;

public class java5_11 {
	public static int n,m;
	public static int graph[][]=new int[1000][1000];
	public static int count=1;
	public static boolean move(int x,int y, int count) {
		if(x<=-1||x>=n||y<=-1||y>=n)
			return false;
		if(graph[x][y]==0)
			return false;
		else {
			if(graph[x][y]>count+1||(x==0 && y==0)) {
				graph[x][y]=count+1;
				move(x+1,y,graph[x][y]);
				move(x,y+1,graph[x][y]);
				move(x-1,y,graph[x][y]);
				move(x,y-1,graph[x][y]);
			}
			else
				return false;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String str=sc.nextLine();
			for(int j=0;j<m;j++) {
				graph[i][j]=str.charAt(j)-'0';
			}
		}
		move(0,0,graph[0][0]);
		System.out.println(graph[n][m]);
		
	}

}
