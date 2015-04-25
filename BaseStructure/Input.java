package BaseStructure;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Input {
	ArrayList<Node> N;
	ArrayList<Arc> A;
	
	Input(String s) throws NumberFormatException, IOException{
		Node[] NodeArray;
		Arc[] ArcArray;
		Location L;
		int T,H,C;
		
    	System.out.print("Reading input file...");

		//Imports Input data file
		FileReader in = null;
		in = new FileReader("/Users/vivek/Documents/Java/Check/src/" + s);
		BufferedReader reader = new BufferedReader(in);
		String line;
    	System.out.println("Completed.");
		
		//Skip line(s)
		line = reader.readLine();
    	
    	System.out.print("Importing Node data...");
		//Number of Nodes
		int n = Integer.parseInt(reader.readLine());
		//System.out.println(n);
    	System.out.println("Completed.");

		//Skip line(s)
    	line = reader.readLine();
		
    	//Set up node matrix
    	NodeArray = new Node[n];
    	for(int i = 0; i < n; i++)
    	{
    		line = reader.readLine();
    		String[] token = line.split("\\s+");
    		int j = Integer.parseInt(token[0]);
    		NodeArray[i] = new Node(j);
    		L = new Location(Double.parseDouble(token[1]), Double.parseDouble(token[2]));
    		NodeArray[i].setLocation(L);
    		NodeArray[i].getLocation().printLocation();
    	}

    	//Skip line(s)
    	line = reader.readLine();
    	
    	//Number of arcs
    	int m = Integer.parseInt(reader.readLine());
    	
    	//Skip line(s)
    	line = reader.readLine();
    	
    	System.out.print("Importing Arc data...");
    	//Set up Arc Matrix
    	ArcArray = new Arc[m];
    	for(int i =0; i < m; i++)
    	{
    		line = reader.readLine();
    		String[] token = line.split("\\s+");
    		T = Integer.parseInt(token[0])-1;
    		H = Integer.parseInt(token[1])-1;
    		C = Integer.parseInt(token[2]);

    		ArcArray[i]= new Arc(NodeArray[H],NodeArray[T],C);
    		ArcArray[i].setID(i);
    	}
    	System.out.println("Completed.");

    	reader.close();
    	N = new ArrayList<Node>(Arrays.asList(NodeArray));
    	A = new ArrayList<Arc>(Arrays.asList(ArcArray));
    	System.out.println("Network Setup Completed");
	}
	
	public ArrayList<Node> getNodeList() {
		// TODO Auto-generated method stub
		return N;
	}
	
	public ArrayList<Arc> getArcList() {
		// TODO Auto-generated method stub
		return A;
	}
}

