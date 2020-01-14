
public class AdapterDP {

	public static void main(String[] args) {
		TemperatureSensor sensors[] = new TemperatureSensor[10];		
		
		double avgTemp = 0;
		for(int i=0; i<10; i++) {
			sensors[i] = i % 2 == 0 ? new TS7000Adapter() : new SuperTempAdapter();
			
			avgTemp += sensors[i].readTemp();
		}
		avgTemp = avgTemp / sensors.length;
		System.out.println(Double.toString(avgTemp));

	}

}
