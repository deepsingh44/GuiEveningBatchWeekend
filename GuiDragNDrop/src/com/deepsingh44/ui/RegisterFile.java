package com.deepsingh44.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.deepsingh44.utility.Util;

import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class RegisterFile extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterFile frame = new RegisterFile();
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
	public RegisterFile() {
		setTitle("Register Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 51));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(10, 11, 272, 412);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(Util.resizeImage(new ImageIcon(RegisterFile.class.getResource("/com/deepsingh44/images/login.png")),252, 179));
		lblNewLabel.setBounds(10, 11, 252, 179);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("<html>Google was founded in September 1998 by Larry Page and Sergey Brin while they were Ph.D. students at Stanford University in California. Google is Alphabet's leading subsidiary and will continue to be the umbrella company for Alphabet's Internet interests. Google is Alphabet's leading subsidiary and will continue to be the umbrella company for Alphabet's Internet interests.</html>");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Serif", Font.PLAIN, 12));
		label.setBounds(10, 207, 252, 168);
		panel.add(label);;
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 51));
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(292, 11, 360, 412);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblRegisterForm = new JLabel("Register Form",JLabel.CENTER);
		lblRegisterForm.setFont(new Font("Serif", Font.BOLD, 14));
		lblRegisterForm.setForeground(new Color(255, 255, 255));
		lblRegisterForm.setBounds(127, 11, 114, 22);
		panel_1.add(lblRegisterForm);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(Util.resizeImage(new ImageIcon(RegisterFile.class.getResource("/com/deepsingh44/images/profile.jpeg")), 144, 122));
		label_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_1.setBounds(110, 44, 144, 122);
		panel_1.add(label_1);
		
		JLabel lblEnterName = new JLabel("Enter Name");
		lblEnterName.setForeground(new Color(255, 255, 255));
		lblEnterName.setBounds(31, 188, 105, 14);
		panel_1.add(lblEnterName);
		
		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(31, 205, 301, 30);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterEmail = new JLabel("Enter Email");
		lblEnterEmail.setForeground(Color.WHITE);
		lblEnterEmail.setBounds(31, 245, 105, 14);
		panel_1.add(lblEnterEmail);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(31, 262, 301, 30);
		panel_1.add(textField_1);
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		lblEnterPassword.setForeground(Color.WHITE);
		lblEnterPassword.setBounds(31, 303, 105, 14);
		panel_1.add(lblEnterPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(31, 318, 301, 30);
		panel_1.add(passwordField);
		
		JButton btnSubmitHere = new JButton("Submit Here");
		btnSubmitHere.setBackground(new Color(0, 102, 153));
		btnSubmitHere.setForeground(new Color(255, 255, 255));
		btnSubmitHere.setBounds(31, 367, 169, 30);
		panel_1.add(btnSubmitHere);
		
		JButton btnLoginHere = new JButton("Login Here");
		btnLoginHere.setBackground(new Color(0, 102, 153));
		btnLoginHere.setForeground(new Color(255, 255, 255));
		btnLoginHere.setBounds(210, 367, 122, 30);
		panel_1.add(btnLoginHere);
	}
}
