import java.util.*;



public class java5_10_Ice {
	public static int row,column;
	public static int[][] graph = new int[1000][1000];
	
	public static boolean dfs(int x,int y) {
		if(x<=-1||x>=row||y<=-1||y>=column) {
			return false;
		}
		if(graph[x][y]==0) {
			graph[x][y]=1;
			dfs(x-1,y);
			dfs(x,y-1);
			dfs(x+1,y);
			dfs(x,y+1);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		row=scanner.nextInt();
		column=scanner.nextInt();
		scanner.nextLine();
		
		for (int i=0;i<row;i++) {
			String str=scanner.nextLine();
			for(int j=0;j<column;j++) {
				graph[i][j]=str.charAt(j)-'0';
			}
		}
		
		int result=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				if (dfs(i,j)) {
					result+=1;
				}
			}
		}
		System.out.println(result);
	}

}
