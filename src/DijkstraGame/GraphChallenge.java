package DijkstraGame;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class GraphChallenge{
    private List<Vertex> nodes;
    private List<Edge> edges;
    private String answer="";
    public String given="";
    int frm = 0;
    int to = 0;
	 public void testExcute() {
         nodes = new ArrayList<Vertex>();
         edges = new ArrayList<Edge>();

         Random rand = new Random();
         frm = Math.abs(rand.nextInt(4));
         
         for (int i = 0; i < 5; i++) {
                 Vertex location = new Vertex("Node_" + i, "Node_" + i);
                 nodes.add(location);
         }
         
         addLane("0", 0, 1, Math.abs(rand.nextInt(9))+1);
         addLane("1", 0, 2, Math.abs(rand.nextInt(9))+1);
         addLane("2", 0, 3, Math.abs(rand.nextInt(9))+1);
         addLane("3", 0, 4, Math.abs(rand.nextInt(9))+1);
         
         addLane("4", 1, 0, Math.abs(rand.nextInt(9))+1);
         addLane("5", 1, 2, Math.abs(rand.nextInt(9))+1);
         addLane("6", 1, 3, Math.abs(rand.nextInt(9))+1);
         addLane("7", 1, 4, Math.abs(rand.nextInt(9))+1);

         addLane("8", 2, 1, Math.abs(rand.nextInt(9))+1);
         addLane("9", 2, 0, Math.abs(rand.nextInt(9))+1);
         addLane("10", 2, 3, Math.abs(rand.nextInt(9))+1);
         addLane("11", 2, 4, Math.abs(rand.nextInt(9))+1);
         
         addLane("12", 3, 1, Math.abs(rand.nextInt(9))+1);
         addLane("13", 3, 2, Math.abs(rand.nextInt(9))+1);
         addLane("14", 3, 0, Math.abs(rand.nextInt(9))+1);
         addLane("15", 3, 4, Math.abs(rand.nextInt(9))+1);
         
         addLane("16", 4, 1, Math.abs(rand.nextInt(9))+1);
         addLane("17", 4, 2, Math.abs(rand.nextInt(9))+1);
         addLane("18", 4, 3, Math.abs(rand.nextInt(9))+1);
         addLane("19", 4, 0, Math.abs(rand.nextInt(9))+1);
         
         // Lets check from location Loc_1 to Loc_10
         Graph graph = new Graph(nodes, edges);
         System.out.print(graph.getEdges());
         
         String edgg = graph.getEdges() + "";
         String[] e = edgg.split(",");
         for (int i=0; i<e.length;i++){
        	 given += e[i] + "\n";
         }
         
         DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
         dijkstra.execute(nodes.get(frm));
         LinkedList<Vertex> path1 = dijkstra.getPath(nodes.get(to));

         for (Vertex vertex : path1) {
             answer += vertex + "\n";
         }
 }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
	 
    private void addLane(String laneId, int sourceLocNo, int destLocNo, int duration) {
       Edge lane = new Edge(laneId,nodes.get(sourceLocNo), nodes.get(destLocNo), duration );
        edges.add(lane);
    }
}
