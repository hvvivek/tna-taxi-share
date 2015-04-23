package BaseStructure;

import java.util.LinkedList;

public class Path {

	public LinkedList<Node> P;
	private int distCost;
	private int timeCost;
	
	Path(LinkedList<Node> P){
		this.setPath(P);
		
	}

	private void setPath(LinkedList<Node> p2) {
		// TODO Auto-generated method stub
		P = p2;
		this.calDistCost();
		this.calTimeCost();
	}

	private void calTimeCost() {
		// TODO Auto-generated method stub
		int tc = 0;
		for(int i=0; i<P.size()-1; i++){
			tc = tc + P.get(i).getTimeMatrix(P.get(i+1).getID());
		}
		this.setTimeCost(tc);
	}

	private void calDistCost() {
		// TODO Auto-generated method stub
		int dc = 0;
		for(int i=0; i<P.size()-1; i++){
			dc = dc + P.get(i).getDistMatrix(P.get(i+1).getID());
		}
		this.setDistCost(dc);
	}

	public int getDistCost() {
		return distCost;
	}

	public void setDistCost(int distCost) {
		this.distCost = distCost;
	}

	public int getTimeCost() {
		return timeCost;
	}

	public void setTimeCost(int timeCost) {
		this.timeCost = timeCost;
	}
	
	public LinkedList<Node> getPath(){
		return P;
	}
	
	
	
}
