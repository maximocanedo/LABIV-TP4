package menu;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame{

	private static final long serialVersionUID = 1L;
	private JButton ejercicio_1, ejercicio_2, ejercicio_3;
	private NuestroLabel lblGrupo;
	
	
	public Principal() {
		initComponents();
		initUi();
		initListeners();
		setVisible(true);
		
	}
	
	private void initListeners() {
		ejercicio_1.addActionListener(new ListenerMenu(ejercicio_1));
		ejercicio_2.addActionListener(new ListenerMenu(ejercicio_2));
		ejercicio_3.addActionListener(new ListenerMenu(ejercicio_3));
		
	}

	private void initUi() {
		
		this.setSize(new Dimension(600,400));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle("TRABAJO PR�CTICO N� 4");
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		getContentPane().setLayout(null);
		ejercicio_1.setBounds(220, 100, 100, 30);
		ejercicio_2.setBounds(220, 150, 100, 30);
		ejercicio_3.setBounds(220, 200, 100, 30);
		lblGrupo.setBounds(40, 10, 200, 50);
		getContentPane().add(ejercicio_1);
		getContentPane().add(ejercicio_2);
		getContentPane().add(ejercicio_3);
		getContentPane().add(lblGrupo);
		
	}

	public void initComponents() {
		lblGrupo = new NuestroLabel("GRUPO NRO: 3");
		ejercicio_1 = new JButton("Ejercicio 1");
		ejercicio_2 = new JButton("Ejercicio 2");
		ejercicio_3 = new JButton("Ejercicio 3");
	}
	
	
		public static void main(String[] args) {
			new Principal();		
		}
		

}


	
	
class ListenerMenu implements ActionListener {
	
	JButton boton;
	
	public ListenerMenu() {
		boton= null;
	}
	public ListenerMenu(JButton btn ) {
		
		boton= btn;
		
	}
	

@Override
public void actionPerformed(ActionEvent arg0) {
	
	switch(boton.getText()) {
	case "Ejercicio 1": 
		Punto1.abrirVentana();
		break;
	case "Ejercicio 2": 
		Punto2.abrirVentana();;
		break;
	case "Ejercicio 3": 
		Punto3.abrirVentana();	
		break;
	default:
		
		break;
	}
	
}

}
