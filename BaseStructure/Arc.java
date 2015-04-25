package BaseStructure;

public class Arc {
	
	private int id;
	private double dcost;
	private int tcost;
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
	Arc(Node H, Node T, int TC){
		this.setHead(H);
		this.setTail(T);
		H.addTail(T);
		T.addHead(H);
		this.setDCost();
		this.setTCost(TC);
		this.setLC(0);
		this.setUC(1000);
	}
	
	
	/////////////////
	//GET Functions//
	/////////////////
	public Integer getID(){
		return id;
	}
	public double getDC(){
		return dcost;
	}
	public Integer getTC(){
		return tcost;
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
	public void setDCost() {
		// TODO Auto-generated method stub
		//dcost = Math.sqrt(Math.pow(this.Head.getLocation().getLatitude(), 2) + Math.pow(this.Head.getLocation().getLongitude(), 2)) ;
		double phi1 = Math.toRadians(this.Head.getLocation().getLatitude());
		double phi2 = Math.toRadians(this.Tail.getLocation().getLatitude());
		double lambda = Math.toRadians(this.Tail.getLocation().getLongitude() - this.Head.getLocation().getLongitude());
		double R = 6371000;
		dcost = Math.acos(Math.sin(phi1)*Math.sin(phi2) + Math.cos(phi1)* Math.cos(phi2)*Math.cos(lambda)) * R;
		//System.out.println("Distance is: " + dcost);
	}
	public void setTCost(int c) {
		// TODO Auto-generated method stub
		tcost = c;
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
