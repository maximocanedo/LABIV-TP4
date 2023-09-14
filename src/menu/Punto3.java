package menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Punto3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField txtCantidadDeHorasFrenteAlOrdenador;

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
		setTitle("Tercer ejercicio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[424px]", "[62px][62px][62px][62px]"));
		
		JPanel panelSistemaOperativo = new JPanel();
		contentPane.add(panelSistemaOperativo, "cell 0 0,grow");
		panelSistemaOperativo.setLayout(new MigLayout("", "[][126px][69px][45px][51px][]", "[23px,grow]"));
		
		Component horizontalGlue = Box.createHorizontalGlue();
		panelSistemaOperativo.add(horizontalGlue, "cell 0 0");
		
		JLabel lbElijaUnSistemaOperativo = new JLabel("Elija un sistema operativo:");
		panelSistemaOperativo.add(lbElijaUnSistemaOperativo, "cell 1 0,alignx left,aligny center");
		
		JRadioButton rdWindows = new JRadioButton("Windows");
		panelSistemaOperativo.add(rdWindows, "cell 2 0,alignx left,growy");
		
		JRadioButton rdMac = new JRadioButton("Mac");
		panelSistemaOperativo.add(rdMac, "cell 3 0,growx,aligny center");
		
		JRadioButton rdLinux = new JRadioButton("Linux");
		panelSistemaOperativo.add(rdLinux, "cell 4 0,alignx left,aligny center");
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		panelSistemaOperativo.add(horizontalGlue_1, "cell 5 0");
		
		JPanel panelEspecialidad = new JPanel();
		contentPane.add(panelEspecialidad, "cell 0 1,grow");
		panelEspecialidad.setLayout(new MigLayout("", "[][][][grow]", "[100px,grow]"));
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		panelEspecialidad.add(horizontalGlue_2, "cell 0 0");
		
		JLabel lbElijaUnaEspecialidad = new JLabel("Elija una especialidad:");
		panelEspecialidad.add(lbElijaUnaEspecialidad, "cell 1 0");
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		panelEspecialidad.add(horizontalGlue_3, "cell 2 0");
		
		JPanel panelConCheckboxesEspecialidad = new JPanel();
		panelEspecialidad.add(panelConCheckboxesEspecialidad, "cell 3 0,grow");
		panelConCheckboxesEspecialidad.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox cbProgramacion = new JCheckBox("Programaci\u00F3n");
		panelConCheckboxesEspecialidad.add(cbProgramacion);
		
		JCheckBox cbAdministracion = new JCheckBox("Administraci\u00F3n");
		panelConCheckboxesEspecialidad.add(cbAdministracion);
		
		JCheckBox cbDiseñoGrafico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		panelConCheckboxesEspecialidad.add(cbDiseñoGrafico);
		
		JPanel panelHoras = new JPanel();
		contentPane.add(panelHoras, "cell 0 2,grow");
		panelHoras.setLayout(new MigLayout("", "[][grow]", "[100px,grow]"));
		
		JLabel lbCantidadDeHorasFrenteAlOrdenador = new JLabel("Cantidad de horas frente al ordenador:");
		panelHoras.add(lbCantidadDeHorasFrenteAlOrdenador, "cell 0 0,alignx trailing");
		
		txtCantidadDeHorasFrenteAlOrdenador = new JTextField();
		panelHoras.add(txtCantidadDeHorasFrenteAlOrdenador, "cell 1 0,growx");
		txtCantidadDeHorasFrenteAlOrdenador.setColumns(10);
		
		JPanel panelAceptar = new JPanel();
		contentPane.add(panelAceptar, "cell 0 3,grow");
		panelAceptar.setLayout(new MigLayout("", "[71px,grow]", "[23px,grow]"));
		
		JButton btnAceptar = new JButton("Aceptar");
		panelAceptar.add(btnAceptar, "cell 0 0,alignx center,aligny center");
	}

}
