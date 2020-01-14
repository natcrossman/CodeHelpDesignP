
public class SoftwareUI {
	
	private String _id; 
	private SoftwareController _controller;
	
	public SoftwareUI(String id, SoftwareController controller) {
		_id = id;
		_controller = controller;
		_controller.addView(this);
		
		// create the UI, the JPanel, etc. 
		System.out.println("UI "+_id+" Initialized!");
	}

	public void updateUI(String studentName, String studentId, String course) {
		System.out.println("UI "+_id+" Update:");
		System.out.println("Student name: "+studentName);
		System.out.println("Student id: "+studentId); 
		System.out.println("Course Enrollment: "+course);
	}
	
	public void changeStudentName(String newName) {
		_controller.setStudentName(newName);
	}
}
