package modelo;
import java.sql.DriverManager;
import java.sql.*;

public class ConexionBD {
	// DATOS DE CONEXION
				static final String CONTROLADOR_MYSQL="com.mysql.jdbc.Driver";
				
		// DATOS DE LA BASE DE DATOS
				private String host;
				private String bbdd;
				private String user;
				private String pass;
				
		//Conexion
				private static Connection conexion=null; // maneja la conexion
				
		// Instancia unica
				private static ConexionBD instance=null;
				
				public ConexionBD(String HOST, String BBDD, String USER, String PASS){
					this.host=HOST;
					this.bbdd=BBDD;
					this.user=USER;
					this.pass=PASS;
				}
				
				//Implementa singleton
				public static ConexionBD getInstance(String HOST, String BBDD, String USER, String PASS){
					if (instance==null){
						instance=new ConexionBD(HOST,BBDD,USER,PASS);
					}
					return instance;
				}
				
				 public boolean connectDB(){
					try{
						// lo primero es cargar el controlador MySQL el cual automaticamente se registra
						Class.forName(CONTROLADOR_MYSQL);
						//conectamos con la BBDD
						conexion=DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.bbdd, this.user, this.pass);
					}catch(SQLException exceptionSql){
						exceptionSql.printStackTrace();
						return false;
					}
					catch(ClassNotFoundException noEncontroClase){
						noEncontroClase.printStackTrace();
						return false;
					}
					return true;
				}
				 
		public  static Connection getConexion(){
			return conexion;
		}

}
