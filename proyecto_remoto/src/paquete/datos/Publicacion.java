package paquete.datos;

public abstract class Publicacion {
    private String codigo;
    private String titulo;
    private int año;
    
    /* Constructor */
    public Publicacion(String codigo,String titulo, int año){
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getAño() {
        return año;
    }
    
    public String getTitulo() {
    	return titulo;
    }
    
    public String toString() {
	    String mensaje = "";
	    mensaje += "Codigo: " + getCodigo();
	    mensaje += "\nTitulo: " + getTitulo();
	    mensaje += "\nAño Publicacion: " + getAño();
	    return mensaje;
    }    	
    
}
