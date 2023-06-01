public class Oxygen implements Runnable{

	private H2OBuilder builder;
	private int index = 0;
	
	public Oxygen(H2OBuilder builder, int index) {
		this.builder = builder;
		this.index = index;
	}
	
	@Override
	public void run() {
		builder.createOxygen(index);
	}
}