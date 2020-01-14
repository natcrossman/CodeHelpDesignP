
public class ShapeFactory {
	
	public ShapeFactory() {}
	
	public Shape getShape(String type) {
		switch(type) {
		case "square":
			return new Square();
		case "triangle":
			return new Triangle();
		}
		return null;
	}

}
