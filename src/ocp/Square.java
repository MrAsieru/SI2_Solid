package ocp;

public class Square extends Figure {
	float length;
	
	public Square(float pLength) {
		length = pLength;
	}
	
	public void draw() {
		System.out.println("Square draw: length="+length);
	}
	
	public float getArea() {
		return 2*length;
	}
}
