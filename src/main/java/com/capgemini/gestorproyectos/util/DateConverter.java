package com.capgemini.gestorproyectos.util;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateConverter extends PropertyEditorSupport {

	private SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		try {
			System.out.println("Texto: "+text);
			setValue(simpleDateFormat.parse(text));
		} catch (ParseException e) {
			throw new IllegalArgumentException("Debe introducir una fecha");
		}
	}

}
