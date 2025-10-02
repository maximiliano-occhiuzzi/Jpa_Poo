package com.app.persistencia;

import com.app.logica.Artista;
import com.app.logica.Cancion;

public class ControladoraPersistencia {
	// Artista: Creamos una instancia del controlador que sabe cómo hablar con la
	// base de datos
	ArtistaJpaController artistaJpa = new ArtistaJpaController();

	// Cancion: Creamos una instancia del controlador que sabe cómo hablar con la
	// base de datos
	// INSTANCIAR OBJETO DE CANCIONJPACONTROLER AL IGUAL QUE SE HIZO CON ARTISTA

	// Este método es el que se usa desde otras capas para crear un ARTISTA
	public void crearArtista(Artista artista) {
		// Delegamos la tarea al controlador especializado
		artistaJpa.crear(artista);
	}
	
// AL IGUAL QUE CON ARTISTA, GENERAR EL MÉTODO “crearCancion()”
	CancionJpaController CancionJpa = new CancionJpaController();

	public void crearCancion(Cancion can) {
		// Delegamos la tarea al controlador especializado
		CancionJpa.crear(can);
	}
}


