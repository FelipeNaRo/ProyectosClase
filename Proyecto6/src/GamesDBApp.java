
import java.util.ArrayList;

import modelo.ConexionBD;
import modelo.ModeloUsuarios;
import vista.*;
public class GamesDBApp {

	public static void main(String[] args){
		
		ConexionBD usuarios;
		ModeloUsuarios mUsuarios;
		
		// Se crea la conexi�n.
		usuarios=new ConexionBD("Localhost","gamedb","root","");
		// Comprobamos que se ha podido conectar y lanza la ventana de vista.
		if (usuarios.connectDB()==true){
			System.out.println("Exito de conexi�n!!!");
			VistaApp vistaApp= new VistaApp();
			vistaApp.setVisible(true);
		}else{
			System.out.print("Fallo de conexi�n!!!");
		}
		
		
		
	}
}
