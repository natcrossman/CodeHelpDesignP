
public class ArrayIterator implements Iterator {
	
	private Object[] _data;
	private int _position;
	
	public ArrayIterator(int length) {
		_data = new Object[length];
		_position = 0;
		for(int i = 0; i < length; i++) {
			_data[i] = i*10;
		}
	}

	@Override
	public Object getFirst() {
		_position = 0;
		return _data[0];
	}

	@Override
	public Object getNext() {
		return _data[++_position];
	}

	@Override
	public boolean atEnd() {
		// TODO Auto-generated method stub
		return _position == _data.length-1;
	}

}
