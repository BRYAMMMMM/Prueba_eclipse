package ec.edu.ups.ppw.Prueba.model;

import java.util.List;

import ec.edu.ups.ppw.Prueba.Usuario;
import ec.edu.ups.ppw.Prueba.dao.UsuarioDAO;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionUsuario {
	@Inject
	private UsuarioDAO daoUsuario;
	
	public Usuario getUsuario(int id) throws Exception {
		Usuario libro = daoUsuario.read(id);
		if(libro == null)
			throw new Exception("Libro no existe");
		return libro;
	}
	
	public List<Usuario> getUsuario(){
		return daoUsuario.getAll();
	}
	public void updateLibro(Usuario libro) throws Exception{
		if(libro.getUsuarioid() < 0) {
			throw new Exception("Id Incorrecta");
		}
		daoUsuario.update(libro);
	}
	public void createUsuario(Usuario usuario) throws Exception {
		if(usuario.getUsuarioid() < 0) {
			throw new Exception("Id Incorrecto");
		}
		daoUsuario.insert(usuario);
	}
	
}
