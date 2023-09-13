package menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Punto1 extends JFrame {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Punto1 frame = new Punto1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Punto1() {
		super();
		setSize(600,350);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocation(500,500);
		setTitle("CONTACTOS");
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(61, 25, 60, 14);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(179, 25, 150, 20);
		contentPane.add(textField);
		textField.setColumns(20);
		
		JLabel lblApellido = new JLabel("Apellido: ");
		lblApellido.setBounds(61, 55, 60, 14);
		contentPane.add(lblApellido);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 55, 150, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(20);
		
		JLabel lbCorreo = new JLabel("Telefono: ");
		lbCorreo.setBounds(61, 85, 140, 14);
		contentPane.add(lbCorreo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(179, 85, 150, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(20);
		
		JLabel lblTelefono = new JLabel("Fecha nacimiento: ");
		lblTelefono.setBounds(61, 115, 120, 14);
		contentPane.add(lblTelefono);
		
		textField_3 = new JTextField();
		textField_3.setBounds(179, 115, 150, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(20);
		
		JLabel lblMostrar = new JLabel();
		lblMostrar.setBounds(20,220,500,20);
		contentPane.add(lblMostrar);
			
		JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(190, 160, 89, 23);
        contentPane.add(btnAceptar);
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                String nombre = textField.getText();
                String apellido = textField_1.getText();
                String telefono = textField_2.getText();
                String fechaNacimiento = textField_3.getText();

                String datos = "Los datos ingresados fueron: " + nombre +" "+ apellido + ", " + telefono + ", " + fechaNacimiento;
                lblMostrar.setText(datos);
            }
        });
		
		this.dispose();
	}
}


