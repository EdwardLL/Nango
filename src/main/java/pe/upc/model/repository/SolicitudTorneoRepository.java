package pe.upc.model.repository;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.SolicitudTorneo;;

@Named
public class SolicitudTorneoRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "nangoPU")
	private EntityManager em;

	public int insert(SolicitudTorneo product) throws Exception {
		em.persist(product);
		return product.getIdSolicitudTorneo();
	}

	public int update(SolicitudTorneo product) throws Exception {
		em.merge(product);
		return product.getIdSolicitudTorneo();
	}

	public List<SolicitudTorneo> findAll() throws Exception {
		List<SolicitudTorneo> products = new ArrayList<>();

		TypedQuery<SolicitudTorneo> query = em.createQuery("FROM SolicitudTorneo st", SolicitudTorneo.class);
		products = query.getResultList();

		return products;
	}

	public List<SolicitudTorneo> findById(int solicitudT) throws Exception {
		List<SolicitudTorneo> solicitudtorneos = new ArrayList<>();

		TypedQuery<SolicitudTorneo> query = em.createQuery("FROM SolicitudTorneo st WHERE st.idSolicitudTorneo LIKE ?1", SolicitudTorneo.class);
		query.setParameter(1, "%" + solicitudT + "%");
		solicitudtorneos = query.getResultList();

		return solicitudtorneos;
	}
	
}
