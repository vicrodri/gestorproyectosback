package com.capgemini.gestorproyectos.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;


@Component
public class JSONDateSerializer extends JsonSerializer<Date>{

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public void serialize(Date fecha, JsonGenerator generador, SerializerProvider proveedor)
			throws IOException, JsonProcessingException {
		String formattedDate = dateFormat.format(fecha);
		generador.writeString(formattedDate);
	}	
	
}
