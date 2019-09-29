package pe.upc.model.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "InscripcionTorneo")

public class InscripcionTorneo {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  idInscripcionTorneo;

	@ManyToOne
	@JoinColumn
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn
	private Torneo torneo;
	
	private Date fechaInscripcionTorneo;

	public int getIdInscripcionTorneo() {
		return idInscripcionTorneo;
	}

	public void setIdInscripcionTorneo(int idInscripcionTorneo) {
		this.idInscripcionTorneo = idInscripcionTorneo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Torneo getTorneo() {
		return torneo;
	}

	public void setTorneo(Torneo torneo) {
		this.torneo = torneo;
	}

	public Date getFechaInscripcionTorneo() {
		return fechaInscripcionTorneo;
	}

	public void setFechaInscripcionTorneo(Date fechaInscripcionTorneo) {
		this.fechaInscripcionTorneo = fechaInscripcionTorneo;
	}
	
}
