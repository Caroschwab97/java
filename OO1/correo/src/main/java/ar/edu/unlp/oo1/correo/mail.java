package ar.edu.unlp.oo1.correo;

import java.util.ArrayList;
import java.util.List;

public class mail {

	private List<carpeta> carpetas;
	private carpeta Inbox;
	private int indiceInbox;
	
	public mail() {
		carpetas= new ArrayList<carpeta>();
		carpeta inbox = new carpeta();
		carpetas.add(inbox);
	}
	
	public void recibir(correo e) {
		carpetas.get(indiceInbox).agregar(e);
	}
	
	public void mover (correo c, carpeta origen, carpeta destino) {
		int index=carpetas.indexOf(origen);
		carpetas.get(index).eliminar(c);
		int indice = carpetas.indexOf(destino);
		carpetas.get(indice).agregar(c);
	}
	
	public correo buscar (String texto) {
	    	correo em = null;
	    	for(carpeta c : carpetas) {
	    	    for(correo  e : c.getEmails()) {
	    		if (e.getCuerpo().equals(texto) || e.getTitulo().equals(texto)){
	    		    return e;
	    		}
	    	    }
	    	}
	    	return em;
	}
	 public void agregarCarpeta (carpeta c) {
		 carpetas.add(c);
	 }
	
	public void algo() {
		carpeta c = new carpeta();
		carpetas.add(c);
		carpeta b = new carpeta();
		carpetas.add(b);
		int index=carpetas.indexOf(b);
		carpeta car = carpetas.get(index);
		
	}
	

}
