public class Posgrado {

	private String nombre; 
	private String edad;
	private String programa;
	private String tipo_etnia;
	private String modalidad;
	
	public Posgrado(String nombre, String edad, String programa, String tipo_etnia, String modalidad) {
		this.nombre = nombre;
		this.edad = edad;
		this.programa = programa;
		this.tipo_etnia = tipo_etnia;
		this.modalidad = modalidad;
	}

	public Posgrado(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	@Override
    public String toString() {
        return "Modalidad: " + modalidad + "\n";
    }

	
}
