package Ej4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textNum1;
	private JTextField textNum2;
	private JTextField Result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNum1 = new JTextField();
		textNum1.setBounds(10, 39, 86, 20);
		contentPane.add(textNum1);
		textNum1.setColumns(10);
		
		textNum2 = new JTextField();
		textNum2.setBounds(106, 39, 86, 20);
		contentPane.add(textNum2);
		textNum2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Num1");
		lblNewLabel.setBounds(26, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Num2");
		lblNewLabel_1.setBounds(127, 14, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Operaciones");
		lblNewLabel_2.setBounds(26, 88, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		Result = new JTextField();
		Result.setBounds(270, 39, 86, 20);
		contentPane.add(Result);
		Result.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setBounds(286, 14, 48, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1=Double.parseDouble(textNum1.getText());
				double num2=Double.parseDouble(textNum2.getText());
				String result=String.valueOf(num1+num2);
				Result.setText(result);
			}
		});
		suma.setBounds(10, 127, 41, 23);
		contentPane.add(suma);
		
		JButton resta = new JButton("-");
		resta.setBounds(55, 127, 41, 23);
		contentPane.add(resta);
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1=Double.parseDouble(textNum1.getText());
				double num2=Double.parseDouble(textNum2.getText());
				String result=String.valueOf(num1-num2);
				Result.setText(result);
			}
		});

		
		JButton mult = new JButton("x");
		mult.setBounds(10, 161, 41, 23);
		contentPane.add(mult);
		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1=Double.parseDouble(textNum1.getText());
				double num2=Double.parseDouble(textNum2.getText());
				String result=String.valueOf(num1*num2);
				Result.setText(result);
			}
		});

		
		JButton div = new JButton("/");
		div.setBounds(55, 161, 41, 23);
		contentPane.add(div);
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1=Double.parseDouble(textNum1.getText());
				double num2=Double.parseDouble(textNum2.getText());
				String result=String.valueOf(num1/num2);
				Result.setText(result);
			}
		});

		JButton btnNewButton_3 = new JButton("Salir");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBounds(267, 127, 89, 23);
		contentPane.add(btnNewButton_3);
		
	}

}
