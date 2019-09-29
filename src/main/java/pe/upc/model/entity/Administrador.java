package pe.upc.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Administrador")

public class Administrador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  idAdministrador;
	private String nomAdministrador;
	private String claveAdministrador;
	private String emailAdministrador;
	public int getIdAdministrador() {
		return idAdministrador;
	}
	public void setIdAdministrador(int idAdministrador) {
		this.idAdministrador = idAdministrador;
	}
	public String getNomAdministrador() {
		return nomAdministrador;
	}
	public void setNomAdministrador(String nomAdministrador) {
		this.nomAdministrador = nomAdministrador;
	}
	public String getClaveAdministrador() {
		return claveAdministrador;
	}
	public void setClaveAdministrador(String claveAdministrador) {
		this.claveAdministrador = claveAdministrador;
	}
	public String getEmailAdministrador() {
		return emailAdministrador;
	}
	public void setEmailAdministrador(String emailAdministrador) {
		this.emailAdministrador = emailAdministrador;
	}
		
}
