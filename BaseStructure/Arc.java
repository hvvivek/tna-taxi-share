package BaseStructure;

public class Arc {
	
	private int id;
	private int cost;
	private Node Head;
	private Node Tail;
	private int lc;
	private int uc;
	
	///////////////////////////
	//Overriding Constructors//
	///////////////////////////
	Arc(int ID){
		this.setID(ID);
	}
	
	Arc(Node H, Node T){
		this.setHead(H);
		this.setTail(T);
		H.addTail(T);
		T.addHead(H);
	}
	Arc(Node H, Node T, int C){
		this.setHead(H);
		this.setTail(T);
		H.addTail(T);
		T.addHead(H);
		this.setCost(C);
		this.setLC(0);
		this.setUC(1000);
	}
	
	
	/////////////////
	//GET Functions//
	/////////////////
	public Integer getID(){
		return id;
	}
	public Integer getCost(){
		return cost;
	}
	public Node getHead(){
		return Head;
	}
	public Node getTail(){
		return Tail;
	}
	public Integer getLC(){
		return lc;
	}
	public Integer getUC(){
		return uc;
	}
	
	/////////////////
	//SET Functions//
	/////////////////
	public void setID(int ID) {
		// TODO Auto-generated method stub
		id = ID;
	}
	public void setCost(int c) {
		// TODO Auto-generated method stub
		cost = c;
	}
	public void setLC(int LC) {
		// TODO Auto-generated method stub
		lc = LC;
	}
	public void setUC(int UC) {
		// TODO Auto-generated method stub
		uc = UC;
	}
	public void setHead(Node h) {
		// TODO Auto-generated method stub
		Head = h;
		h.addOArc(this);
	}
	public void setTail(Node t) {
		// TODO Auto-generated method stub
		Tail = t;
		t.addIArc(this);
	}
	
	////////////////////
	//Helper Functions//
	////////////////////
}
