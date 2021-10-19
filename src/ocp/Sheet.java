package ocp;

import java.util.Enumeration;
import java.util.Vector;

public class Sheet{
	Vector< Square> squares=new Vector< Square>();
	Vector<Circle> circles= new Vector< Circle>();
	public void addCircle(Circle c){
		circles.add(c);
	}
	public void addSquare(Square s){
		squares.add(s);
	}
	public void drawFigures(){
		Enumeration<Square> esquares=squares.elements();
		Square s;
		while (esquares.hasMoreElements()){
			s=esquares.nextElement();
			s.draw();
		}
		Enumeration<Circles> ecircles=circles.elements();
		Circle c;
		while (circles.hasMoreElements()){
			c=ecircles.nextElement();
			c.draw();
		}
	}
}
