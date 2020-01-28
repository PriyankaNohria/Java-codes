import java.util.*;
import java.io.*;
public class Graph
{
  private int V;
  private LinkedList<Integer> adj[];

  Graph(int v){
    V=v;
    adj=new LinkedList[v];
   for(int i=0;i<v;i++)
   adj[i]=new LinkedList();
  } 
 void addEdge(int v,int w){
   adj[v].add(w);
 }
 void DFSutil(int v,boolean visit[]){
  visit[v]=true;
  System.out.print(v+" ");
  Iterator<Integer> it=adj[v].listIterator();
  while(it.hasNext()){
  int n=it.next();
   if(!visit[n])
     DFSutil(n,visit);
  }
 } 
  void DFS(int v){
     boolean visit[]=new boolean[V];
     DFSutil(v,visit);
  }

  public static void main(String ar[]){
   Graph g=new Graph(4);
   g.addEdge(0,1);
   g.addEdge(0,2);
   g.addEdge(1,2);
   g.addEdge(2,0);
   g.addEdge(2,3);
   g.addEdge(3,3);
  System.out.println("Start from 2 : ");
  g.DFS(2);
  } 
}
