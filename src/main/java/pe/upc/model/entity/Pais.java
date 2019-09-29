package pe.upc.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Pais")

public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  idPais;
	
	private String nomPais;
	
	@ManyToOne
	@JoinColumn(name="idRegion", nullable=false)
	private Region IDRegion;
	
	public Region getIDRegion() {
		return IDRegion;
	}
	public void setIDRegion(Region iDRegion) {
		IDRegion = iDRegion;
	}
	public int getIdPais() {
		return idPais;
	}
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}
	public String getNomPais() {
		return nomPais;
	}
	public void setNomPais(String nomPais) {
		this.nomPais = nomPais;
	}
	
	
	
	
}
