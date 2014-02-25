package paquete.datos;

public final class Libro extends Publicacion implements Prestable {
	// ATRIBUTOS
	private boolean prestado;
	
	// CONSTRUCTOR	
	public Libro(String nombre, String titulo, int añoPublicacion) {
		super (nombre, titulo, añoPublicacion);
		this.prestado = false; // Cuando crea un objeto libro no estará prestado por defecto.
	}
	
	// MÉTODOS DE OBTENCION
	public boolean isPrestado() {
		return prestado;
	}

	// IMPLEMENTADOS DE LA INTERFAZ
	public void prestar() {
		this.prestado = true;		
	}

	public void devolver() {
		this.prestado = false;		
	}

	public String prestado() {
		String mensaje = "";
		if(prestado){
			mensaje = "Si";
		} else {
			mensaje = "No";
		}
		return mensaje;
	}	
	
	//COMPORTAMIENTO	
	public String toString() {
		String mensaje = "";
		mensaje += super.toString();
		mensaje += "Ha sido prestado?: " + prestado();
		return mensaje;
	}
}
