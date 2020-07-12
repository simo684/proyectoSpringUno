package pildora.IOC;

public class directorEmpleado implements empleados {

	// crerer champ type interface creationinformes
	
	private CreationInformes informenuevo;
	
	// CREATION DEL CONSTRUCTOR QUE INYECTA LA DEPENDENCIA
	public directorEmpleado(CreationInformes informenuevo) {
		
		this.informenuevo = informenuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "gesdtion de empressa";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "informe creado por el director "+ informenuevo.getInformes();
	}

}
