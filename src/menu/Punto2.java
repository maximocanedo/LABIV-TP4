package menu;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;

public class Punto2 extends JFrame {

	private JPanel contentPane;
	private JTextField textNota;
	private JTextField textNota2;
	private JTextField textNota_3;
	private JTextField textPromedio;
	private JTextField textCondicion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Punto2 frame = new Punto2();
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
	public Punto2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 525, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 221, 351, 135);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPromedioEstudiante = new JLabel("Promedio Estudiante");
		lblPromedioEstudiante.setBounds(10, 0, 113, 14);
		panel.add(lblPromedioEstudiante);
		
		JLabel lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(58, 49, 65, 14);
		panel.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion");
		lblCondicion.setBounds(58, 88, 65, 14);
		panel.add(lblCondicion);
		
		textPromedio = new JTextField();
		textPromedio.setEditable(false);
		textPromedio.setBounds(133, 46, 86, 20);
		panel.add(textPromedio);
		textPromedio.setColumns(10);
		
		textCondicion = new JTextField();
		textCondicion.setEditable(false);
		textCondicion.setBounds(133, 85, 86, 20);
		panel.add(textCondicion);
		textCondicion.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 351, 199);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textNota = new JTextField();
		textNota.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				int k=(int)evt.getKeyChar();
				if(k>=97 && k<=122||k>=65 && k<=90) {
					evt.setKeyChar((char)KeyEvent.VK_CLEAR);
					JOptionPane.showInternalMessageDialog(null, "No puede ingresar letras!!","Validando Datos",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textNota.setBounds(121, 29, 86, 20);
		panel_1.add(textNota);
		textNota.setColumns(10);
		
		JLabel lblExamenes = new JLabel("Examenes");
		lblExamenes.setBounds(127, 4, 49, 14);
		panel_1.add(lblExamenes);
		
		JLabel lblNota_1 = new JLabel("Nota 1");
		lblNota_1.setBounds(65, 32, 46, 14);
		panel_1.add(lblNota_1);
		
		JLabel lblNota_2 = new JLabel("Nota 2");
		lblNota_2.setBounds(65, 68, 46, 14);
		panel_1.add(lblNota_2);
		
		JLabel lblNota_3 = new JLabel("Nota 3");
		lblNota_3.setBounds(65, 100, 46, 14);
		panel_1.add(lblNota_3);
		
		textNota_3 = new JTextField();
		textNota_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				int k=(int)evt.getKeyChar();
				if(k>=97 && k<=122||k>=65 && k<=90) {
					evt.setKeyChar((char)KeyEvent.VK_CLEAR);
					JOptionPane.showInternalMessageDialog(null, "No puede ingresar letras!!","Validando Datos",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textNota_3.setBounds(121, 97, 86, 20);
		panel_1.add(textNota_3);
		textNota_3.setColumns(10);
		
		textNota2 = new JTextField();
		textNota2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				int k=(int)evt.getKeyChar();
				if(k>=97 && k<=122||k>=65 && k<=90) {
					evt.setKeyChar((char)KeyEvent.VK_CLEAR);
					JOptionPane.showInternalMessageDialog(null, "No puede ingresar letras!!","Validando Datos",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textNota2.setBounds(121, 65, 86, 20);
		panel_1.add(textNota2);
		textNota2.setColumns(10);
		
		JLabel lblNotaEstudiante = new JLabel("Nota Estudiante");
		lblNotaEstudiante.setBounds(10, 0, 85, 14);
		panel_1.add(lblNotaEstudiante);
		
		JLabel lblTps = new JLabel("TPS");
		lblTps.setBounds(65, 151, 46, 14);
		panel_1.add(lblTps);
		
		JComboBox CbEstado = new JComboBox();
		CbEstado.setModel(new DefaultComboBoxModel(new String[] {"Aprobado", "Desaprobado"}));
		CbEstado.setBounds(121, 148, 86, 20);
		panel_1.add(CbEstado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float Nota1=Float.parseFloat(textNota.getText());
				float Nota2=Float.parseFloat(textNota2.getText());
				float Nota3=Float.parseFloat(textNota_3.getText());
				float promedio=(Nota1+Nota2+Nota3)/3;
				String dato=CbEstado.getSelectedItem().toString();
				textPromedio.setText(String.valueOf(promedio));
				if(Nota1<6 ||Nota2<6||Nota3<6||dato.equalsIgnoreCase("Desaprobado")) {
					textCondicion.setText("Libre");
				}
				else {
					if(Nota1>=8 && Nota2>=8 && Nota3>=8) {
					textCondicion.setText("Promocionado");
					}
					else{
					textCondicion.setText("Regular");
					}
				}
			}
		});
		btnCalcular.setBounds(380, 110, 89, 30);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				textNota.setText("");
				textNota2.setText("");
				textNota_3.setText("");
				textCondicion.setText("");
				textPromedio.setText("");
			}
		});
		btnNuevo.setBounds(380, 151, 89, 30);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Menu X=new Menu();
				X.setVisible(true);
			}
		});
		btnSalir.setBounds(380, 187, 89, 30);
		contentPane.add(btnSalir);
		this.dispose();
	}
}
