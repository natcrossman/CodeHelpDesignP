
public class ObserverDP {

	public static void main(String[] args) {
		StudentModel model = new StudentModel();
		SoftwareController controller = new SoftwareController(model);
		SoftwareUI ui1 = new SoftwareUI("1",controller);
		SoftwareUI ui2 = new SoftwareUI("2",controller);
		SoftwareUI ui3 = new SoftwareUI("3",controller);
		
		ui2.changeStudentName("Derek");
		ui3.changeStudentName("Bob");
		ui1.changeStudentName("Maureen");
	}

}
