package pe.upc.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.upc.model.entity.SolicitudTorneo;
import pe.upc.model.repository.SolicitudTorneoRepository;

@Named
public class SolicitudTorneoBusiness implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Inject
	private SolicitudTorneoRepository solicitudTorneo;

	@Transactional
	public int insert(SolicitudTorneo solicitudtorneo) throws Exception {
		return solicitudTorneo.insert(solicitudtorneo);
	}

	
	@Transactional
	public int update(SolicitudTorneo solicitudtorneo) throws Exception{
		return solicitudTorneo.update(solicitudtorneo);
	}
	
	
	public List<SolicitudTorneo> getAll() throws Exception {
		return solicitudTorneo.findAll();
	}
	
	
	public List<SolicitudTorneo> getAllById(int solicitudT) throws Exception{
		return solicitudTorneo.findById(solicitudT);
	}
	
}
