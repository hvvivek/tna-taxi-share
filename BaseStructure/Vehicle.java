package BaseStructure;

public class Vehicle {
	private int id;
	private Node prevNode;
	private Node nextNode;
	private Node currentNode;
	private int t;
	Path P = null;
	Location L;
	
	
	Vehicle(int id, Node N){
		this.setID(id);
		this.setCurrentNode(N);
		this.L = new Location(N.getLocation().getLatitude(),N.getLocation().getLongitude());
	}

	public int getID() {
		return id;
	}
	
	private void setCurrentNode(Node n) {
		// TODO Auto-generated method stub
		this.currentNode = n;
	}
	
	public void setPrevNode(Node prevNode) {
		this.prevNode = prevNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public Node getPrevNode() {
		return prevNode;
	}
	
	public Node getCurrentNode(){
		return currentNode;
	}
	
	public Node getNextNode() {
		return nextNode;
	}

	public void setID(int id) {
		this.id = id;
	}
	
	public void setPath(Path p) {
		
		if(this.P == null){
			this.P = p;
			this.setNextNode(P.getPath().getFirst());
			this.runPath();
		}
		else{
			while(this.P.getPath().getLast()!=this.getNextNode()){
				this.P.getPath().removeLast();
			}
			this.P.getPath().addAll(p.getPath());
		}
		
	}
	
	private void runPath() {
		this.setPrevNode(this.getCurrentNode());
		while(this.getNextNode()!=null){
			try {
		        while (true) {
		            this.updateLocation();
		            Thread.sleep(5 * 1000);
		            this.printPosition();
		        }
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		}
		
	}

	private void printPosition() {
		// TODO Auto-generated method stub
		System.out.println("Current Position of Vehicle" + this.getID() + " is " + this.L.getLatitude() + ", " + this.L.getLongitude());
	}

	private void updateLocation() {
		// TODO Auto-generated method stub
		double t = this.prevNode.getTimeMatrix(this.getNextNode().getID());
		
		if(this.L.getLatitude() == this.getNextNode().getLocation().getLatitude() && this.L.getLongitude() == this.getNextNode().getLocation().getLongitude()){
			this.setCurrentNode(this.getNextNode());
			this.setPrevNode(this.getNextNode());
			this.P.getPath().removeFirst();
			if(this.P.getPath().size()>0){
				this.setNextNode(this.P.getPath().getFirst());
				this.updateLocation();
			}
			else{
				this.setNextNode(null);
			}
		}
		else{
			this.L.setLatitude(this.L.getLatitude() + (5.0/t)*(this.getNextNode().getLocation().getLatitude() - this.getPrevNode().getLocation().getLatitude())); 
			this.L.setLongitude(this.L.getLongitude() + (5.0/t)*(this.getNextNode().getLocation().getLongitude() - this.getPrevNode().getLocation().getLongitude()));
			//System.out.println(this.L.getLatitude() + "," + this.L.getLongitude());
		}
	}

	

}
