package pe.upc.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.upc.model.entity.InscripcionTorneo;
import pe.upc.model.repository.InscripcionTorneoRepository;

@Named
public class InscripcionTorneoBusiness implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Inject
	private InscripcionTorneoRepository inscripcionTorneo;

	@Transactional
	public int insert(InscripcionTorneo inscripTorneo) throws Exception {
		return inscripcionTorneo.insert(inscripTorneo);
	}

	
	@Transactional
	public int update(InscripcionTorneo inscripTorneo) throws Exception{
		return inscripcionTorneo.update(inscripTorneo);
	}
	
	
	public List<InscripcionTorneo> getAll() throws Exception {
		return inscripcionTorneo.findAll();
	}
	
	
	public List<InscripcionTorneo> getAllById(int inscripcionT) throws Exception{
		return inscripcionTorneo.findById(inscripcionT);
	}
	
}
