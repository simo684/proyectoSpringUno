package pildora.IOC;

public class secretEmpleado implements empleados {

	// crerer champ type interface creationinformes
	
		private CreationInformes informenuevo;
		
		
		

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "gestion agenda des jefes";
	}
	// CREATION DEL CONSTRUCTOR QUE INYECTA LA DEPENDENCIA
	public secretEmpleado(CreationInformes informenuevo) {
   
			this.informenuevo = informenuevo;
		}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "informe presentado por el secretario"+ informenuevo.getInformes();
	}

}
