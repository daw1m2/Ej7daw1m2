package paquete.datos;

public class Publicacion {
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
    
    public String toString() {
        return "código:" + codigo + " título: " + titulo + " año: " + año;
    }
  
}
