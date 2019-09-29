package pe.upc.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.Denuncia;

@Named

public class DenunciaRepository implements Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "nangoPU")
	private EntityManager em;

	public int insert(Denuncia denuncia) throws Exception {
		em.persist(denuncia);
		return denuncia.getIdDenuncia();
	}

	public int update(Denuncia denuncia) throws Exception {
		em.merge(denuncia);
		return denuncia.getIdDenuncia();
	}

	public List<Denuncia> findAll() throws Exception {
		List<Denuncia> products = new ArrayList<>();

		TypedQuery<Denuncia> query = em.createQuery("FROM Denuncia d", Denuncia.class);
		products = query.getResultList();

		return products;
	}

	public List<Denuncia> findByIdUsuario(int num) throws Exception {
		List<Denuncia> denuncias = new ArrayList<>();

		TypedQuery<Denuncia> query = em.createQuery("FROM Denuncia d WHERE d.IDUsuario LIKE ?1", Denuncia.class);
		query.setParameter(1, "%" + num + "%");
		denuncias = query.getResultList();
		return denuncias;
	}
	

}
