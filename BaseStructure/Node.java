package BaseStructure;
import java.util.*;

public class Node {
	private int id;
	private ArrayList<Node> Heads = new ArrayList<Node>();
	private ArrayList<Node> Tails = new ArrayList<Node>();
	
	//Overriding Constructor
	Node(int ID){
		this.setID(ID);
	}
	//GET Functions:
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
	
	//SET Functions:
	public void setID(int ID){
		//sets ID
		id = ID;
	}
	public void addHead(Node H){
		//adds a node to Heads
		Heads.add(H);
	}
	public void addTail(Node T){
		//adds node to Tails
		Tails.add(T);
	}
	
	//Helper Functions
	public boolean checkLink(Node L){
		for(Node N: Heads){
			if (L.getID() == N.getID()) {
				return true;
			}
		}
		return false;
	}
	
}
