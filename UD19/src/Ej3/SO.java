package Ej3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;

import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Iterator;
import javax.swing.JCheckBox;

public class SO extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SO frame = new SO();
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
	public SO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistema Opertaivo");
		lblNewLabel.setBounds(10, 55, 94, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 105, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnLinux = new JRadioButton("Linux");
		buttonGroup.add(rdbtnLinux);
		rdbtnLinux.setBounds(10, 131, 109, 23);
		contentPane.add(rdbtnLinux);
		
		JRadioButton rdbtnMac = new JRadioButton("Mac");
		buttonGroup.add(rdbtnMac);
		rdbtnMac.setBounds(10, 157, 109, 23);
		contentPane.add(rdbtnMac);
		
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setBounds(156, 55, 65, 14);
		contentPane.add(lblEspecialidad);
		
		JLabel lblNewLabel_1 = new JLabel("Horas dedicadas");
		lblNewLabel_1.setBounds(278, 55, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		JSlider slider = new JSlider();
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setBounds(269, 102, 88, 26);
		contentPane.add(slider);
		
		JButton btnNewButton = new JButton("Enviar");

		
		btnNewButton.setAction(action);
		btnNewButton.setBounds(166, 204, 89, 23);
		contentPane.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programacion");
		chckbxNewCheckBox.setBounds(137, 105, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxDiseoGrafico = new JCheckBox("Dise\u00F1o Grafico");
		chckbxDiseoGrafico.setBounds(137, 131, 97, 23);
		contentPane.add(chckbxDiseoGrafico);
		
		JCheckBox chckbxAdministracion = new JCheckBox("Administracion");
		chckbxAdministracion.setBounds(137, 157, 97, 23);
		contentPane.add(chckbxAdministracion);
		

		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String checkBox="";
				if(chckbxNewCheckBox.isSelected()) {
					checkBox+=chckbxNewCheckBox.getText();
				}
				if(chckbxDiseoGrafico.isSelected()) {
					if(chckbxNewCheckBox.isSelected())
					checkBox+=" "+chckbxDiseoGrafico.getText();
					else
						checkBox+=chckbxDiseoGrafico.getText();

				}
				if(chckbxAdministracion.isSelected()) {
					if(chckbxNewCheckBox.isSelected() || chckbxDiseoGrafico.isSelected())
					checkBox+=" "+chckbxAdministracion.getText();
					else
						checkBox+=chckbxAdministracion.getText();
				}

				JOptionPane.showMessageDialog(contentPane, "SO: "+getSelectedButtonText(buttonGroup)+" "
						+ "\n Especialidad: "+checkBox+"\n Horas: "+slider.getValue());
			}
		});
		
	}
	
	String getSelectedButtonText(ButtonGroup buttonGroup) {
		for (Enumeration buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
			AbstractButton button = (AbstractButton) buttons.nextElement();
			if(button.isSelected()) {
				return button.getText();
			}
		}
		
		return null;
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
}
