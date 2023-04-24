package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */

/*
* Permite construir una instancia del WallpostImpl.
* Luego de la invocación, debe tener como texto: “Undefined post”,
* no debe estar marcado como destacado y la cantidad de “Me gusta” deben ser 0.
*/

public class WallPostImpl implements WallPost {

	private int likes;
	private String texto;
	private boolean destacado;
	
	
	public WallPostImpl() {
		super();
		likes = 0;
		texto = "Undefined post";
		destacado = false;
	}

	@Override
	public String getText() {
		return texto;
	}


	@Override
	public void setText(String text) {
		texto = text;	
	}


	@Override
	public int getLikes() {
		return likes;
	}


	@Override
	public void like() {
		likes++;
	}


	@Override
	public void dislike() {
		if (likes > 0) {
			likes--;
		}
	}


	@Override
	public boolean isFeatured() {
		return destacado;
	}


	@Override
	public void toggleFeatured() {
		if(destacado == true) {
			destacado = false;
		}
		else
			destacado = true;
	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
