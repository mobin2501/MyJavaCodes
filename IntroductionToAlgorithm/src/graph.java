import java.util.*;

public class graph {
	static class Graph {
		int v;
		LinkedList<Integer> adjarr[];
		Graph(int v){
			this.v=v;
			adjarr=new LinkedList[v];
			for(int i=0;i<v;i++) {
				adjarr[i]=new LinkedList<>();
			}
		}
	}
	public static void addedge(Graph graph,int src, int dest) {
		graph.adjarr[src].add(dest);
		graph.adjarr[dest].add(src);
	}
	public static void printEdge(Graph graph) {
		for(int i=0;i<graph.v;i++) {
			System.out.println("From vertex "+i);
			System.out.print("Head");
			for(Integer pc:graph.adjarr[i]) {
				System.out.print("->"+pc);
			}
			System.out.println("\n");
		}
	}
	public static void main(String args[]) {
		int v=5;
		Graph g=new Graph(v);
		addedge(g,0,1);
		addedge(g,0,4);
		addedge(g,1,2);
		addedge(g,1,3);
		addedge(g,1,4);
		addedge(g,2,3);
		addedge(g,3,4);
		printEdge(g);
	}
		

}
