package com.app.presentacion;

import com.app.logica.Artista;
import com.app.logica.Cancion;
import com.app.logica.ControladoraLogica;

public class Main {
	public static void main(String[] args) {
	// INSTANCIAR DOS ARTISTAS
		Artista a1 = new Artista("sebastias","Rock Nacional","argentina", 33);
		Cancion c1= new Cancion("en la ciudad de la furia", 3, 1992);
	// INSTANCIAR DOS CANCIONES

		ControladoraLogica conLog = new ControladoraLogica();
		try {
		// CREAR AL MENOS DOS ARTISTAS, Y DOS CANCIONES
			conLog.crearArtista(a1);
			conLog.crearCancion(c1);

		} catch (Exception e) {
			System.out.println("No se pudo crear el elemento: " + e.getMessage());
		}

	}
}


