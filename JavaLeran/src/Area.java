
public class Area {

	public static void main(String[] args) {
     System.out.println("Area of Rectangle "+area(5.5d,12.29));
     System.out.println("Area of Squar "+area(5));
	}
    public static double area(double length,double width) {
    	return length*width;
    	
    }
    public static int area(int side) {
    	return side * side;
    }
}
