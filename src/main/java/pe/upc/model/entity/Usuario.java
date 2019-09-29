package pe.upc.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;
import java.util.Set;
@Entity
@Table(name = "Usuario")

public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  idUsuario;
	
	private String nickUsuario;
	private String claveUsuario;
	private String estadoUsuario;
	private String emailUsuario;
	private Date fechaNacimiento;
	private int saldo;
	private String insigniaUsuario;
	
	@ManyToOne
	@JoinColumn(name="idPais", nullable=false)
	private Pais paisUsuario;

	@OneToMany (mappedBy="usuario", cascade=CascadeType.ALL)
	private Set<InscripcionTorneo> inscripciontorneo;
	
	public Set<InscripcionTorneo> getInscripciontorneo() {
		return inscripciontorneo;
	}

	public void setInscripciontorneo(Set<InscripcionTorneo> inscripciontorneo) {
		this.inscripciontorneo = inscripciontorneo;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNickUsuario() {
		return nickUsuario;
	}

	public void setNickUsuario(String nickUsuario) {
		this.nickUsuario = nickUsuario;
	}

	public String getClaveUsuario() {
		return claveUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}

	public String getEstadoUsuario() {
		return estadoUsuario;
	}

	public void setEstadoUsuario(String estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getInsigniaUsuario() {
		return insigniaUsuario;
	}

	public void setInsigniaUsuario(String insigniaUsuario) {
		this.insigniaUsuario = insigniaUsuario;
	}

	public Pais getPaisUsuario() {
		return paisUsuario;
	}

	public void setPaisUsuario(Pais paisUsuario) {
		this.paisUsuario = paisUsuario;
	}
	
	
	
}
