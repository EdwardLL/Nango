package pe.upc.model.repository;


import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.upc.model.entity.Administrador;


@Named

public class AdministradorRepository implements Serializable{

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName="nangoPU")
	private EntityManager em;
	
   public List<Administrador> findALL() throws Exception{
	   List<Administrador> administradores= new ArrayList<>();
	   TypedQuery<Administrador> query = em.createQuery("SELECT a FROM Administrador a", Administrador.class);
	   administradores = query.getResultList();
		return administradores;
   }
	
}
