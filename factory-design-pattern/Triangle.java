
public class Triangle implements Shape {
	
	private String _name;
	
	public Triangle() {
		_name = "triangle";
	}

	@Override
	public int getCenter() {
		return 2;
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String newName) {
		_name = newName;
		
	}

}
