package main;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Main {

	private static Window w;
	private static JButton btn;
	private static JTextField txtNombre;
	
	public static void main(String[] args) {
		w = new Window("Sample window", 350, 500);
		btn = new JButton();
		btn.setText("Accept");
		btn.setBounds(106, 98, 140, 30);
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(63, 33, 200, 36);
		btn.addActionListener(new Event(e -> {
			System.out.println("Valor del @txtNombre: " + txtNombre.getText() + ". ");
		}));
		
		w.getContentPane().add(btn);
		w.getContentPane().add(txtNombre);
		w.setVisible(true);
		
	}

}
