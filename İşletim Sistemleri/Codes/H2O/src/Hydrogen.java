public class Hydrogen implements Runnable{
	
	private H2OBuilder builder;
	private int index;
	
	public Hydrogen(H2OBuilder builder, int index) {
		this.builder = builder;
		this.index = index;
	}
	
	@Override
	public void run() {
		builder.createHydrogen(index);
	}
}