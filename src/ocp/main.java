package ocp;

public class main {
	public static void main(String[] args) {
		Sheet sheet = new Sheet();
		
		sheet.addFigure(new Circle(2.5f));
		sheet.addFigure(new Circle(4f));
		
		sheet.addFigure(new Square(3.56f));
		
		sheet.addFigure(new Diamond(6f, 8f));
		
		sheet.drawFigures();
		
		System.out.println("Total area: "+sheet.getTotalArea());
	}
}
