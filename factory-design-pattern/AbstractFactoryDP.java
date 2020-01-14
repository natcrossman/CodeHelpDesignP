
public class AbstractFactoryDP {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		Triangle t = (Triangle)factory.getShape("triangle");
		Square s = (Square)factory.getShape("square");
		
		Shape s = factory.getShape("square");
		

	}

}
