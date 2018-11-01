package BridgeCrossing;
public class Edge {

    private Vertex one, two;
    private String onBridge;
    
    public Edge(Vertex one, Vertex two){
        this(one, two, null);
    }
    
    public Edge(Vertex one, Vertex two, String onBridge){
        this.one = (one.getLabel().compareTo(two.getLabel()) <= 0) ? one : two;
        this.two = (this.one == one) ? two : one;
        this.onBridge = onBridge;
    }
    
    public Vertex getNeighbor(Vertex current){
        if(!(current.equals(one) || current.equals(two))){
            return null;
        }
        
        return (current.equals(one)) ? two : one;
    }
    
    public Vertex getOne(){
        return this.one;
    }
    
    public Vertex getTwo(){
        return this.two;
    }
    
    public String getOnBridge() {
		return this.onBridge;
	}

	public void setOnBridge(String onBridge1) {
		this.onBridge = onBridge1;
	}
    
    public String toString(){
        return "({" + one + ", " + two + "}, " + onBridge + ")";
    }
    
    public boolean equals(Object other){
        if(!(other instanceof Edge)){
            return false;
        }
        
        Edge e = (Edge)other;
        
        return e.one.equals(this.one) && e.two.equals(this.two);
    }   
}
