package ocp;

import java.util.Enumeration;
import java.util.Vector;

public class Sheet{
	Vector<Figure> figures=new Vector<>();
	
	public void addFigure(Figure f) {
		figures.add(f);
	}

	public void drawFigures(){
		Enumeration<Figure> efigures = figures.elements();
		Figure f;
		while (efigures.hasMoreElements()){
			f = efigures.nextElement();
			f.draw();
		}		
	}
	
	public float getTotalArea() {
		float total = 0;
		Enumeration<Figure> efigures = figures.elements();
		Figure f;
		while (efigures.hasMoreElements()){
			f = efigures.nextElement();
			total += f.getArea();
		}
		return total;
	}
}
