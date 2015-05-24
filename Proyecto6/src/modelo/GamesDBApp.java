package modelo;
import java.util.ArrayList;

import vista.*;
public class GamesDBApp {

	public static void main(String[] args){
		
		VistaApp vistaApp= new VistaApp();
		vistaApp.setVisible(true);
		
		
		ConexionBD usuarios;
		ModeloUsuarios mUsuarios;
		
		usuarios=new ConexionBD("Localhost","gamedb","root","");
		if (usuarios.connectDB()==true){
			System.out.println("Exito de conexión!!!");
			mUsuarios=new ModeloUsuarios();
			System.out.println("Lista de usuarios:");
			//ArrayList <String> listaUsuarios=mUsuarios.getUsuarios();
		}else{
			System.out.print("Fallo de conexión!!!");
		}
		
	}
}
