
public class GraphAdjMatrix implements Graph {
	int[][] edges;

	public GraphAdjMatrix(int size) {
	edges = new int[size][size];
	for (int i = 0; i < size; i++) 
		for (int j = 0; j < size; j++)
			edges[i][j] = -1;
			
	}
	
	//Adds a directed edge between two vertices from src to tar. 
	public void addEdge(int src, int tar) {
		edges[src][tar] = 1;		
	}

	//Prints an ordering of vertices 
	public void topologicalSort() {
		int[] arr = new int[edges.length];
		for (int i = 0; i < edges.length; i++){
			for (int j = 0; j < edges.length; j++){
			if(edges[i][j]!= -1) {
				arr[i] += 1;
			}
			}
		}
		int count = 0;
		while(count< arr.length){
			int temp = -1;
			int index = 0;
			for (int i = 0; i < arr.length; i++){
			if( temp < arr[i]){
				temp = arr[i];
				index = i;
			}	
			}			
			System.out.println(index); 
			arr[index] = -1;
			count++;
		}
		}
	

		//Returns an array of vertex IDs
		public int[] neighbors(int vertex) {
		    int[] neighbors = new int[count(vertex)];
		    int j = 0;
		    for (int i = 0; i < edges.length; i++){
		        if(edges[vertex][i]!= -1) {
		            neighbors[j++] = i;
		        }
		    }
		    return neighbors;
		}

		 public int count(int vertex) {
			    int count = 0;
			    for (int i = 0; i < edges.length; i++){
			        if(edges[vertex][i]!= -1) {
			        	count++;
			        }
			    }
			    return count;
			 }
}
