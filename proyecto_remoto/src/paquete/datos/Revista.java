package paquete.datos;

public class Revista extends Publicacion {
		//Articulos
		private int numeroRevista;
		
		//Constructor
		public Revista(String codigo, String titulo, int a�o, int numeroRevista) {
			super(codigo, titulo, a�o);
			this.numeroRevista=numeroRevista;
			
		}
		
		//Metodo get
		public int getNumeroRevista() {
			return numeroRevista;
		}
		
		public String toString(){
			String mensaje= "";
			mensaje+=super.toString() + getNumeroRevista();
			return mensaje;
		}

		
	

}
