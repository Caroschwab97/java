package tp06.ejercicio4;
import tp06.ejercicio3.*;
import tp02.ejercicio2.*;
public class Mapa {

	private Grafo<String> mapaCiudades;
	private int totalTanque;
	
	public Mapa () {
		mapaCiudades = new GrafoImplListAdy<String>();
		this.totalTanque = 0;
	}
	
	private int encontrarComienzo (String C1) {
		ListaGenerica<Vertice<String>> lista = mapaCiudades.listaDeVertices();
		for (int i=1; i<lista.tamanio(); i++) {
			if (lista.elemento(i).dato().equals(C1)) {
				return i;
			}
		}
		return 0;
	}
	
	public ListaGenerica<String> devolverCamino (String C1, String C2){
		boolean [] marca = new boolean [mapaCiudades.listaDeVertices().tamanio()+1];
		ListaGenerica<String> camino = new ListaEnlazadaGenerica<String>();
		camino.comenzar();
		int origen = encontrarComienzo (C1);
		this.dfs(marca, camino, origen, C2);
		return camino;
	}
	
	private boolean dfs (boolean[] marca, ListaGenerica<String> camino, int origen, String C2) {
		boolean corte=false;
		
		marca[origen]=true;
		camino.agregarFinal(mapaCiudades.vetice(origen).dato());
		
		if (!mapaCiudades.vetice(origen).dato().equals(C2)) {
			ListaGenerica<Arista<String>> ady = mapaCiudades.listaDeAdyacentes(mapaCiudades.vetice(origen));
			ady.comenzar();
			while ((corte != true) && (!ady.fin())) {
				int a = ady.proximo().verticeDestino().getPosicion();
				if (!marca[a]) {
					corte = dfs (marca,camino,a,C2);
			}
			}
		}
		else 
			return true;
		if (corte = false) {
			marca [origen] = false;
			camino.eliminar(mapaCiudades.vetice(origen).dato());}
		return corte;
			
	}
	
	private void marcar (boolean[] marca,ListaGenerica<String> ciudades) {
		for (int i=1; i<mapaCiudades.listaDeVertices().tamanio();i++) {
			if (ciudades.incluye(mapaCiudades.vetice(i).dato())) {
				marca[i]=true;
			}
		}
	}
	
	public ListaGenerica<String> devolverCaminoExceptuando (String C1, String C2, ListaGenerica<String> ciudades){
		boolean [] marca = new boolean [mapaCiudades.listaDeVertices().tamanio()+1];
		ListaGenerica<String> camino = new ListaEnlazadaGenerica<String>();
		camino.comenzar();
		int origen = encontrarComienzo (C1);
		marcar(marca,ciudades);
		dfs(marca, camino,origen,C2);
		return camino;
	}
	
	public ListaGenerica<String> caminoMasCorto(String C1, String C2){
		boolean [] marca = new boolean [mapaCiudades.listaDeVertices().tamanio()+1];
		ListaGenerica<String> caminoActual = new ListaEnlazadaGenerica<String>();
		caminoActual.comenzar();
		ListaGenerica<String> camino = new ListaEnlazadaGenerica<String>();
		camino.comenzar();
		int origen = this.encontrarComienzo(C1);
		int distancia= 0;
		int distanciaAux=0;
		dfsCU(marca,camino,origen,C2,C1,caminoActual,distanciaAux,distancia);
		return null;
	}
	
	private int dfsCU (boolean[] marca, ListaGenerica<String> camino, int origen, String C1, String C2, ListaGenerica<String> caminoActual,int distanciaAct,int distancia) {
		marca[origen]=true;
		caminoActual.agregarFinal(mapaCiudades.vetice(origen).dato());
		if ((mapaCiudades.vetice(origen).dato().equals(C2)) && ((camino.esVacia())||(distanciaAct<distancia)))  {
			camino.eliminarTodo();
			while (!caminoActual.fin()) {
				camino.agregarFinal(caminoActual.proximo());}
		}
		else {
			ListaGenerica<Arista<String>> ady =mapaCiudades.listaDeAdyacentes(mapaCiudades.vetice(origen));
			ady.comenzar();
			while (!ady.fin()) {
				int a = ady.proximo().verticeDestino().getPosicion();
				distanciaAct += ady.elemento(a).peso();
				if (!marca[a]) {
					distancia=dfsCU(marca,camino,origen,C1,C2,caminoActual,distanciaAct,distancia);
				}
				distancia-=ady.elemento(a).peso();
			}
		}
		marca[origen]=false;
		caminoActual.eliminarEn(origen);	
		return distancia;
	}
	
	private int buscarOrigen (String c1) {
		for (int i = 1; i<mapaCiudades.listaDeVertices().tamanio();i++) {
			if (c1.equals(mapaCiudades.listaDeVertices().elemento(i).dato())) {
				return i;
			}
		}
		return 0;
	}
	
	public ListaGenerica<String> caminoConMenorCargaDeCombustible (String C1, String C2, int tanqueAuto){
		ListaGenerica<String> caminoAux= new ListaEnlazadaGenerica<String>();
		ListaGenerica<String> camino= new ListaEnlazadaGenerica<String>();
		boolean[] marca= new boolean [mapaCiudades.listaDeVertices().tamanio()+1];
		int origen = buscarOrigen(C1);
		int cantCargas =0, cantCargasAux=0, gasolina = this.totalTanque;
		if (origen != 0) {
			dfsmenor(C2, origen, gasolina, marca,caminoAux,camino,cantCargas, cantCargasAux);
		}
		 return null;
	}
	
	private int dfsmenor (String c2, int origen, int gasolina, boolean[] marca, ListaGenerica<String> caminoAux, ListaGenerica<String> camino, int cantCargas, int cantCargasAux ) {
		marca[origen]= true;
		caminoAux.agregarFinal(mapaCiudades.vetice(origen).dato());
		
		if ((mapaCiudades.vetice(origen).dato().equals(c2))&&(!camino.esVacia()) || (cantCargas>cantCargasAux)) {
			camino.eliminarTodo();
			cantCargas=cantCargasAux;
			while (!caminoAux.esVacia()) {
				camino.agregarFinal(caminoAux.proximo());
			}
		}
		else {
			ListaGenerica<Arista<Integer>> ady = new ListaEnlazadaGenerica<>();
			ady.comenzar();
			while (!ady.esVacia()) {
				Arista<Integer> sig = ady.proximo();
				if (!(gasolina- sig.peso() > 0)) {
					gasolina=100;
					cantCargasAux+=1;
				}
				gasolina-=sig.peso();
				cantCargas=dfsmenor(c2,sig.verticeDestino().getPosicion(),gasolina,marca,caminoAux,camino,cantCargas,cantCargasAux);	
			}
			
		}
		
		marca[origen]=false;
		caminoAux.elemento(origen);
		
		return cantCargas;
	}
}

