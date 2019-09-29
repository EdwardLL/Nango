package pe.upc.business;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.upc.model.entity.Videojuego;
import pe.upc.model.repository.VideojuegoRepository;

@Named
public class VideojuegoBusiness implements Serializable{

    private static final long serialVersionUID = 1L;
	
	@Inject
	private VideojuegoRepository videojuegoRepository;

	
	@Transactional
	public int update(Videojuego videojuego) throws Exception{
		return videojuegoRepository.update(videojuego);
	}
	
	
	public List<Videojuego> getAll() throws Exception {
		return videojuegoRepository.findALL();
	}
	
	
}
