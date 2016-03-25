package Logic;

public class Signals implements IConstants {
	
	public void setsignal(boolean _state, String _name){
		this._state = _state;
		this._name = _name;
	}
	public int is_state() {
		return _state;
	}

	public void set_state(boolean _state) {
		this._state = _state;
	}
	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

}
