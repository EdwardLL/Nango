package pe.upc.business;

import java.io.Serializable;
import java.util.List;
import java.util.Date;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.upc.model.entity.Torneo;
import pe.upc.model.repository.TorneoRepository;

@Named
public class TorneoBusiness implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Inject
	private TorneoRepository torneoRepository;

	@Transactional
	public int insert(Torneo torneo) throws Exception {
		return torneoRepository.insert(torneo);
	}

	
	@Transactional
	public int update(Torneo torneo) throws Exception{
		return torneoRepository.update(torneo);
	}
	
	
	public List<Torneo> getAll() throws Exception {
		return torneoRepository.findAll();
	}
	
	public List<Torneo> getAllById(int id) throws Exception {
		return torneoRepository.findById(id);
	}
	
	public List<Torneo> getAllByServer(int server) throws Exception {
		return torneoRepository.findByServer(server);
	}

	public List<Torneo> getAllByModo(String modo) throws Exception {
		return torneoRepository.findByModo(modo);
	}

	public List<Torneo> getAllByFecha(Date fecha) throws Exception {
		return torneoRepository.findByFecha(fecha);
	}
}
