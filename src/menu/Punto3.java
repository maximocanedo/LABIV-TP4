package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Punto3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JPanel panelSistemaOperativo;
	private JLabel lbElijaUnSistemaOperativo;
	private JPanel panelEspecialidad;
	private JTextField txtCantidadDeHoras;
	private JLabel lbElijaUnaEspecialidad;
	private JPanel panelConCheckboxesEspecialidad;
	private JRadioButton rdWindows;
	private Component horizontalGlue;
	private JRadioButton rdMac;
	private JRadioButton rdLinux;
	private Component horizontalGlue_1;
	private Component horizontalGlue_2 ;
	private Component horizontalGlue_3;
	private JCheckBox cbProgramacion;
	private JPanel panelAceptar;
	private JButton btnAceptar;
	private JPanel panelHoras;
	private JLabel lbCantidadDeHorasFrenteAlOrdenador;
	private JCheckBox cbDise�oGrafico;
	private JCheckBox cbAdministracion;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	
	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Punto3() {
		initLayout();
		initComponents();
		initUi();
		initListeners();
		
		
		
		
	}

	private void initLayout() {

		setTitle("Tercer ejercicio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[424px]", "[62px][62px][62px][62px]"));
		
	}

	private void initComponents() {
		panelSistemaOperativo = new JPanel();
		lbElijaUnSistemaOperativo = new JLabel("Elija un sistema operativo:");
		panelEspecialidad = new JPanel();
		lbElijaUnaEspecialidad = new JLabel("Elija una especialidad:");
		panelConCheckboxesEspecialidad = new JPanel();
		rdWindows = new JRadioButton("Windows");
		buttonGroup.add(rdWindows);
		horizontalGlue = Box.createHorizontalGlue();
		rdMac = new JRadioButton("Mac");
		buttonGroup.add(rdMac);
		rdLinux = new JRadioButton("Linux");
		buttonGroup.add(rdLinux);
		horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalGlue_3 = Box.createHorizontalGlue();
		cbProgramacion = new JCheckBox("Programaci\u00F3n");
		panelAceptar = new JPanel();
		btnAceptar = new JButton("Aceptar");
		panelHoras = new JPanel();
		lbCantidadDeHorasFrenteAlOrdenador = new JLabel("Cantidad de horas frente al ordenador:");
		cbDise�oGrafico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		cbAdministracion = new JCheckBox("Administraci\u00F3n");
		
	}

	private void initUi() {
		contentPane.add(panelSistemaOperativo, "cell 0 0,grow");
		
		panelSistemaOperativo.setLayout(new MigLayout("", "[][126px][69px][45px][51px][]", "[23px,grow]"));
		
		panelSistemaOperativo.add(horizontalGlue, "cell 0 0");
		
		
		panelSistemaOperativo.add(lbElijaUnSistemaOperativo, "cell 1 0,alignx left,aligny center");
		
		panelConCheckboxesEspecialidad.add(cbProgramacion);
		panelSistemaOperativo.add(rdWindows, "cell 2 0,alignx left,growy");
		
		panelSistemaOperativo.add(rdMac, "cell 3 0,growx,aligny center");
		
		panelSistemaOperativo.add(rdLinux, "cell 4 0,alignx left,aligny center");
		
		panelSistemaOperativo.add(horizontalGlue_1, "cell 5 0");
		txtCantidadDeHoras = new JTextField();
		

		
		contentPane.add(panelEspecialidad, "cell 0 1,grow");
		panelEspecialidad.setLayout(new MigLayout("", "[][][][grow]", "[100px,grow]"));
		
		panelEspecialidad.add(horizontalGlue_2, "cell 0 0");
		
		
		panelEspecialidad.add(lbElijaUnaEspecialidad, "cell 1 0");
		
		panelEspecialidad.add(horizontalGlue_3, "cell 2 0");
		
		
		panelEspecialidad.add(panelConCheckboxesEspecialidad, "cell 3 0,grow");
		panelConCheckboxesEspecialidad.setLayout(new GridLayout(0, 1, 0, 0));
		
		panelConCheckboxesEspecialidad.add(cbAdministracion);
		panelConCheckboxesEspecialidad.add(cbDise�oGrafico);
		contentPane.add(panelHoras, "cell 0 2,grow");
		panelHoras.setLayout(new MigLayout("", "[][grow]", "[100px,grow]"));
		
		panelHoras.add(lbCantidadDeHorasFrenteAlOrdenador, "cell 0 0,alignx trailing");
		
		panelHoras.add(txtCantidadDeHoras, "cell 1 0,growx");
		txtCantidadDeHoras.setColumns(10);
		
		
		
		contentPane.add(panelAceptar, "cell 0 3,grow");
		panelAceptar.setLayout(new MigLayout("", "[71px,grow]", "[23px,grow]"));
		
		
		panelAceptar.add(btnAceptar, "cell 0 0,alignx center,aligny center");
		
	}

	private void initListeners() {
		txtCantidadDeHoras.addKeyListener(new KeyAdapter() {
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
					
				JOptionPane.showMessageDialog(null, sistema + especialidad + " - "+txtCantidadDeHoras.getText() +"Hs");
			}
		});//fin btnaceptar
	}
	
	
	public String SistemaOperativoSeleccionado() {
		
		String sistema=null;
		if(rdWindows.isSelected()) {
			sistema=rdWindows.getText();
		}
		else if(rdMac.isSelected()) {
			sistema=rdMac.getText();
		}
		else if(rdLinux.isSelected()) {
			sistema=rdLinux.getText();
		}
		return sistema;
	}
	
	public String EspecialidadSeleccionada() {
		String seleccion="";
		if(cbProgramacion.isSelected()) {
			seleccion+=" - "+cbProgramacion.getText();
		}
		if(cbDise�oGrafico.isSelected()) {
			seleccion+=" - "+cbDise�oGrafico.getText();
		}
		if(cbAdministracion.isSelected()) {
			seleccion+=" - "+cbAdministracion.getText();
		}
		return seleccion;
	}
}
