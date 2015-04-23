package BaseStructure;
import java.util.*;

public class Node {
	private int id;
	private ArrayList<Node> Heads = new ArrayList<Node>();
	private ArrayList<Node> Tails = new ArrayList<Node>();
	private ArrayList<Arc> OArc = new ArrayList<Arc>();
	private ArrayList<Arc> IArc = new ArrayList<Arc>();
	private int[] distMatrix;
	private int[] timeMatrix;
	private Location L;

	//////////////////////////
	//Overriding Constructor//
	//////////////////////////
	Node(int ID){
		this.setID(ID);
	}
	
	///////////////////
	//GET Functions:///
	///////////////////
	public Integer getID(){
		//returns Node ID
		return id;
	}
	public ArrayList<Node> getHeads(){
		//returns list of all Nodes reachable from this node - all immediate children
		return Heads;
	}
	public ArrayList<Node> getTails(){
		//returns all nodes which can reach this node - all immediate parents
		return Tails;
	}
	
	//////////////////
	//SET Functions://
	//////////////////
	public void setID(int ID){
		//sets ID
		id = ID;
	}
	public void setDistMatrix(int[] distMatrix) {
		this.distMatrix = distMatrix;
	}
	public void addHead(Node H){
		//adds a node to Heads
		Heads.add(H);
	}
	public void addTail(Node T){
		//adds node to Tails
		Tails.add(T);
	}
	public void addOArc(Arc arc) {
		// TODO Auto-generated method stub
		this.OArc.add(arc);
	}
	public void setTimeMatrix(int[] timeMatrix) {
		this.timeMatrix = timeMatrix;
	}
	public void addIArc(Arc arc) {
		// TODO Auto-generated method stub
		this.IArc.add(arc);
	}
	
	////////////////////
	//Helper Functions//
	////////////////////
	public boolean checkLink(Node L){
		for(Node N: Heads){
			if (L.getID() == N.getID()) {
				return true;
			}
		}
		return false;
	}

	public int getDistMatrix(int a) {
		return distMatrix[a];
	}

	public int getTimeMatrix(int a) {
		return timeMatrix[a];
	}

	public Location getLocation() {
		return L;
	}

	public void setLocation(Location l) {
		L = l;
	}
}
