package pe.upc.model.repository;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.Usuario;

public class UsuarioRepository implements Serializable {
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "nangoPU")
	private EntityManager em;

	public int insert(Usuario usuario) throws Exception {
		em.persist(usuario);
		return usuario.getIdUsuario();
	}

	public int update(Usuario usuario) throws Exception {
		em.merge(usuario);
		return usuario.getIdUsuario();
	}

	public List<Usuario> findAll() throws Exception {
		List<Usuario> usuarios = new ArrayList<>();

		TypedQuery<Usuario> query = em.createQuery("FROM Usuario u", Usuario.class);
		usuarios = query.getResultList();

		return usuarios;
	}

	public List<Usuario> findById(int id) throws Exception {
		List<Usuario> usuarios = new ArrayList<>();

		TypedQuery<Usuario> query = em.createQuery("FROM Usuario u WHERE u.idUsuario LIKE ?1", Usuario.class);
		query.setParameter(1, "%" + id + "%");
		usuarios = query.getResultList();

		return usuarios;
	}

	public List<Usuario> findByCorreo(String correo) throws Exception {
		List<Usuario> usuarios = new ArrayList<>();

		TypedQuery<Usuario> query = em.createQuery("FROM Usuario u WHERE u.emailUsuario LIKE ?1", Usuario.class);
		query.setParameter(1, "%" + correo + "%");
		usuarios = query.getResultList();

		return usuarios;
	}
	
}
