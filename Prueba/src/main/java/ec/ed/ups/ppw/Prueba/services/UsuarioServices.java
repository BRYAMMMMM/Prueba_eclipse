package ec.ed.ups.ppw.Prueba.services;

import ec.edu.ups.ppw.Prueba.Usuario;
import ec.edu.ups.ppw.Prueba.model.GestionUsuario;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/usuario")
public class UsuarioServices {
	@Inject
	private GestionUsuario gUsuario;
	
	@POST
	@Produces("application/json")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(Usuario libro) {
		try {
			gUsuario.createUsuario(libro);
			return Response.ok(libro).build();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return Response.status(503).entity(new Respuesta(Respuesta.ERROR, "Error en BD")).build();
		}
	}
}

