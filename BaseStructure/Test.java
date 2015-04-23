package BaseStructure;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node A = new Node(0);
		Node B = new Node(1);
		Node C = new Node(2);
		
		Location L1 = new Location(0,0);
		Location L2 = new Location(200,300);
		Location L3 = new Location(300,300);
		
		A.setLocation(L1);
		B.setLocation(L2);
		C.setLocation(L3);
		
		
		int[] a = new int[3];
		int[] b = new int[3];
		int[] c = new int[3];
		
		a[0] = 0;b[0] = 50;c[0] = 30;
		a[1] = 20;b[1] = 0;c[1] = 40;
		a[2] = 30;b[2] = 40;c[2] = 0;
		
		A.setDistMatrix(a);B.setDistMatrix(b);C.setDistMatrix(c);
		A.setTimeMatrix(a);B.setTimeMatrix(b);C.setTimeMatrix(c);
		LinkedList<Node> p = new LinkedList<Node>();
		p.add(A);
		p.add(B);
		p.add(C);
		Path P = new Path(p);
		
		Vehicle V1 = new Vehicle(1,A);
		Vehicle V2 = new Vehicle(2,B);
		V1.setPath(P);
		V2.setPath(P);
	}

}
