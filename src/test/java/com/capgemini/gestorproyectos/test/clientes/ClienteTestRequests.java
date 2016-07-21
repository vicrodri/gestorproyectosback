/**
 * Constantes JSON con los mensajes MOCK de entrada
 */
package com.capgemini.gestorproyectos.test.clientes;

/**
 * @author capgemini
 *
 */
public class ClienteTestRequests {

	public static final String JSON_VACIO = "{}";
	
	public static final String JSON_FILTRO_NOMBRE = "{\"nombre\":\"MAPFRE\"}";
	public static final String JSON_FILTRO_DESCRIPCION = "{\"descripcion\":\"XA DESC\"}";
	public static final String JSON_FILTRO_ID = "{\"id\":3}";
		
	public static final String JSON_CREAR_CLIENTE = "{\"nombre\":\"JUNIT\", \"descripcion\":\"JUNIT DESC\"}";
	public static final String JSON_CREAR_CLIENTE_VALIDAR = "{\"descripcion\":\"XA DESC\"}";
	
	public static final String JSON_ACTUALIZAR_CLIENTE = "{\"id\":\"2\", \"nombre\":\"JUNIT UPDT\", \"descripcion\":\"JUNIT DESC\"}";
	public static final String JSON_ACTUALIZAR_CLIENTE_VALIDAR = "{\"descripcion\":\"XA DESC\"}";

	public static final String JSON_ELIMINAR_CLIENTE = "{\"id\":\"4\"}";
	
	public static final String JSON_PRUEBA= "{\"fechaInicio\": \"01/01/2015\"}";	
}
