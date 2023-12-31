package menu;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;


public class Punto3 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JRadioButton rdbtnWin;
	private JRadioButton rdbtnMac;
	private JRadioButton rdbtnLinux;
	private JCheckBox chckbxProg;
	private JCheckBox chckbxAdmin;
	private JCheckBox chckbxDisen;
	private JTextField txtHoras;
	private JButton btnAceptar;
	private JPanel panel1;
	private JPanel panel2;
	private JLabel lblTexto;
	private JLabel lblElijeUnaEspecialidad;
	private JLabel lblCantidadDeHoras;
	
	
	public static void abrirVentana() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Punto3 frame = new Punto3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Punto3() {
		initLayout();
		initComponents();
		initUi();
		initListeners();		
	}

	private void initLayout() {
		
		this.setSize(new Dimension(490,340));
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle("Selecci�n m�ltiple");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	}

	private void initComponents() {
		
		panel1 = new JPanel();
		lblTexto = new JLabel("Elije un sistema operativo");				
		rdbtnWin = new JRadioButton("Windows",true);				
		rdbtnMac = new JRadioButton("Mac",false);		
		rdbtnLinux = new JRadioButton("Linux",false);
		
		
		ButtonGroup grupoRadioBtn = new ButtonGroup();
		grupoRadioBtn.add(rdbtnWin);
		grupoRadioBtn.add(rdbtnMac);
		grupoRadioBtn.add(rdbtnLinux);		
		
		panel2 = new JPanel();		
		
		lblElijeUnaEspecialidad = new JLabel("Elije una especialidad");		
		
		chckbxProg = new JCheckBox("Programaci\u00F3n");		
		
		chckbxAdmin = new JCheckBox("Administraci\u00F3n");
				
		chckbxDisen = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
				
		lblCantidadDeHoras = new JLabel("Cantidad de horas en el computador: ");		
		
		txtHoras = new JTextField(10);				
		txtHoras.setText("");
		
		btnAceptar = new JButton("Aceptar");
				
	}

	private void initUi() {
		
		Border bordeLinea = new LineBorder(Color.BLACK,2,true);
		
		panel1.setBounds(10, 11, 454, 62);
		panel1.setBorder(bordeLinea);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		lblTexto.setBounds(25, 22, 156, 14);
		panel1.add(lblTexto);
		
		rdbtnWin.setBounds(204, 18, 91, 23);
		panel1.add(rdbtnWin);
		
		rdbtnMac.setBounds(297, 18, 56, 23);
		panel1.add(rdbtnMac);
		
		rdbtnLinux.setBounds(370, 18, 56, 23);
		panel1.add(rdbtnLinux);
		
		panel2.setBounds(10, 81, 454, 103);
		panel2.setBorder(bordeLinea);
		contentPane.add(panel2);
		panel2.setLayout(null);
		
		lblElijeUnaEspecialidad.setBounds(27, 43, 122, 14);
		panel2.add(lblElijeUnaEspecialidad);
		
		chckbxProg.setBounds(211, 7, 135, 23);
		panel2.add(chckbxProg);
		
		chckbxAdmin.setBounds(211, 39, 135, 23);
		panel2.add(chckbxAdmin);
		
		chckbxDisen.setBounds(211, 73, 135, 23);
		panel2.add(chckbxDisen);
		
		lblCantidadDeHoras.setBounds(35, 214, 221, 14);
		contentPane.add(lblCantidadDeHoras);
		
		txtHoras.setBounds(266, 211, 86, 20);
		contentPane.add(txtHoras);
		
		btnAceptar.setBounds(302, 260, 89, 23);
		contentPane.add(btnAceptar);		
	}

	private void initListeners() {
		txtHoras.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Validaciones.JtextFieldEsNumero(evt);
				Validaciones.JtextFieldEsPositivo(evt);				
			}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sistema = SistemaOperativoSeleccionado();
				String especialidad = EspecialidadSeleccionada();
				if(especialidad=="") {
					JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR AL MENOS 1 ESPECIALIDAD.", "INGRESO INCORRECTO", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(txtHoras.getText().trim().toString()=="") {
					JOptionPane.showMessageDialog(null, "EL CAMPO DE HORA NO PUEDE ESTAR VACIO", "INGRESO INCORRECTO", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else {
				JOptionPane.showMessageDialog(null, sistema + especialidad + " - "+txtHoras.getText().trim().toString() +"Hs");
				}
			}
		});
	}
	
	
	public String SistemaOperativoSeleccionado() {
		
		String sistema=null;
		if(rdbtnWin.isSelected()) {
			sistema=rdbtnWin.getText();
		}
		else if(rdbtnMac.isSelected()) {
			sistema=rdbtnMac.getText();
		}
		else if(rdbtnLinux.isSelected()) {
			sistema=rdbtnLinux.getText();
		}
		return sistema;
	}
	
	public String EspecialidadSeleccionada() {
		String seleccion="";
		if(chckbxProg.isSelected()) {
			seleccion+=" - "+chckbxProg.getText();
		}
		if(chckbxDisen.isSelected()) {
			seleccion+=" - "+chckbxDisen.getText();
		}
		if(chckbxAdmin.isSelected()) {
			seleccion+=" - "+chckbxAdmin.getText();
		}
		return seleccion;
	}
}
