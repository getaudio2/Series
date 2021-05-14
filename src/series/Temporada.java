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
	public boolean addCapitulo(Capitulo capitulo) {
		if (!capitulos.contains(capitulo)) {
			capitulos.add(capitulo);
			return true;
		}else
			return true;
	}
	public String ListaCapitulos() {
		String res = "";
		for (Capitulo capitulo:capitulos) {
			res += capitulo; //se debe implementar la clase toString() de capitulo
		}
		return res;
	}
	//Problema 5
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
			total = total+ capitulo.getDuracion();
		}
		return total;
	}
	@Override
	public String toString() {
		String res= "Serie [titulo=" + this.serie.getTitulo() + " ]\n";
		for(Temporada temporada: this.serie.getTemporadas())
			res=res+temporada;
		return res;
	}
	
	public ArrayList<Capitulo> getCapitulos() {
		return capitulos;
	}
	
	
}
