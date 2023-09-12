package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrimerEjercicio extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimerEjercicio frame = new PrimerEjercicio();
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
	public PrimerEjercicio() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new MigLayout("", "[][][grow][]", "[][][][][]"));
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panel_1.add(horizontalGlue, "cell 0 0");
		
		JLabel lblNombre = new JLabel("Nombre:");
		panel_1.add(lblNombre, "cell 1 0,alignx trailing");
		
		txtNombre = new JTextField();
		panel_1.add(txtNombre, "cell 2 0,growx");
		txtNombre.setColumns(10);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		panel_1.add(horizontalGlue_1, "cell 3 0");
		
		JLabel lblApellido = new JLabel("Apellido:");
		panel_1.add(lblApellido, "cell 1 1,alignx trailing");
		
		txtApellido = new JTextField();
		panel_1.add(txtApellido, "cell 2 1,growx");
		txtApellido.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		panel_1.add(lblTelfono, "cell 1 2,alignx trailing");
		
		txtTelefono = new JTextField();
		panel_1.add(txtTelefono, "cell 2 2,growx");
		txtTelefono.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
		panel_1.add(lblFechaDeNacimiento, "cell 1 3,alignx trailing");
		
		txtFecha = new JTextField();
		panel_1.add(txtFecha, "cell 2 3,growx");
		txtFecha.setColumns(10);
		
		JButton btnMostrar = new JButton("Mostrar");
		
		panel_1.add(btnMostrar, "cell 2 4,alignx center,aligny center");
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new MigLayout("", "[][]", "[][][][][]"));
		
		JLabel lblLosDatosIngresados = new JLabel("Los datos ingresados fueron:");
		panel_2.add(lblLosDatosIngresados, "cell 0 0");
		
		JLabel lblNewLabel_1 = new JLabel("Nombre completo:");
		panel_2.add(lblNewLabel_1, "cell 0 1,alignx right");
		
		JLabel lbNombreCompleto = new JLabel("");
		panel_2.add(lbNombreCompleto, "cell 1 1");
		
		JLabel lblNewLabel_2 = new JLabel("Tel\u00E9fono:");
		panel_2.add(lblNewLabel_2, "cell 0 2,alignx right");
		
		JLabel lbTelefono = new JLabel("");
		panel_2.add(lbTelefono, "cell 1 2");
		
		JLabel lblFechaDeNacimiento_1 = new JLabel("Fecha de Nacimiento:");
		panel_2.add(lblFechaDeNacimiento_1, "cell 0 3,alignx right");
		
		JLabel lbFecha = new JLabel("");
		panel_2.add(lbFecha, "cell 1 3");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Verificar
				boolean v = true;
				if(txtNombre.getText().trim().isEmpty()) {
					txtNombre.setBackground(Color.RED);
					v = false;
				} else txtNombre.setBackground(Color.WHITE);
				if(txtApellido.getText().trim().isEmpty()) {
					txtApellido.setBackground(Color.RED);
					v = false;
				} else txtApellido.setBackground(Color.WHITE);
				if(txtTelefono.getText().trim().isEmpty()) {
					txtTelefono.setBackground(Color.RED);
					v = false;
				} else txtTelefono.setBackground(Color.WHITE);
				if(txtFecha.getText().trim().isEmpty()) {
					txtFecha.setBackground(Color.RED);
					v = false;
				} else txtFecha.setBackground(Color.WHITE);
				
				
				if(v) {
					String nombreCompleto = txtNombre.getText() + " " + txtApellido.getText();
					String telefono = txtTelefono.getText();
					String fn = txtFecha.getText();
					lbNombreCompleto.setText(nombreCompleto);
					lbTelefono.setText(telefono);
					lbFecha.setText(fn);
					
					// Limpieza
					txtNombre.setText("");
					txtApellido.setText("");
					txtTelefono.setText("");
					txtFecha.setText("");
				}
			}
		});
	}

}
