package pe.upc.model.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.Videojuego;;

public class VideojuegoRepository implements Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="nangoPU")
	private EntityManager em;
	
	public int update(Videojuego videojuego) throws Exception {
		em.merge(videojuego);
		return videojuego.getIdVideojuego();
	}
	
   public List<Videojuego> findALL() throws Exception{
	   List<Videojuego> videojuegos= new ArrayList<>();
	   TypedQuery<Videojuego> query = em.createQuery("SELECT v FROM Videojuego v", Videojuego.class);
	   videojuegos = query.getResultList();
		return videojuegos;
   }
	
}
