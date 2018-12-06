package InterfacesExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {
	
	
	public static ArrayList<AreaTI> area = new ArrayList<AreaTI>();

	public static void main(String[] args) {
		
		AreaTI analistaDesarrollador = new Empleado(1022417310,"Javier Sebastian","Diaz Balanta","Analista Desarrollador Junior");
		AreaTI Director = new DirectorTI(134684324,"Ignacio","Estrella Diaz","Director Nacional de TI");
		
		area.add(analistaDesarrollador);
		area.add(Director);
				
		System.out.println("Entrada Empresa\n");
		
		
		
		for(AreaTI empleado:area) {
			System.out.print("    El empleado " + empleado.nombre + " " + empleado.apellido + " ");
			empleado.CumpleHorario();
		}
		
		System.out.println("Hora de almorzar\n");
		
		for(AreaTI empleado:area) {
			System.out.print("    El empleado " + empleado.nombre + " " + empleado.apellido + " ");
			empleado.Almuerzo();
		}
		
		System.out.println("Cumplen con sus tareas\n");
		
		for(AreaTI empleado:area) {
			System.out.print("    El empleado " + empleado.nombre + " " + empleado.apellido + " - "+empleado.cargo+" ");
			empleado.CumpleTareas();
		}
		
	
		
	}
	


}
