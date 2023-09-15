package menu;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;

public class Punto2 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JTextField textNota;
	private JTextField textNota2;
	private JTextField textNota_3;
	private JTextField textPromedio;
	private JTextField textCondicion; 	
	
	private JPanel contentPane;
	private JPanel recuadroNota = new JPanel();
	private JPanel resultado = new JPanel();
	
	private JComboBox<Object> CbEstado = new JComboBox<Object>();
	
	private JButton btnCalcular = new JButton("Calcular");
	private JButton btnNuevo = new JButton("Nuevo");
	JButton btnSalir = new JButton("Salir");
	
	private JLabel lblNota1 = new JLabel("Nota 1");
	private JLabel lblNota2 = new JLabel("Nota 2");
	private JLabel lblNota3 = new JLabel("Nota 3");
	private JLabel lblPromedio = new JLabel("Promedio");
	private JLabel lblCondicion = new JLabel("Condicion");
	private JLabel lblTps = new JLabel("TPS");
	
	

	/**
	 * Launch the application.
	 */
	public static void abrirVentana() {
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

	public Punto2() {
		
		initLayout();
		initComponents();
		initUi();
		initListeners();
		
		this.dispose();
				
	}

	private void initComponents() {
		
		textNota = new JTextField(10);
		textNota2 = new JTextField(10);
		textNota_3 = new JTextField(10);
		
		CbEstado.setModel(new DefaultComboBoxModel<Object>(new String[] {"Aprobado", "Desaprobado"}));
		
		textPromedio = new JTextField(10);
		textPromedio.setEditable(false);
		
		textCondicion = new JTextField(10);
		textCondicion.setEditable(false);
		
	}
	private void initUi() {
		Border bordeNota = BorderFactory.createTitledBorder("Notas del estudiante");
		recuadroNota.setBounds(40, 49, 230, 188);
		recuadroNota.setLayout(null);
		recuadroNota.setBorder(bordeNota);
		this.add(recuadroNota);
		
		CbEstado.setBounds(80, 130, 100, 20);
		recuadroNota.add(CbEstado);
		
		lblNota1.setBounds(20, 30, 50, 20);
		recuadroNota.add(lblNota1);
		
		lblNota2.setBounds(20, 60, 46, 20);
		recuadroNota.add(lblNota2);
		
		lblNota3.setBounds(20, 90, 50, 20);
		recuadroNota.add(lblNota3);
		
		textNota.setBounds(80, 30, 120, 20);
		recuadroNota.add(textNota);
		
		textNota2.setBounds(80, 60, 120, 20);
		recuadroNota.add(textNota2);
		
		textNota_3.setBounds(80, 90, 120, 20);
		recuadroNota.add(textNota_3);
		
		lblTps.setBounds(20, 130, 50, 20);
		recuadroNota.add(lblTps);
		
		resultado.setBounds(40, 260, 230, 140);
		this.add(resultado);
		resultado.setLayout(null);
		resultado.setBorder(bordeNota);
		
		lblPromedio.setBounds(20, 50, 70, 20);
		resultado.add(lblPromedio);
		
		lblCondicion.setBounds(20, 90, 70, 20);
		resultado.add(lblCondicion);
		
		textPromedio.setBounds(80, 50, 120, 20);
		resultado.add(textPromedio);
		
		textCondicion.setBounds(80, 90, 120, 20);
		resultado.add(textCondicion);
		
		btnCalcular.setBounds(380, 110, 89, 30);
		contentPane.add(btnCalcular);
		
		btnSalir.setBounds(380, 187, 89, 30);
		contentPane.add(btnSalir);
		
		btnNuevo.setBounds(380, 151, 89, 30);
		contentPane.add(btnNuevo);
		
	}


	
	private void initLayout() {
		this.setSize(new Dimension(525,450));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle("Promedio");
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	}
	
	private void initListeners() {
		textNota.addFocusListener(new FocusAdapter() {
			
			public void focusLost(FocusEvent evt) {
				
				boolean comprobar = (!(textNota.getText().isEmpty())) ? true : false;
				
				if(comprobar) {
					if(!Validaciones.verificarNumero(textNota.getText())) {
						JOptionPane.showMessageDialog(null, "NO ES UN NÚMERO VÁLIDO.\nEL CAMPO PARA INGRESAR LA NOTA 1 SE PONDRÁ EN BLANCO.", "INGRESO DE NOTA INCORRECTO", JOptionPane.ERROR_MESSAGE);
						textNota.requestFocus();
						textNota.setText("");					
					}					
				}								
			}
		}); 
		textNota_3.addFocusListener(new FocusAdapter() {
			
			public void focusLost(FocusEvent evt) {
				boolean comprobar = (!(textNota_3.getText().isEmpty())) ? true : false;
				
				if(comprobar) {
					if(!Validaciones.verificarNumero(textNota_3.getText())) {
						JOptionPane.showMessageDialog(null, "NO ES UN NÚMERO VÁLIDO.\nEL CAMPO PARA INGRESAR LA NOTA 3 SE PONDRÁ EN BLANCO.", "INGRESO DE NOTA INCORRECTO", JOptionPane.ERROR_MESSAGE);
						textNota_3.requestFocus();
						textNota_3.setText("");					
					}					
				}								
			}			
		}); 		
		textNota2.addFocusListener(new FocusAdapter() {
			
			public void focusLost(FocusEvent evt) {
				boolean comprobar = (!(textNota2.getText().isEmpty())) ? true : false;
				
				if(comprobar) {
					if(!Validaciones.verificarNumero(textNota2.getText())) {
						JOptionPane.showMessageDialog(null, "NO ES UN NÚMERO VÁLIDO.\nEL CAMPO PARA INGRESAR LA NOTA 2 SE PONDRÁ EN BLANCO.", "INGRESO DE NOTA INCORRECTO", JOptionPane.ERROR_MESSAGE);
						textNota2.requestFocus();
						textNota2.setText("");					
					}					
				}				
			}
		}); 
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textNota.getText().isEmpty() || textNota2.getText().isEmpty() || textNota_3.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "LOS CAMPOS DE NOTA NO PUEDEN ESTAR VACÍOS.\n\nDEBE INGRESAR TODAS LAS CALIFICACIONES PARA CALCULAR EL PROMEDIO DEL ALUMNO", "INGRESO DE NOTAS INCORRECTO", JOptionPane.ERROR_MESSAGE);				
				}else{
					
					boolean NOTAS_VALIDAS = (Float.parseFloat(textNota.getText()) > 0 && Float.parseFloat(textNota2.getText()) > 0 && Float.parseFloat(textNota_3.getText()) > 0) ? true : false;
					
					if(NOTAS_VALIDAS) {
						float Nota1=Float.parseFloat(textNota.getText());
						float Nota2=Float.parseFloat(textNota2.getText());
						float Nota3=Float.parseFloat(textNota_3.getText());
															
						float promedio=(Nota1+Nota2+Nota3)/3;
						String dato=CbEstado.getSelectedItem().toString();
						textPromedio.setText(String.valueOf(promedio));
						/* Este código se hizo así y así, porque de hacerse como pedía la consigna daba 
						 * error cuando dos de las notas eran >= 8 y alguna era < 8. Así que en vez de tomar las tres 
						 * notas por separado ahora tomamos el promedio para calcular la condición del alumno
						 * , como lo detalló el profe en el foro de dudas ( <INSERTE LINK al mensaje del profe> ). */
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
				}
					
								
			}
		});
		
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNota.setText("");
				textNota2.setText("");
				textNota_3.setText("");
				textPromedio.setText("");
				textCondicion.setText("");				
			}
		});	
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		
	}
}
