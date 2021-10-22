package ocp;

public class Circle extends Figure {
	float diameter;
	
	public Circle(float pDiameter) {
		diameter = pDiameter;
	}
	
	public void draw() {
		System.out.println("Circle draw: diameter="+diameter);
	}
	
	public float getArea() {
		return (float) (Math.PI*Math.pow(diameter/2, 2));
	}
}
