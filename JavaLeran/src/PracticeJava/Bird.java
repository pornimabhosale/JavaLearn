package PracticeJava;

public class Bird extends Animal {
	private String aniWthFethers;
	private String canFly;
	
	public Bird() {
		super();
		this.aniWthFethers = "Yes";
		this.canFly = "Yes";
	}

	public Bird(String aniWthFethers, String canFly) {
		super();
		this.aniWthFethers = aniWthFethers;
		this.canFly = canFly;
	}
	

}
