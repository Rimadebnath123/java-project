package LabTest2;

public class Area implements Shape {
//instance variable
	int length;
	int breath;
	int side;
	int radius;
	static double PI=3.14;//pi value is constant
	//default constructor
	public Area() {
		super();
	}
	//parameterized constructor
	public Area(int length, int breath, int side, int radius) {
		super();
		this.length = length;
		this.breath = breath;
		this.side = side;
		this.radius = radius;
	}
	//getter method
	public int getLength() {
		return length;
	}
	//setter method
	public void setLength(int length) {
		this.length = length;
	}
	//getter method
	public int getBreath() {
		return breath;
	}
	//setter method
	public void setBreath(int breath) {
		this.breath = breath;
	}
	//getter method
	public int getSide() {
		return side;
	}
	//setter method
	public void setSide(int side) {
		this.side = side;
	}
	//getter method
	public int getRadius() {
		return radius;
	}
	//setter method
	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override// display  area of rectangle
	public void rectangleArea() {
	
		System.out.println("Area of Rectangle:" +(length*breath));
	}
	@Override//display area of Square
	public void squareArea() {
		
		System.out.println("Area of Square:"+(side*side));
	}

	@Override//display area of Circle
	public void circleArea() {
	
		System.out.println("Area of Circle:"+ (PI*radius*radius));
	}

	
	
}
