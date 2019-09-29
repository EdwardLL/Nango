package pe.upc.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Torneo")

public class Torneo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  idTorneo;
	private String titulo;
	private Date fechaTorneo;
	private int costoTorneo;
	private String premio;
	private String plataforma;
	private int vacantes;
	private String estadoCreacion;
	private String Modo;
	
	@ManyToOne
	@JoinColumn(name="idServers", nullable=false)
	private Servers IDServers;

	@ManyToOne
	@JoinColumn(name="idVideojuego", nullable=false)
	private Videojuego IDVideojuego ;
	
	private String estadoTranscurso;
	
	@OneToMany (mappedBy="torneo", cascade=CascadeType.ALL)
	private Set<InscripcionTorneo> inscripciontorneo;

	public Set<InscripcionTorneo> getInscripciontorneo() {
		return inscripciontorneo;
	}

	public void setInscripciontorneo(Set<InscripcionTorneo> inscripciontorneo) {
		this.inscripciontorneo = inscripciontorneo;
	}

	public int getIdTorneo() {
		return idTorneo;
	}

	public void setIdTorneo(int idTorneo) {
		this.idTorneo = idTorneo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaTorneo() {
		return fechaTorneo;
	}

	public void setFechaTorneo(Date fechaTorneo) {
		this.fechaTorneo = fechaTorneo;
	}

	public int getCostoTorneo() {
		return costoTorneo;
	}

	public void setCostoTorneo(int costoTorneo) {
		this.costoTorneo = costoTorneo;
	}

	public String getPremio() {
		return premio;
	}

	public void setPremio(String premio) {
		this.premio = premio;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public int getVacantes() {
		return vacantes;
	}

	public void setVacantes(int vacantes) {
		this.vacantes = vacantes;
	}

	public String getEstadoCreacion() {
		return estadoCreacion;
	}

	public void setEstadoCreacion(String estadoCreacion) {
		this.estadoCreacion = estadoCreacion;
	}

	
	public Servers getIDServers() {
		return IDServers;
	}

	public void setIDServers(Servers iDServers) {
		IDServers = iDServers;
	}

	public Videojuego getIDVideojuego() {
		return IDVideojuego;
	}

	public void setIDVideojuego(Videojuego iDVideojuego) {
		IDVideojuego = iDVideojuego;
	}

	public String getEstadoTranscurso() {
		return estadoTranscurso;
	}

	public void setEstadoTranscurso(String estadoTranscurso) {
		this.estadoTranscurso = estadoTranscurso;
	}

	public String getModo() {
		return Modo;
	}

	public void setModo(String modo) {
		Modo = modo;
	}
	
	
	
}
