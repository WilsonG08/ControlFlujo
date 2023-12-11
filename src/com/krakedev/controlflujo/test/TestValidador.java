package com.krakedev.controlflujo.test;

import com.kravedev.controlflujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		// Instancion del objeto
		Validador validador = new Validador();

		validador.validarEdad(10);
		validador.validarEdad(20);
		validador.validarEdad(18);
		validador.validarEdad(16);
		validador.validarEdad(-3);

	}
}
