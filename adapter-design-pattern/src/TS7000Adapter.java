
public class TS7000Adapter implements TemperatureSensor{

	private TS7000 _sensor;
	
	public TS7000Adapter() {
		_sensor = new TS7000();
	}
	
	@Override
	public double readTemp() {
		return _sensor.getTemp();
	}
	

}
