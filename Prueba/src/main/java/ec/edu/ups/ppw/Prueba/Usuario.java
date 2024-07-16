package ec.edu.ups.ppw.Prueba;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="TBL_USUARIO")
@Entity
public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="usu_id")
private int Usuarioid;

@Column(name="usu_nombre")
private String Nombre;

@Column(name="usu_apeliido")
private String Apellido;

@Column(name="usu_direccion")
private String Direccion;

@Column(name="usu_consumo")
private String Consumo;

@Column(name="usu_consumo")
private String Deuda;

public int getUsuarioid() {
	return Usuarioid;
}

public void setUsuarioid(int usuarioid) {
	Usuarioid = usuarioid;
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public String getApellido() {
	return Apellido;
}

public void setApellido(String apellido) {
	Apellido = apellido;
}

public String getDireccion() {
	return Direccion;
}

public void setDireccion(String direccion) {
	Direccion = direccion;
}

public String getConsumo() {
	return Consumo;
}

public void setConsumo(String consumo) {
	Consumo = consumo;
}

public String getDeuda() {
	return Deuda;
}

public void setDeuda(String deuda) {
	Deuda = deuda;
}



}
