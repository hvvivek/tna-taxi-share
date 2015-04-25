package BaseStructure;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Input I = new Input("InputFile.dat");
		Network G = new Network(I.getNodeList(), I.getArcList());
	}

}
