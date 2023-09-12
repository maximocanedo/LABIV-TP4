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
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class SegundoEjercicio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		textField = new JTextField();
		panelNotasGroup.add(textField, "cell 2 1,alignx left,aligny top");
		textField.setColumns(10);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		panelNotasGroup.add(horizontalGlue_3, "cell 3 1");
		
		JLabel lblNota = new JLabel("Nota 2:");
		panelNotasGroup.add(lblNota, "cell 1 2,alignx trailing");
		
		textField_1 = new JTextField();
		panelNotasGroup.add(textField_1, "cell 2 2,growx");
		textField_1.setColumns(10);
		
		JLabel lblNota_1 = new JLabel("Nota 3:");
		panelNotasGroup.add(lblNota_1, "cell 1 3,alignx trailing");
		
		textField_2 = new JTextField();
		panelNotasGroup.add(textField_2, "cell 2 3,growx");
		textField_2.setColumns(10);
		
		JLabel lblTps = new JLabel("TPs:");
		panelNotasGroup.add(lblTps, "cell 1 4,alignx trailing");
		
		JComboBox comboBox = new JComboBox();
		panelNotasGroup.add(comboBox, "cell 2 4,growx");
		
		Component verticalGlue_3 = Box.createVerticalGlue();
		panelNotasGroup.add(verticalGlue_3, "cell 1 5");
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		contentPane.add(horizontalGlue_1, "cell 2 1");
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		contentPane.add(verticalGlue_1, "cell 1 2");
	}

}
