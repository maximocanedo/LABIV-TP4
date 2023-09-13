package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SegundoEjercicio extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;
	private JTextField txtCondicion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SegundoEjercicio frame = new SegundoEjercicio();
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
	public SegundoEjercicio() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 484, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][]", "[][grow][]"));
		
		Component verticalGlue = Box.createVerticalGlue();
		contentPane.add(verticalGlue, "cell 1 0");
		
		Component horizontalGlue = Box.createHorizontalGlue();
		contentPane.add(horizontalGlue, "cell 0 1");
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "cell 1 1,grow");
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new MigLayout("", "[71px]", "[59px][59px][59px]"));
		
		JButton btnCalcular = new JButton("Calcular");
		
		panel_1.add(btnCalcular, "cell 0 0,growx,aligny center");
		
		JButton btnNuevo = new JButton("Nuevo");
		
		panel_1.add(btnNuevo, "cell 0 1,growx,aligny center");
		
		JButton btnSalir = new JButton("Salir");
		panel_1.add(btnSalir, "cell 0 2,growx,aligny center");
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.SOUTH);
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4);
		panel_4.setLayout(new MigLayout("", "[][grow]", "[][]"));
		
		JLabel lblPromedio = new JLabel("Promedio:");
		panel_4.add(lblPromedio, "cell 0 0,alignx trailing");
		
		txtPromedio = new JTextField();
		txtPromedio.setEditable(false);
		panel_4.add(txtPromedio, "cell 1 0,growx");
		txtPromedio.setColumns(10);
		
		JLabel lblCondicin = new JLabel("Condici\u00F3n:");
		panel_4.add(lblCondicin, "cell 0 1,alignx trailing");
		
		txtCondicion = new JTextField();
		txtCondicion.setEditable(false);
		panel_4.add(txtCondicion, "cell 1 1,growx");
		txtCondicion.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.CENTER);
		
		JPanel panelNotasGroup = new JPanel();
		panel_3.add(panelNotasGroup);
		Border titleBorder = new TitledBorder(new LineBorder(Color.BLACK), "Notas del estudiante");
		panelNotasGroup.setBorder(titleBorder);
		panelNotasGroup.setLayout(new MigLayout("", "[][46px][86px,grow][]", "[][20px][][][][]"));
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		panelNotasGroup.add(verticalGlue_2, "cell 1 0");
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		panelNotasGroup.add(horizontalGlue_2, "cell 0 1");
		
		JLabel lblNota_2 = new JLabel("Nota 1:");
		lblNota_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panelNotasGroup.add(lblNota_2, "cell 1 1,alignx right,aligny center");
		
		txtNota1 = new JTextField();
		panelNotasGroup.add(txtNota1, "cell 2 1,alignx left,aligny top");
		txtNota1.setColumns(10);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		panelNotasGroup.add(horizontalGlue_3, "cell 3 1");
		
		JLabel lblNota = new JLabel("Nota 2:");
		panelNotasGroup.add(lblNota, "cell 1 2,alignx trailing");
		
		txtNota2 = new JTextField();
		panelNotasGroup.add(txtNota2, "cell 2 2,growx");
		txtNota2.setColumns(10);
		
		JLabel lblNota_1 = new JLabel("Nota 3:");
		panelNotasGroup.add(lblNota_1, "cell 1 3,alignx trailing");
		
		txtNota3 = new JTextField();
		panelNotasGroup.add(txtNota3, "cell 2 3,growx");
		txtNota3.setColumns(10);
		
		JLabel lblTps = new JLabel("TPs:");
		panelNotasGroup.add(lblTps, "cell 1 4,alignx trailing");
		
		JComboBox<String> comboTPs = new JComboBox<String>();
		comboTPs.setModel(new DefaultComboBoxModel<String>(new String[] {"Aprobado", "Desaprobado"}));
		
		panelNotasGroup.add(comboTPs, "cell 2 4,growx");
		
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x = "";
				txtNota1.setText(x);
				txtNota2.setText(x);
				txtNota3.setText(x);
				txtPromedio.setText(x);
				txtCondicion.setText(x);
				comboTPs.setSelectedIndex(0);
			}
		});
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Recolectar datos
				int n1, n2, n3, tps;
				String nota1, nota2, nota3;
				
				nota1 = txtNota1.getText();
				nota2 = txtNota2.getText();
				nota3 = txtNota3.getText();
				tps = comboTPs.getSelectedIndex();
				
				try {
					n1 = Integer.parseInt(nota1);
					n2 = Integer.parseInt(nota2);
					n3 = Integer.parseInt(nota3);
					
					// Validaciones
					boolean LIBRE = (tps == 1) || (n1 < 6 || n2 < 6 || n3 < 6);
					boolean REGULAR = (tps == 0) && (n1 >= 6 && n1 < 8) && (n2 >= 6 && n2 < 8) && (n3 >= 6 && n3 < 8);
					boolean PROMOCIONADO = (tps == 0) && (n1 >= 8 && n2 >= 8 && n3 >= 8);
					
					float promedio = (n1 + n2 + n3) / 3;
					
					txtCondicion.setText(LIBRE ? "LIBRE" : (REGULAR ? "REGULAR" : (PROMOCIONADO ? "PROMOCIONADO" : "ERROR DE CÁLCULO")));
					
					txtPromedio.setText(Float.toString(promedio));
					
					
				} catch(NumberFormatException err) {
					System.out.println("Sólo se permite el ingreso de números. ");
					return;
				} finally {
					
					
				}
				
				
				
			}
		});
		
		Component verticalGlue_3 = Box.createVerticalGlue();
		panelNotasGroup.add(verticalGlue_3, "cell 1 5");
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		contentPane.add(horizontalGlue_1, "cell 2 1");
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		contentPane.add(verticalGlue_1, "cell 1 2");
	}

}
