package pe.upc.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Videojuego")

public class Videojuego {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  idVideojuego;
	private String  nomVideojuego;
	private String  tipoVideojuego;
	private int  competidoresV;
	public int getIdVideojuego() {
		return idVideojuego;
	}
	public void setIdVideojuego(int idVideojuego) {
		this.idVideojuego = idVideojuego;
	}
	public String getNomVideojuego() {
		return nomVideojuego;
	}
	public void setNomVideojuego(String nomVideojuego) {
		this.nomVideojuego = nomVideojuego;
	}
	public String getTipoVideojuego() {
		return tipoVideojuego;
	}
	public void setTipoVideojuego(String tipoVideojuego) {
		this.tipoVideojuego = tipoVideojuego;
	}
	public int getCompetidoresV() {
		return competidoresV;
	}
	public void setCompetidoresV(int competidoresV) {
		this.competidoresV = competidoresV;
	}
	
	
	
}
