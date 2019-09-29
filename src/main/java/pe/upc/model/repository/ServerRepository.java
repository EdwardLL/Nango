package pe.upc.model.repository;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.Servers;

public class ServerRepository implements Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="nangoPU")
	private EntityManager em;
	
   public List<Servers> findALL() throws Exception{
	   List<Servers> servidores= new ArrayList<>();
	   TypedQuery<Servers> query = em.createQuery("SELECT s FROM Servers s", Servers.class);
	   servidores = query.getResultList();
		return servidores;
   }
}
