package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import modelo.ConexionBD;
import modelo.ModeloUsuarios;

public class VistaPrincipal extends JPanel {
	private JTextField textoClave;
	Iterator<String> it=null;
	ConexionBD usuarios;
	ModeloUsuarios mu;

	public VistaPrincipal() {
		setLayout(null);
		
		JLabel icono = new JLabel("New label");
		icono.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/imagenes/imagen1.jpg")));
		icono.setBounds(25, 25, 120, 120);
		add(icono);
		
		JLabel usuario = new JLabel("Usuario");
		usuario.setBounds(22, 169, 46, 14);
		add(usuario);
		
		JComboBox comboUsuario = new JComboBox();
		comboUsuario.setBounds(20, 200, 125, 25);
		add(comboUsuario);
		// Llenado del Combobox
		mu=new ModeloUsuarios();
		it=(Iterator<String>)mu.getUsuarios().iterator();
		while (it.hasNext()){
			comboUsuario.addItem(it.next());
		}
		
		
		JLabel clave = new JLabel("Contrase\u00F1a");
		clave.setBounds(26, 229, 120, 14);
		add(clave);
		
		textoClave = new JTextField();
		textoClave.setBounds(20, 250, 124, 25);
		add(textoClave);
		textoClave.setColumns(10);
		
		JButton login = new JButton("Login");
		login.setBounds(20, 300, 125, 25);
		add(login);
		
		JButton registrar = new JButton("Registrar");
		registrar.setBounds(20, 340, 125, 25);
		add(registrar);
		
		JButton juegos = new JButton("Juegos >");
		juegos.setBounds(205, 25, 170, 25);
		add(juegos);
		
		JButton perfil = new JButton("Perfil >");
		perfil.setBounds(205, 75, 170, 25);
		add(perfil);
	}
}
