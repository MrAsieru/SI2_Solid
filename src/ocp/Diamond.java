package ocp;

public class Diamond extends Figure {
	float height;
	float width;
	
	public Diamond(float pHeight, float pWidth) {
		height = pHeight;
		width = pWidth;
	}
	
	public void draw() {
		System.out.println("Diamond draw: height="+height+" width="+width);
	}
	
	public float getArea() {
		return (height*width)/2;
	}
}
