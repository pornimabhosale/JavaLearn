
public class Car {
	private String engine;
	private String driver;
	
	
	public Car() {
     this.engine = "off";
     this.driver ="Not seated";
	}

	public Car(String engine, String driver) {
		super();
		this.engine = engine;
		this.driver = driver;
	}
	
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	
	
	

}
