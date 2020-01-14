import java.util.*;
public class SoftwareController {
	
	private ArrayList<SoftwareUI> _registeredViews;
	private StudentModel _theModel;
	
	public SoftwareController(StudentModel model) {
		_theModel = model;
		_registeredViews = new ArrayList<SoftwareUI>();
	}
	
	public void addView(SoftwareUI v) {
		_registeredViews.add(v);
	}
	
	public void setStudentName(String name) {
		_theModel.setName(name);
		for(SoftwareUI ui : _registeredViews) {
			ui.updateUI(
					_theModel.getName(), 
					_theModel.getStudentId(),
					_theModel.getCourse());
		}	
	}

}
