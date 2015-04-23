package BaseStructure;

import java.util.ArrayList;

public class Network {
	private ArrayList<Node> Nodes = new ArrayList<Node>();
	private ArrayList<Arc> Arcs = new ArrayList<Arc>();
	public ArrayList<Vehicle> Taxis = new ArrayList<Vehicle>();
	Network(ArrayList<Node> N, ArrayList<Arc> A){
		this.setNodes(N);
		this.setArcs(A);
		this.updateGraph();
	}
	private void updateGraph() {
		// TODO Auto-generated method stub
		for(int i=0; i<Arcs.size(); i++){
			Arcs.get(i).getHead().addIArc(Arcs.get(i));
			Arcs.get(i).getHead().addTail(Arcs.get(i).getTail());
			Arcs.get(i).getTail().addOArc(Arcs.get(i));
			Arcs.get(i).getTail().addHead(Arcs.get(i).getHead());
		}
	}
	public ArrayList<Node> getNodes() {
		return Nodes;
	}
	public void setNodes(ArrayList<Node> nodes) {
		Nodes = nodes;
	}
	public ArrayList<Arc> getArcs() {
		return Arcs;
	}
	public void setArcs(ArrayList<Arc> arcs) {
		Arcs = arcs;
	}
	
	public void addNode(Node n){
		this.Nodes.add(n);
	}
	
	public void addArc(Node n){
		this.Nodes.add(n);
	}
	
}
