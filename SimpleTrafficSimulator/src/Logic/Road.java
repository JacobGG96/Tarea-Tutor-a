package Logic;


public class Road implements IConstants{
	
	public void setroad(String _sentido, int _cantCarriles, int _DiatanciaTotal){
		this._cantCarriles = _cantCarriles;
		this._sentido = _sentido;
		this._DistanciaTotal = _DiatanciaTotal;
		
	}

	public String getSentido() {
		return _sentido;
	}

	public void setSentido(String sentido) {
		this._sentido = sentido;
	}

	public int get_cantCarriles() {
		return _cantCarriles;
	}

	public void set_cantCarriles(int _cantCarriles) {
		this._cantCarriles = _cantCarriles;
	}

	public int get_DistanciaTotal() {
		return _DistanciaTotal;
	}

	public void set_DistanciaTotal(int _DistanciaTotal) {
		this._DistanciaTotal = _DistanciaTotal;
	}
	
	
	
}
					