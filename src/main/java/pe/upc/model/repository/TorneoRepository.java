package pe.upc.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.Torneo;

import java.util.Date;
@Named
public class TorneoRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "nangoPU")
	private EntityManager em;

	public int insert(Torneo torneo) throws Exception {
		em.persist(torneo);
		return torneo.getIdTorneo();
	}

	public int update(Torneo torneo) throws Exception {
		em.merge(torneo);
		return torneo.getIdTorneo();
	}

	public List<Torneo> findAll() throws Exception {
		List<Torneo> products = new ArrayList<>();

		TypedQuery<Torneo> query = em.createQuery("FROM Torneo p", Torneo.class);
		products = query.getResultList();

		return products;
	}

	public List<Torneo> findById(int id) throws Exception {
		List<Torneo> torneos = new ArrayList<>();

		TypedQuery<Torneo> query = em.createQuery("FROM Torneo t WHERE t.idTorneo LIKE ?1", Torneo.class);
		query.setParameter(1, "%" + id + "%");
		torneos = query.getResultList();

		return torneos;
	}
	public List<Torneo> findByServer(int server) throws Exception {
		List<Torneo> torneos = new ArrayList<>();

		TypedQuery<Torneo> query = em.createQuery("FROM Torneo t WHERE t.IDServers LIKE ?1", Torneo.class);
		query.setParameter(1, "%" + server + "%");
		torneos = query.getResultList();

		return torneos;
	}
	
	public List<Torneo> findByModo(String modo) throws Exception {
		List<Torneo> torneos = new ArrayList<>();

		TypedQuery<Torneo> query = em.createQuery("FROM Torneo t WHERE t.Modo LIKE ?1", Torneo.class);
		query.setParameter(1, "%" + modo + "%");
		torneos = query.getResultList();

		return torneos;
	}
	
	public List<Torneo> findByFecha(Date fecha) throws Exception {
		List<Torneo> torneos = new ArrayList<>();

		TypedQuery<Torneo> query = em.createQuery("FROM Torneo t WHERE t.fechaTorneo LIKE ?1", Torneo.class);
		query.setParameter(1, "%" + fecha + "%");
		torneos = query.getResultList();

		return torneos;
	}
	
}
