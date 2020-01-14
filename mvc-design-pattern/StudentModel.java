
public class StudentModel {
	
	private String _name;
	private String _studentId;
	private String _course;
	
	public StudentModel() {
		_name = "Amy";
		_studentId = "123";
		_course = "CEG4110";
	}
	
	public void setName(String name) {
		_name = name;
	}
	public void setStudentId(String studentId) {
		_studentId = studentId;
	}
	public void setCourse(String course) {
		_course = course;
	}
	
	public String getName() {
		return _name;
	}
	public String getStudentId() {
		return _studentId;
	}
	public String getCourse() {
		return _course;
	}

}
