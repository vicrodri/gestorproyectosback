/**
 * 
 */
package com.capgemini.gestorproyectos.test.clientes;

import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author vicrodri
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"/conf/spring-test-config.xml","/conf/application-config.xml"})
@WebAppConfiguration
public class ClienteControllerTest {

	@Autowired
	WebApplicationContext wac;
	
	MockMvc mockMvc;
	
	@Before
    public void setUp() {
		 this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}
	/**
	 * Test method for {@link com.capgemini.gestorproyectos.controller.ClienteController#obtenerClientes(com.capgemini.gestorproyectos.model.ClienteDTO)}.
	 */
	@Test
	public final void testObtenerClientes() {
		try {
			this.mockMvc.perform(post("/rest/cliente/obtenerClientes").contentType(MediaType.APPLICATION_JSON)
				.content(ClienteTestRequests.JSON_VACIO)).andExpect(status().isOk()).andDo(print());
		} catch (Exception e) {
			fail("Error en el servicio: " + e);
		}
	}
	/**
	 * Test method for {@link com.capgemini.gestorproyectos.controller.ClienteController#obtenerClientes(com.capgemini.gestorproyectos.model.ClienteDTO)}.
	 */
	@Test
	public final void testObtenerClientesFiltros() {
		try {
			this.mockMvc.perform(post("/rest/cliente/obtenerClientes").contentType(MediaType.APPLICATION_JSON)
				.content(ClienteTestRequests.JSON_FILTRO_NOMBRE)).andExpect(status().isOk()).andDo(print());
			
			this.mockMvc.perform(post("/rest/cliente/obtenerClientes").contentType(MediaType.APPLICATION_JSON)
				.content(ClienteTestRequests.JSON_FILTRO_DESCRIPCION)).andExpect(status().isOk()).andDo(print());
			
			this.mockMvc.perform(post("/rest/cliente/obtenerClientes").contentType(MediaType.APPLICATION_JSON)
				.content(ClienteTestRequests.JSON_FILTRO_ID)).andExpect(status().isOk()).andDo(print());
		} catch (Exception e) {
			fail("Error en el servicio: " + e);
		}
	}
	
	/**
	 * Test method for {@link com.capgemini.gestorproyectos.controller.ClienteController#crearCliente(com.capgemini.gestorproyectos.model.ClienteDTO)}.
	 */
	@Test
	public final void testCrearCliente() {
		try {
			this.mockMvc.perform(post("/rest/cliente/crearCliente").contentType(MediaType.APPLICATION_JSON)
				 .content(ClienteTestRequests.JSON_CREAR_CLIENTE)).andExpect(status().isCreated()).andDo(print());
		} catch (Exception e) {
			fail("Error en el servicio: " + e);
		}
	}
	
	/**
	 * Test method for {@link com.capgemini.gestorproyectos.controller.ClienteController#crearCliente(com.capgemini.gestorproyectos.model.ClienteDTO)}.
	 */
	@Test
	public final void testValidacionCrearCliente() {
		try {
		 this.mockMvc.perform(post("/rest/cliente/crearCliente").contentType(MediaType.APPLICATION_JSON)
				 .content(ClienteTestRequests.JSON_CREAR_CLIENTE_VALIDAR)).andExpect(status().isBadRequest()).andDo(print());
		} catch (Exception e) {
			fail("Error en el servicio: " + e);
		}
	}

	/**
	 * Test method for {@link com.capgemini.gestorproyectos.controller.ClienteController#actualizarCliente(com.capgemini.gestorproyectos.model.ClienteDTO)}.
	 */
	@Test
	public final void testActualizarCliente() {
		try {
		 this.mockMvc.perform(put("/rest/cliente/actualizarCliente").contentType(MediaType.APPLICATION_JSON)
				 .content(ClienteTestRequests.JSON_ACTUALIZAR_CLIENTE)).andExpect(status().isCreated()).andDo(print());
		} catch (Exception e) {
			fail("Error en el servicio: " + e);
		}
	}

	/**
	 * Test method for {@link com.capgemini.gestorproyectos.controller.ClienteController#crearCliente(com.capgemini.gestorproyectos.model.ClienteDTO)}.
	 */
	@Test
	public final void testValidacionActualizarCliente() {
		try {
		 this.mockMvc.perform(put("/rest/cliente/actualizarCliente").contentType(MediaType.APPLICATION_JSON)
				 .content(ClienteTestRequests.JSON_ACTUALIZAR_CLIENTE_VALIDAR)).andExpect(status().isBadRequest()).andDo(print());
		} catch (Exception e) {
			fail("Error en el servicio: " + e);
		}
	}
	/**
	 * Test method for {@link com.capgemini.gestorproyectos.controller.ClienteController#eliminarCliente(com.capgemini.gestorproyectos.model.ClienteDTO)}.
	 */
	@Test
	public final void testEliminarCliente() {
		try {
		 this.mockMvc.perform(delete("/rest/cliente/eliminarCliente").contentType(MediaType.APPLICATION_JSON)
				 .content(ClienteTestRequests.JSON_ELIMINAR_CLIENTE)).andExpect(status().isOk()).andDo(print());
		} catch (Exception e) {
			fail("Error en el servicio: " + e);
		}
	}

	/**
	 * Test method for {@link com.capgemini.gestorproyectos.controller.ClienteController#getAllClientes()}.
	 * @throws Exception 
	 */
	@Test
	public final void testGetAllClientes() {
		try {
			this.mockMvc.perform(get("/rest/cliente/getAllClientes").
				contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk()).andDo(print());
		} catch (Exception e) {
			fail("Error en el servicio: " + e);
		}	
	}
}
