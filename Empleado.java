package InterfacesExample;

public class Empleado extends AreaTI{

	public Empleado(int id, String nombre, String apellido, String cargo) {
		super(id, nombre, apellido, cargo);
	
	}

	public void CumpleHorario() {
		System.out.println("cumple su horario");
		
	}

	public void Almuerzo() {
		System.out.println("tiene derecho a almorzar");
		
	}

	public void CumpleTareas() {
		System.out.println("cumple con sus labores diarias");
		
	}

	public void CumpleReuniones() {
		System.out.println("cumple con sus reuniones programadas");
		
	}
	

}
