package ec.edu.ups.ppw.Prueba.model;

import ec.edu.ups.ppw.Prueba.Usuario;
import ec.edu.ups.ppw.Prueba.dao.UsuarioDAO;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Startup
@Singleton
public class Inicio {
	@Inject
    private UsuarioDAO daoUsuario;
	
	
    @PostConstruct
    public void init() {
    	Usuario usuario = new Usuario();
    	usuario.setNombre("Bryam");
    	usuario.setApellido("Peralta");
    	usuario.setDireccion("Ricaurte");
    	usuario.setConsumo("Consumo de energia de un mes");
    	usuario.setDeuda("100$");
    	daoUsuario.insert(usuario);
    }
    
	



    
    
}
