package cse2201;
import java.util.*;
public class MinimumSpanigTree {
	static int v=8;
	public static int minkey(int[] key,boolean[] q) {
		int min=Integer.MAX_VALUE;
		int min_i=-1;
		for(int i=0;i<v;i++) {
			if(q[i]==false && key[i]<min) {
				min=key[i];
				min_i=i;
			}
		}
		return min_i;
	}
	public static void primsMST(int[][] a) {
		int[] ver=new int[v];
		int[] key=new int[v];
		boolean[] q=new boolean[v];
		for(int i=0;i<v;i++) {
			key[i]=Integer.MAX_VALUE;
			q[i]=false;
		}
		key[0]=0;
		ver[0]=-1;
		int count=0;
		while(count<v-1) {
			int u=minkey(key,q);
			q[u]=true;
			for(int i=0;i<v;i++) {
				if(a[u][i]!=0 && q[u]==false && a[u][i]<key[i]) {
					ver[i]=u;
					key[i]=a[u][i];
				}
			}
			//System.out.println(u);
			count++;
		}
		for(int i=0;i<v;i++) {
			System.out.println(ver[i]+"  "+a[i][ver[i]]);
		}
		
	}
	public static void main(String args[]) {
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
		int[][] g= {{0,9,0,0,0,0,0,0},
				{9,0,7,5,12,0,0,0},
				{0,7,0,0,0,10,15,0},
				{0,5,0,0,6,8,0,14},
				{0,12,0,6,0,0,0,0},
				{0,0,10,8,0,0,0,3},
				{0,0,0,14,0,5,0,0}};
		primsMST(g);
		
		
	}

}
