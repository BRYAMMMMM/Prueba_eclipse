package ec.edu.ups.ppw.Prueba.dao;

import java.util.List;

import ec.edu.ups.ppw.Prueba.Usuario;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class UsuarioDAO {
	@PersistenceContext
	private EntityManager em;
	public void insert(Usuario usuario) {
		em.persist(usuario);
	}
	public void update(Usuario usuario) {
		em.merge(usuario);
	}
	
	public Usuario read(int id) throws Exception{
		Usuario usuario = em.find(Usuario.class, id);
	    if (usuario == null) {
	        throw new Exception("Usuario con id " + id + " no encontrado.");
	    }
	    return usuario;
	}
	
	public List<Usuario> getAll(){
		String jpql = "SELECT l FROM Usuario l";
		Query query = em.createQuery(jpql, Usuario.class);
		return query.getResultList();
	}
}
