
public class GlobalConfiguration {
	
	private static GlobalConfiguration _instance = new GlobalConfiguration();
	
	private String _res = "1024x768";
	private boolean _fullscreen = false;
	
	private GlobalConfiguration() {
		//empty
	}
	
	public static GlobalConfiguration getInstance() {
		return _instance;
	}
	
	public String getResolution() {
		return _res;
	}
	
	public void setResolution(String r) {
		_res = r;
	}

}
