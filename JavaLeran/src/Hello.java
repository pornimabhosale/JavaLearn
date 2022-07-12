import java.math.BigDecimal;

public class Hello {
	public static void main(String[] args) {
//		Car car = new Car("on","Seated");
		Car car = new Car();
		car.setDriver("Seated");
		car.setEngine("on");
//		car.setDriver("seated");
//		car.setEngine("on");
        System.out.println(car.getDriver());
        System.out.println(car.getEngine());
	}

}
