package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.JToolBar;
import javax.swing.Box;
import java.awt.Component;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblUniversidadTecnolgicaNacional = new JLabel("Trabajo Pr\u00E1ctico N.\u00BA 4");
		lblUniversidadTecnolgicaNacional.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUniversidadTecnolgicaNacional.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblUniversidadTecnolgicaNacional);
		
		JLabel lblTecnicaturaUniversitariaEn = new JLabel("Laboratorio de Computaci\u00F3n IV \u00B7 Grupo N.\u00BA 3");
		lblTecnicaturaUniversitariaEn.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblTecnicaturaUniversitariaEn);
		
		JLabel lblLaboratorioDeComputacin = new JLabel("Resoluci\u00F3n de M\u00E1ximo Canedo");
		lblLaboratorioDeComputacin.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblLaboratorioDeComputacin);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		verticalBox.add(panel_1);
		panel_1.setLayout(new MigLayout("", "[89px,grow][89px,grow][89px,grow]", "[23px][][]"));
		
		JButton btnNewButton_2 = new JButton("Primer ejercicio");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PrimerEjercicio.main(null);
			}
		});
		panel_1.add(btnNewButton_2, "cell 1 0,alignx center,aligny center");
		
		JButton btnNewButton = new JButton("Segundo ejercicio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SegundoEjercicio.main(null);
			}
		});
		panel_1.add(btnNewButton, "cell 1 1,alignx center,aligny center");
		
		JButton btnNewButton_1 = new JButton("Tercer ejercicio");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TercerEjercicio.main(null);
			}
		});
		panel_1.add(btnNewButton_1, "cell 1 2,alignx center,aligny center");
	}

}
