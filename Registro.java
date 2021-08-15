import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Registro {

	private static List <Estudiante> estudiantes = new ArrayList<Estudiante>();

	public static void agregarEstudiante(String datos){
		procesarComandos(datos);
	}

	public static void listarEstudiantes(){
		System.out.println("***Listado de estudiantes***");
			for (Estudiante estudiante : estudiantes) {
				
				String tipoEstu;
				String modo;
				if(estudiante.getPregrado() != null){
					tipoEstu = "Estudiante Pregrado";
					modo = "Créditos aprobados: " + estudiante.getPregrado().getCantidadCreditos();
				}else{
					tipoEstu = "Estudiante Posgrado";
					modo = "Modalidad: " + estudiante.getPosgrado().getModalidad();				}

				System.out.println(
						"\t" + tipoEstu + "\n"
						+ "\tNombre: " + estudiante.getNombre() + "\n"
						+ "\tEdad: " + estudiante.getEdad() + " años" + "\n"
						+ "\tPrograma: " + estudiante.getPrograma() + "\n"
						+ "\tEtnia: " + estudiante.getTipoEtnia() + "\n"
						+ "\t" + modo
				);
			}
	}

	public static void procesarComandos(String datos){
		
		if(datos.split("&")[1].equals("Posgrado")){
			Posgrado aux = new Posgrado(datos.split("&")[6]);
			String nombre = datos.split("&")[2];
			String edad = datos.split("&")[3];
			String programa = datos.split("&")[4];
			String etnia = datos.split("&")[5];
			Estudiante estud = new Estudiante(nombre, edad, programa, etnia, aux);;
			estudiantes.add(estud);
		}else{
			Pregrado aux = new Pregrado(datos.split("&")[6]);
			String nombre = datos.split("&")[2];
			String edad = datos.split("&")[3];
			String programa = datos.split("&")[4];
			String etnia = datos.split("&")[5];
			Estudiante estud = new Estudiante(nombre, edad, programa, etnia, aux);
			estudiantes.add(estud);
		}
    }

	public static void main(String[] args) {
		String line = null;
		Scanner sc = new Scanner (System.in);
		try {
                while (!(line = sc.nextLine()).equals("3")) {
					if(line.equals("2")){
					listarEstudiantes();
					}else{
					agregarEstudiante(line);
					}
                }           
            } catch (Exception e) {}

    }
	
}