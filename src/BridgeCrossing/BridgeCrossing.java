package BridgeCrossing;
import java.util.*;

public class BridgeCrossing {
	static final String I = "Ivar";
	static final String K = "Kumo";
	static final String KT = "Kumo Treats";
	static final String W = "Wendigo"; 
	String answer = "";
	public void printAnswer(){
		Graph graph = new Graph();
		String onBridge[] = {I + ", " + K,
                                    I,
                                    I + ", " + W,
                                    I + ", " + K,
                                    " ",
                                    I + ", " + K,
                                    I + ", " + W,
                                    I,
                                    I + ", " + K,
                                    I + ", " + KT,
                                    };
		String pCombo[] = {I+ ", " + K + ", " + KT + ", " + W, 
                                    KT + ", " + W,
                                    I + ", " + KT + ", " + W, 
                                    KT,
                                    I + ", " + K + ", " + KT,
                                    W,
                                    I + ", " + K + ", " + W, 
                                    K,
                                    I + ", " + K,					
                                    " "};
		Vertex[] v = new Vertex[10];
		int j = 9;
		for(int i = 0; i < v.length; i++){
		    v[i] = new Vertex(i + " " + pCombo[i] + " || " + pCombo[j]);
	        graph.addVertex(v[i], true);
	        j--;
		}
		
		j = 1;
		int k = 0;
		for(int i = 0; i < v.length - 1; i++){
			if (i!=4 && j!=5){
				graph.addEdge(v[i], v[j], onBridge[k]);
			}
            if (i+j==7 || i+j==11){
            	graph.addEdge(v[i-1], v[j+1], onBridge[9]);
            }
            j++;
            k++;
        }
		
		for(int i = 0; i < v.length; i++){
            System.out.println(v[i]);
            answer += v[i] + "\n";
            for(j = 0; j < v[i].getNeighborCount(); j++){
                System.out.println(v[i].getNeighbor(j));
                answer += v[i].getNeighbor(j) + "\n";
            }
            answer += "\n";
            System.out.println();
        }
		System.out.println(graph.vertexKeys());
                answer += graph.vertexKeys() + "\n";
        }
}

	

