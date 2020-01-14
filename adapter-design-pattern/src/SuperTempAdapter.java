
public class SuperTempAdapter implements TemperatureSensor{

	private SuperTemp _sensor;
	
	public SuperTempAdapter() {
		_sensor = new SuperTemp();
	}
	@Override
	public double readTemp() {
		return _sensor.getTemperature();
	}

}
