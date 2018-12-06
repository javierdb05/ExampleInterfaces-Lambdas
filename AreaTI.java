package InterfacesExample;

public abstract class AreaTI implements AreaTecnologia{
	
	int id;
	String nombre;
	String apellido;
	String cargo;
	
		
	public AreaTI(int id,String nombre,String apellido,String cargo){
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargo = cargo;
		
	}
	public void CumpleHorario() {
		System.out.println("Todos los empleados cumplen un horario");
		
	}

	public void Almuerzo() {
		System.out.println("Todos los empelados almuerzan");
		
	}

	public void CumpleTareas() {
		System.out.println("Todos cumplen con sus tareas");
		
	}

	public void CumpleReuniones() {
		System.out.println("Todos deben cumplir con las reuniones establecidas");
		
	}
	

}
