package pe.upc.business;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.upc.model.entity.Usuario;
import pe.upc.model.repository.UsuarioRepository;
@Named
public class UsuarioBusiness implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioRepository usuarioRepository;

	@Transactional
	public int insert(Usuario usuario) throws Exception {
		return usuarioRepository.insert(usuario);
	}

	@Transactional
	public int update(Usuario usuario) throws Exception{
		return usuarioRepository.update(usuario);
	}
	
	
	public List<Usuario> getAll() throws Exception {
		return usuarioRepository.findAll();
	}
	
	public List<Usuario> getAllById(int id) throws Exception {
		return usuarioRepository.findById(id);
	}
	
	public List<Usuario> getAllByCorreo(String correo) throws Exception {
		return usuarioRepository.findByCorreo(correo);
	}
	
}
