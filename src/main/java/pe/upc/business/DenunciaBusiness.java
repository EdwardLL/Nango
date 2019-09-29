package pe.upc.business;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.upc.model.entity.Denuncia;
import pe.upc.model.repository.DenunciaRepository;

@Named
public class DenunciaBusiness implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private DenunciaRepository denunciaRepository;

	@Transactional
	public int insert(Denuncia denuncia) throws Exception {
		return denunciaRepository.insert(denuncia);
	}

	
	@Transactional
	public int update(Denuncia denuncia) throws Exception{
		return denunciaRepository.update(denuncia);
	}
	
	
	public List<Denuncia> getAll() throws Exception {
		return denunciaRepository.findAll();
	}
	
	
	public List<Denuncia> getAllById(int num) throws Exception{
		return denunciaRepository.findByIdUsuario(num);
	}
	
}
