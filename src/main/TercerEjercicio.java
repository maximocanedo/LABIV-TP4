package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TercerEjercicio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TercerEjercicio frame = new TercerEjercicio();
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
	public TercerEjercicio() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow]", "[grow][grow][grow][grow]"));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		contentPane.add(panel, "cell 0 0,grow");
		
		JLabel lblElegSistemaOperativo = new JLabel("Eleg\u00ED sistema operativo:");
		panel.add(lblElegSistemaOperativo);
		
		JRadioButton rdbtnWindows = new JRadioButton("Windows");
		panel.add(rdbtnWindows);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		panel.add(rdbtnMac);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		panel.add(rdbtnLinux);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "cell 0 1,grow");
		
		JLabel lblEligeUnaEspecialidad = new JLabel("Elige una especialidad:");
		panel_1.add(lblEligeUnaEspecialidad);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JCheckBox chckbxProgramacin = new JCheckBox("Programaci\u00F3n");
		panel_4.add(chckbxProgramacin);
		
		JCheckBox chckbxAdministracin = new JCheckBox("Administraci\u00F3n");
		panel_4.add(chckbxAdministracin);
		
		JCheckBox chckbxDiseoGrfico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		panel_4.add(chckbxDiseoGrfico);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, "cell 0 2,grow");
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas en el ordenador: ");
		panel_2.add(lblCantidadDeHoras);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, "cell 0 3,grow");
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sistemaOperativo = rdbtnWindows.isSelected() ? "Windows" : (rdbtnMac.isSelected() ? "Mac" : (rdbtnLinux.isSelected() ? "Linux" : "Sin especificar"));
				String especialidades = "";
				if(chckbxProgramacin.isSelected()) especialidades += "Programación; ";
				if(chckbxAdministracin.isSelected()) especialidades += "Administración; ";
				if(chckbxDiseoGrfico.isSelected()) especialidades += "Diseño Gráfico; ";
				
				try {
					int horas = Integer.parseInt(textField.getText());
					String finalMessage = sistemaOperativo + " - " + especialidades + " " + horas + "hs. ";
					JOptionPane.showMessageDialog(null, finalMessage, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			        
				} catch(NumberFormatException err) {
					System.out.println("El valor ingresado no es un número. ");
					return;
				}
				
			}
		});
		panel_3.add(btnAceptar);
	}

}
