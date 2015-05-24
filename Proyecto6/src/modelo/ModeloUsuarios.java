package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class ModeloUsuarios {
	
	private static String LISTA_USU="SELECT usuario FROM usuarios";
	
	private static String ID="id";
	private static String USUARIO="usuario";
	private static String PASS="pass";
	private static String NOMBRE="nombre";
	
	private static String COLUMNAS[]={ID,USUARIO,PASS,NOMBRE};
	private ArrayList <String>listaUsuarios=null;
	
	private Connection conexion=null;
	Statement instruccion=null;
	ResultSet conjuntoUsuarios=null;	
	
	public ModeloUsuarios() {
		
		conexion=ConexionBD.getConexion();
		listaUsuarios=new ArrayList<String>();
	}

	public ArrayList getUsuarios(){
		try{
			// Realiza la consulta de Usuarios
			instruccion=this.conexion.createStatement();
			conjuntoUsuarios=instruccion.executeQuery(LISTA_USU);
		   // Realiza el array de Usuarios para devolver la consulta
			while(conjuntoUsuarios.next()){
			listaUsuarios.add(conjuntoUsuarios.getString(USUARIO));
		}
			return listaUsuarios;
		}
		catch(SQLException exceptionSql)
		{
			exceptionSql.printStackTrace();
			return listaUsuarios;
		}
		finally {
			 try{
				conjuntoUsuarios.close();
				instruccion.close();
				//conexion.close();
			}catch(SQLException exceptionSql){
				exceptionSql.printStackTrace();
				
			}
		}
	}
}
