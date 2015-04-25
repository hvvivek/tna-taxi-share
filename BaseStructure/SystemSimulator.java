package BaseStructure;

public class SystemSimulator implements Runnable {
		Network A;
		SystemSimulator(Network N){
			A = N;
		}
	    
		public void run(){
			while(true){
				try {
					for(int i=0; i<A.Taxis.size(); i++){
						A.Taxis.get(i).runPath();
					}
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
	       
	    }
			  
	}

