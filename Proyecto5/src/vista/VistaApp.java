package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VistaApp extends JFrame {

	private VistaPrincipal contenedorVista;

	public VistaApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 456);
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu principal=new JMenu("Principal");
		menuBar.add(principal);
		JMenuItem principal1 = new JMenuItem("Principal");
		principal.add(principal1);
		
		JMenu juegos=new JMenu("Juegos");
		menuBar.add(juegos);
		JMenuItem juegos1 = new JMenuItem("Juegos");
		juegos.add(juegos1);
		
		JMenu perfil=new JMenu("Perfil");
		menuBar.add(perfil);
		JMenuItem perfil1 = new JMenuItem("Perfil");
		perfil.add(perfil1);
		getContentPane().setLayout(new BorderLayout(0, 0));
	
		
		contenedorVista= new VistaPrincipal();
		contenedorVista.setBorder(new EmptyBorder(5, 5, 5, 5));
		contenedorVista.setLayout(new BorderLayout(0, 0));
		setContentPane(contenedorVista);
	}

}
