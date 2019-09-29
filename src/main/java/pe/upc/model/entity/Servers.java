package pe.upc.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Servers")

public class Servers {

	
    @Id
	private int idServers;
	private String NombreServers;
	
	@ManyToOne
	@JoinColumn(name = "idPais", nullable = false)
	private Pais IDPais;

	public int getIdServers() {
		return idServers;
	}

	public void setIdServers(int idServers) {
		this.idServers = idServers;
	}

	public String getNombreServers() {
		return NombreServers;
	}

	public void setNombreServers(String nombreServers) {
		NombreServers = nombreServers;
	}

	public Pais getIDPais() {
		return IDPais;
	}

	public void setIDPais(Pais iDPais) {
		IDPais = iDPais;
	}

	


}
