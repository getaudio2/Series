package series;

import java.util.ArrayList;

public class Temporada {
	
	private int numero;
	private ArrayList<Capitulo> capitulos;
	private Serie serie;
	
	//Problema 7
	public String listaCapitulos() {
		StringBuffer sb = new StringBuffer();
		for(Capitulo cap: capitulos) {
			sb.append(this.serie.getTitulo()+"T"+this.numero+"C"+cap.getNum());
		}
		return sb.toString();
	}
	
	//Problema 9
	public boolean addCapitulo(Capitulo c) {
		boolean ok;
		if (!capitulos.contains(c)) {//se debe definir equals en capitulo
			capitulos.add(c);
			ok=true;
		} else {
			ok=false;
		}
		return ok;
	}
	public String ListaCapitulos() {
		String res = "";
		for (Capitulo capitulo:capitulos) {
			res += capitulo; //se debe implementar la clase toString() de capitulo
		}
		return res;
	}
	
	public Temporada(int numero, Serie serie) {
		this.numero = numero;
		this.capitulos = new ArrayList<Capitulo>();
		this.serie = serie;
	}

	public Temporada() {
		this.capitulos = new ArrayList<Capitulo>();
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	public int getDuracion() {
		int total=0;
		for(Capitulo capitulo:capitulos) {
			total = total+getDuracion();
		}
		return total;
	}
	
	
}
