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
@Table(name = "SolicitudTorneo")


public class SolicitudTorneo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  idSolicitudTorneo;
	
	@ManyToOne
	@JoinColumn(name="idTorneo", nullable=false)
	private Torneo IDTorneo;
	
	private Date fechaSolicitud;
	
	@ManyToOne
	@JoinColumn(name="idUsuario", nullable=false)
	private Usuario IDUsuario;
	
	private String estadoSolicitud;
	
	@ManyToOne
	@JoinColumn(name="idAdministrador", nullable=false)
	private Administrador IDAdministrador;
	
	private String mensaje;

	public int getIdSolicitudTorneo() {
		return idSolicitudTorneo;
	}

	public void setIdSolicitudTorneo(int idSolicitudTorneo) {
		this.idSolicitudTorneo = idSolicitudTorneo;
	}

	public Torneo getIDTorneo() {
		return IDTorneo;
	}

	public void setIDTorneo(Torneo iDTorneo) {
		IDTorneo = iDTorneo;
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public Usuario getIDUsuario() {
		return IDUsuario;
	}

	public void setIDUsuario(Usuario iDUsuario) {
		IDUsuario = iDUsuario;
	}

	public String getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public Administrador getIDAdministrador() {
		return IDAdministrador;
	}

	public void setIDAdministrador(Administrador iDAdministrador) {
		IDAdministrador = iDAdministrador;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	
}
