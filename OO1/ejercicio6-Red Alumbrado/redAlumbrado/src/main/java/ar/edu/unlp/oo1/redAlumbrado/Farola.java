package ar.edu.unlp.oo1.redAlumbrado;

import java.util.ArrayList;
import java.util.List;

public class Farola {

	private boolean prendida;
	private List<Farola> vecinas;
	
	public Farola () {
		vecinas = new ArrayList<Farola>();
		prendida = false;
	}
	
	public void setPrendida (boolean a) {
		prendida = a;
	}
	
	public void pairWithNeighbor (Farola f) {
		if (vecinas != null) {
		if (!(vecinas.contains(f))) {
			vecinas.add(f);
			f.pairWithNeighbor(this);
		}
	}
	}
	public List<Farola> getNeighbors (){
		if (vecinas != null) {
		return vecinas;
	}
		return null;
	}
	
	public void turnOn() {
		if (prendida == false) {
			prendida = true;
			if (vecinas != null) {
			vecinas.forEach(farola -> farola.setPrendida(true));
		}
	}
	}
	public void turnOff () {
		if (prendida == true) {
			prendida = false;
			if (vecinas!= null) {
			vecinas.forEach(Farola -> Farola.setPrendida(false));
		}
	}
	}
	public boolean isOn() {
		if (prendida == true) {
			return true;
		}
		return false;
	}
}
