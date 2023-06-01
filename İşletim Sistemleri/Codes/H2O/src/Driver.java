public class Driver {
	public static void main(String[] args) {
		Thread[] oxygenThreads = new Thread[8];
		Thread[] hydrogenThread = new Thread[13];
	
		H2OBuilder h2oBuilder = new H2OBuilder();
		 
		for(int i = 0; i < oxygenThreads.length; i++) {
			oxygenThreads[i] = new Thread(new Oxygen(h2oBuilder, i));
			oxygenThreads[i].start();
		}

		for(int i = 0; i < hydrogenThread.length; i++) {
			hydrogenThread[i] = new Thread(new Hydrogen(h2oBuilder, i));
			hydrogenThread[i].start();
		}
		
		for(int i = 0; i < oxygenThreads.length; i++) {
		}
		
		for (int i = 0; i < hydrogenThread.length; i++) {
		}
		
		
		
		
	}
}