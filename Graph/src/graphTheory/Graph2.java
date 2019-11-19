package graphTheory;
import java.util.*;
public class Graph2 {
	static class Graph{
		int v;
		LinkedList<Integer> l[];
		
		Graph(int v){
			this.v=v;
			l=new LinkedList[v];
			for(int i=0;i<v;i++) {
				l[i]=new LinkedList<>();
			}
		}
		
	}
	public static void addEdge(Graph g,int v1,int v2) {
		g.l[v1].add(v2);
	}
	public static void printEdgee(Graph g) {
		for(int i=0;i<g.v;i++) {
			System.out.println("From Vertex "+i);
			for(int j:g.l[i]) {
				System.out.print("->"+j);
				
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Graph g=new Graph(5);
		addEdge(g,1,2);
		addEdge(g,1,3);
		addEdge(g,1,4);
		addEdge(g,2,3);
		addEdge(g,3,4);
		addEdge(g,3,5);
		addEdge(g,4,5);
		printEdgee(g);
	}

	
}
