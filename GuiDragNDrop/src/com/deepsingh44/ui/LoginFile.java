package com.deepsingh44.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import com.deepsingh44.utility.Util;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class LoginFile extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFile frame = new LoginFile();
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
	public LoginFile() {
		LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
		/*
		 * for(int i=0;i<looks.length;i++) {
		 * System.out.println(looks[i].getClassName()); }
		 */
		try {
			UIManager.setLookAndFeel(looks[1].getClassName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		setResizable(false);
		setTitle("Login Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 473);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(0, 51, 51));
		panel.setBounds(10, 11, 302, 412);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(
				Util.resize(new ImageIcon(LoginFile.class.getResource("/com/deepsingh44/images/login.png")), 282, 190));
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel.setBounds(10, 11, 282, 190);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(
				"<html>Google was founded in September 1998 by Larry Page and Sergey Brin while they were Ph.D. students at Stanford University in California. Google is Alphabet's leading subsidiary and will continue to be the umbrella company for Alphabet's Internet interests. Google is Alphabet's leading subsidiary and will continue to be the umbrella company for Alphabet's Internet interests.</html>");
		lblNewLabel_1.setFont(new Font("Serif", Font.PLAIN, 12));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 212, 282, 168);
		panel.add(lblNewLabel_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBackground(new Color(0, 51, 51));
		panel_1.setBounds(322, 11, 330, 412);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Login Form", JLabel.CENTER);
		lblNewLabel_2.setFont(new Font("Serif", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(62, 23, 221, 24);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(Util
				.resize(new ImageIcon(LoginFile.class.getResource("/com/deepsingh44/images/profile.jpeg")), 144, 122));
		lblNewLabel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_3.setBounds(96, 69, 144, 122);
		panel_1.add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(33, 227, 270, 30);
		panel_1.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		passwordField.setBounds(33, 272, 270, 30);
		panel_1.add(passwordField);

		JLabel lblEmailId = new JLabel("Email Id :");
		lblEmailId.setFont(new Font("Serif", Font.PLAIN, 10));
		lblEmailId.setForeground(new Color(255, 255, 255));
		lblEmailId.setBounds(33, 210, 91, 14);
		panel_1.add(lblEmailId);

		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Serif", Font.PLAIN, 10));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(33, 257, 91, 14);
		panel_1.add(lblPassword);

		JButton btnLoginHere = new JButton("Login");
		btnLoginHere.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLoginHere.setForeground(new Color(255, 255, 255));
		btnLoginHere.setFont(new Font("Serif", Font.BOLD, 10));
		btnLoginHere.setBackground(new Color(0, 102, 153));
		btnLoginHere.setBounds(33, 349, 134, 30);
		panel_1.add(btnLoginHere);

		JCheckBox chckbxForgetPassword = new JCheckBox("Forget Password");
		chckbxForgetPassword.setForeground(new Color(255, 255, 255));
		chckbxForgetPassword.setBackground(new Color(0, 51, 51));
		chckbxForgetPassword.setFont(new Font("Serif", Font.PLAIN, 10));
		chckbxForgetPassword.setBounds(198, 309, 105, 23);
		panel_1.add(chckbxForgetPassword);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Serif", Font.BOLD, 10));
		btnRegister.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRegister.setBackground(new Color(0, 102, 153));
		btnRegister.setBounds(177, 349, 134, 30);
		panel_1.add(btnRegister);
	}
}
