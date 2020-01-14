import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
	
	private ArrayList<Object> _data;
	private int _position; 
	
	public ArrayListIterator() {
		_data = new ArrayList<Object>();
		_position = 0;
		for(int i =0; i < 20; i++) {
			_data.add(i);
		}
	}

	@Override
	public Object getFirst() {
		_position = 0;
		return _data.get(_position);
	}

	public Object getNext() {
		return _data.get(++_position);
	}

	@Override
	public boolean atEnd() {
		return _position == _data.size()-1;
	}

}
