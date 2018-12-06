package InterfacesExample;

public class DirectorTI extends AreaTI{

	public DirectorTI(int id, String nombre, String apellido, String cargo) {
		super(id, nombre, apellido, cargo);
		
	}
	public void CumpleHorario() {
		System.out.println("llega a la empresa, sin importar la hora");
		
	}
	
	public void Almuerzo() {
		System.out.println("tiene derecho a almorzar");
		
	}

	public void CumpleTareas() {
		System.out.println("cumple con sus labores diarias como director");
		
	}

	public void CumpleReuniones() {
		System.out.println("cumple con sus reuniones");
		
	}
	

}
