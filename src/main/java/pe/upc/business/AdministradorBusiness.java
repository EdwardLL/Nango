package pe.upc.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.model.entity.Administrador;
import pe.upc.model.repository.AdministradorRepository;;

@Named

public class AdministradorBusiness implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private AdministradorRepository administradorRepository;

	
	public List<Administrador> getAll() throws Exception {
		return administradorRepository.findALL();
	}
	
}
