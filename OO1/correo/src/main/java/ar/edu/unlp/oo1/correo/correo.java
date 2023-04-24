package ar.edu.unlp.oo1.correo;

public class correo {

	private String cuerpo;
	private String titulo;
	private archivo adjunto;
	
	
	public correo(String cuerpo, String titulo, archivo adjunto) {
		super();
		this.cuerpo = cuerpo;
		this.titulo = titulo;
		this.adjunto = adjunto;
	}


	public String getCuerpo() {
		return cuerpo;
	}


	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public archivo getAdjunto() {
		return adjunto;
	}


	public void setAdjunto(archivo adjunto) {
		this.adjunto = adjunto;
	}
	
	
	
}
