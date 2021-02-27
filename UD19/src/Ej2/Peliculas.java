package Ej2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Peliculas extends JFrame {

	private JPanel contentPane;
	private JTextField CampoTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Peliculas frame = new Peliculas();
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
	public Peliculas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escribe el titulo de una pelicula");
		lblNewLabel.setBounds(10, 86, 152, 14);
		contentPane.add(lblNewLabel);
		
		CampoTexto = new JTextField();
		CampoTexto.setBounds(10, 118, 152, 20);
		contentPane.add(CampoTexto);
		CampoTexto.setColumns(10);
		
		JComboBox Desplegable = new JComboBox();
		Desplegable.setBounds(238, 117, 127, 22);
		contentPane.add(Desplegable);
		
		JButton BotonAnadir = new JButton("A\u00F1adir");
		BotonAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pelicula = CampoTexto.getText();
				Desplegable.addItem(pelicula);
			}
		});
		BotonAnadir.setBounds(35, 164, 89, 23);
		contentPane.add(BotonAnadir);
		
		JLabel lblNewLabel_1 = new JLabel("Peliculas");
		lblNewLabel_1.setBounds(267, 86, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		

	}
}
