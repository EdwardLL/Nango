
package pe.upc.model.repository;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.InscripcionTorneo;

@Named
public class InscripcionTorneoRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "nangoPU")
	private EntityManager em;

	public int insert(InscripcionTorneo i_t) throws Exception {
		em.persist(i_t);
		return i_t.getIdInscripcionTorneo();
	}

	public int update(InscripcionTorneo i_t) throws Exception {
		em.merge(i_t);
		return i_t.getIdInscripcionTorneo();
	}

	public List<InscripcionTorneo> findAll() throws Exception {
		List<InscripcionTorneo> i_ts = new ArrayList<>();

		TypedQuery<InscripcionTorneo> query = em.createQuery("FROM InscripcionTorneo i_t", InscripcionTorneo.class);
		i_ts = query.getResultList();

		return i_ts;
	}

	public List<InscripcionTorneo> findById(int solicitudT) throws Exception {
		List<InscripcionTorneo> i_ts = new ArrayList<>();

		TypedQuery<InscripcionTorneo> query = em.createQuery("FROM InscripcionTorneo i_t WHERE i_t.idInscripcionTorneo LIKE ?1", InscripcionTorneo.class);
		query.setParameter(1, "%" + solicitudT + "%");
		i_ts = query.getResultList();

		return i_ts;
	}
	
}

