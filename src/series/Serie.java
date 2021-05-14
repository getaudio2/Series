package series;

import java.util.ArrayList;

public class Serie{
	
	private String titulo;
	private ArrayList<Temporada> temporadas;
	
	//funcion getDuracionSerie sin refactoring
	public int getDuracionSerie() {
		int total=0;
		for(Temporada temporada:temporadas) {
			ArrayList<Capitulo> capitulos = temporada.getCapitulos();
			for(Capitulo capitulo:capitulos) {
				total = total + capitulo.getDuracion();
			}
		}
		return total;
	}
	
	public int getDuracionSerieCon() {
		int total=0;
		for(Temporada temporada:temporadas) {
			total = total + temporada.getDuracion();
		}
		return total;
	}
	
	public Serie(String titulo, ArrayList<Temporada> temporadas) {
		this.titulo = titulo;
		this.temporadas = temporadas;
	}
	public Serie(String titulo) {
		this.titulo = titulo;
		this.temporadas = new ArrayList<Temporada>();
	}
	public Serie() {
		this.temporadas = new ArrayList<Temporada>();
	}

	public boolean addTemporada(Temporada temporada) {
		if (!temporadas.contains(temporada)) {
			temporadas.add(temporada);
			return true;
		}else {
			return false;
		}
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}
}
