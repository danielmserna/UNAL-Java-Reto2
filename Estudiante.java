public class Estudiante {

	private String nombre; 
	private String edad;
	private String programa;
	private String tipo_etnia;
	private Pregrado pregrado;
	private Posgrado posgrado;
	
	public Estudiante(String nombre, String edad, String programa, String tipo_etnia, Pregrado pregrado) {
		this.nombre = nombre;
		this.edad = edad;
		this.programa = programa;
		this.tipo_etnia = tipo_etnia;
		this.pregrado = pregrado;
	}

	public Estudiante(String nombre, String edad, String programa, String tipo_etnia, Posgrado posgrado) {
		this.nombre = nombre;
		this.edad = edad;
		this.programa = programa;
		this.tipo_etnia = tipo_etnia;
		this.posgrado = posgrado;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getTipoEtnia() {
		return tipo_etnia;
	}

	public void setTipoEtnia(String tipo_etnia) {
		this.tipo_etnia = tipo_etnia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Posgrado getPosgrado() {
		return posgrado;
	}

	public void setPosgrado(Posgrado posgrado) {
		this.posgrado = posgrado;
	}

	public Pregrado getPregrado() {
		return pregrado;
	}

	public void setPregrado(Pregrado pregrado) {
		this.pregrado = pregrado;
	}
	
}
