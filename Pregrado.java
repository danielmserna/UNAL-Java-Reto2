public class Pregrado {

	private String nombre; 
	private String edad;
	private String programa;
	private String tipo_etnia;
	private String cantidad_creditos;
	
	public Pregrado(String nombre, String edad, String programa, String tipo_etnia, String cantidad_creditos) {
		this.nombre = nombre;
		this.edad = edad;
		this.programa = programa;
		this.tipo_etnia = tipo_etnia;
		this.cantidad_creditos = cantidad_creditos;
	}

	public Pregrado(String cantidad_creditos) {
		this.cantidad_creditos = cantidad_creditos;
	}

	public String getCantidadCreditos() {
		return cantidad_creditos;
	}

	public void setCantidadCreditos(String cantidad_creditos) {
		this.cantidad_creditos = cantidad_creditos;
	}

	@Override
    public String toString() {
        return "Cantidad de créditos: " + cantidad_creditos + "\n";
    }

	
}
