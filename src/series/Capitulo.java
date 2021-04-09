package series;

import java.util.ArrayList;

public class Capitulo {
	
	protected int duration;
	public final int DURACION;
	private ArrayList<Personaje> personajes;
	protected Temporada temporada;
	private int num;
	
	public Capitulo(Temporada temporada, int num) {
		this.temporada = temporada;
		this.num = num;
		this.personajes = new ArrayList<Personaje>();
		this.DURACION = 45;
	}
	
	public Capitulo() {
		this.personajes = new ArrayList<Personaje>();
		this.DURACION = 45;
	}
	
	//Problema 6 
	public String listaPersonajes() {
		StringBuffer sb = new StringBuffer();
		for(Personaje per:personajes) {
			sb.append(per+"\n");
		}
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + DURACION;
		result = prime * result + duration;
		result = prime * result + num;
		result = prime * result + ((personajes == null) ? 0 : personajes.hashCode());
		result = prime * result + ((temporada == null) ? 0 : temporada.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Capitulo other = (Capitulo) obj;
		if (DURACION != other.DURACION)
			return false;
		if (duration != other.duration)
			return false;
		if (num != other.num)
			return false;
		if (personajes == null) {
			if (other.personajes != null)
				return false;
		} else if (!personajes.equals(other.personajes))
			return false;
		if (temporada == null) {
			if (other.temporada != null)
				return false;
		} else if (!temporada.equals(other.temporada))
			return false;
		return true;
	}
	
	
}
