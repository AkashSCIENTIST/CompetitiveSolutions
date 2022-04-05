import java.util.*;

class MyArray{
    int arr[];
    int n, index;
    MyArray(int i){
        n = i;
        arr = new int[i];
        index = 0;
    }
    void add(int a){
        arr[index++] = a;
    }
}

class Graph{
    MyArray arr[];
    boolean visited[];
    int n;
    Graph(int n){
        arr = new MyArray[n];
        visited = new boolean[n];
        for(int i=0;i<n;i++){
            arr[i] = new MyArray(n);
        }
        this.n = n;
    }
    void addEdge(int a, int b){
        arr[a].add(b);
    }
    void DFS(int a){
        if(visited[a] == true) return;
        visited[a] = true;
        System.out.print(a + " ");
        MyArray temp = arr[a];
        for(int i=0;i<temp.index;i++){
            DFS(temp.arr[i]);
        }
    }
    boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack){

        if (recStack[i]) return true;
 
        if (visited[i]) return false;
        visited[i] = true;
        recStack[i] = true;
        MyArray children = arr[i];
        
        for(int j=0;j<children.index;j++)
            if(isCyclicUtil(children.arr[j], visited, recStack)) return true;
        recStack[i] = false;
 
        return false;
    }
    boolean isCyclic(){
        boolean[] visited = new boolean[n];
        boolean[] recStack = new boolean[n];
        for (int i = 0; i < n; i++)
            if (isCyclicUtil(i, visited, recStack))
                return true;
        return false;
    }
}

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Graph graph = new Graph(sc.nextInt());
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++)
	    graph.addEdge(sc.nextInt(), sc.nextInt());
        graph.DFS(sc.nextInt());
        System.out.println();
        System.out.println(graph.isCyclic());
		
	}
}
