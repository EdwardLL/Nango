package pe.upc.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;
@Entity
@Table(name = "Denuncia")

public class Denuncia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  idDenuncia;
	
	@ManyToOne
	@JoinColumn(name="idUsuario", nullable=false)
	private Usuario IDUsuario;
	
	private Date fechaDenuncia;
	
	private String motivoDenuncia;

	public int getIdDenuncia() {
		return idDenuncia;
	}

	public void setIdDenuncia(int idDenuncia) {
		this.idDenuncia = idDenuncia;
	}

	public Usuario getIDUsuario() {
		return IDUsuario;
	}

	public void setIDUsuario(Usuario iDUsuario) {
		IDUsuario = iDUsuario;
	}

	public Date getFechaDenuncia() {
		return fechaDenuncia;
	}

	public void setFechaDenuncia(Date fechaDenuncia) {
		this.fechaDenuncia = fechaDenuncia;
	}

	public String getMotivoDenuncia() {
		return motivoDenuncia;
	}

	public void setMotivoDenuncia(String motivoDenuncia) {
		this.motivoDenuncia = motivoDenuncia;
	}
	
	
	
}
