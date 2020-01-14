
public class SingletonDP {

	public static void main(String[] args) {
		
		GlobalConfiguration config = GlobalConfiguration.getInstance(); 
		System.out.println(config.getResolution());
		
		GlobalConfiguration anotherRefToConfig = GlobalConfiguration.getInstance();
		anotherRefToConfig.setResolution("640x480");
		
		System.out.println(config.getResolution());
		
		GlobalConfiguration cfg = new GlobalConfiguration();

	}

}
