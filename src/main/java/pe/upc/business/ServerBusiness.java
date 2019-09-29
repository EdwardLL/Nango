package pe.upc.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import pe.upc.model.entity.Servers;
import pe.upc.model.repository.ServerRepository;

@Named
public class ServerBusiness implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ServerRepository serverRepository;

	
	public List<Servers> getAll() throws Exception {
		return serverRepository.findALL();
	}

}
