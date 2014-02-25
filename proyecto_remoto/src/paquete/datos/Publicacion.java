package paquete.datos;

public abstract class Publicacion {
    private String codigo;
    private String titulo;
    private int a�o;
    
    /* Constructor */
    public Publicacion(String codigo,String titulo, int a�o){
        this.codigo = codigo;
        this.titulo = titulo;
        this.a�o = a�o;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getA�o() {
        return a�o;
    }
    
    public String getTitulo() {
    	return titulo;
    }
    
    public String toString() {
	    String mensaje = "";
	    mensaje += "Codigo: " + getCodigo();
	    mensaje += "\nTitulo: " + getTitulo();
	    mensaje += "\nA�o Publicacion: " + getA�o();
	    return mensaje;
    }    	
    
}
