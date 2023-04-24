package tp06.ejercicio4;

import tp06.ejercicio3.*;
import tp02.ejercicio2.*;

public class Recorridos<T> {

	public ListaGenerica<T> dfs (Grafo<T> g){
		boolean marca[] = new boolean [g.listaDeVertices().tamanio()+1];
		ListaGenerica<VerticeImplListAdy<T>> recorrido = new ListaEnlazadaGenerica<VerticeImplListAdy<T>>();
			for (int i=1; i <g.listaDeVertices().tamanio(); i++) {
				if (!marca[i]) {
					Rdfs(g,marca,i,recorrido);
			}
			
		}
		
		return null;
	}
	
	private void Rdfs(Grafo<T> g, boolean[] marca, int origen, ListaGenerica<VerticeImplListAdy<T>> recorrido ) {
		marca[origen]=true;
		recorrido.agregarFinal((VerticeImplListAdy<T>)g.vetice(origen));
		ListaGenerica<Arista<T>> ady = ((VerticeImplListAdy<T>)g.vetice(origen)).obtenerAdyacentes();
		ady.comenzar();
		while (!ady.fin()) {
			int a = ady.proximo().verticeDestino().getPosicion();
			if(!marca[a]) {
				Rdfs(g,marca,a,recorrido);
			}
		}
	}
}
