
public class Square implements Shape {
	
	private String _name;
	
	public Square() {
		_name = "sqaure";
	}

	public int getCenter() {
		return 2;
	}

	public String getName() {
		return _name;
	}

	public void setName(String newName) {
		_name = newName;
		
	}

}
