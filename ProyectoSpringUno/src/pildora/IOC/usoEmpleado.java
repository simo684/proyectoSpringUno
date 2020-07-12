package pildora.IOC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoEmpleado {

	public static void main(String[] args) {
	
  //   empleados jef = new directorEmpleado();
  //System.out.println(  jef.getTareas());
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		empleados juan = contexto.getBean("miEmpleado", empleados.class);
		System.out.println( juan.getTareas());
		System.out.println(juan.getInformes());
		contexto.close();
		
	}

}
