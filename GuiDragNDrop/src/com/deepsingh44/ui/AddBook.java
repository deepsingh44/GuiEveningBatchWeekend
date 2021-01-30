package com.deepsingh44.ui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.deepsingh44.utility.Util;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.awt.event.ActionEvent;

public class AddBook extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField timagelocation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBook frame = new AddBook();
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
	public AddBook() {
		setTitle("Add Book");
		setIconifiable(true);
		setClosable(true);
		setBounds(85, 10, 535, 352);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 102));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblNewLabel.setBounds(191, 11, 140, 105);
		panel.add(lblNewLabel);

		JLabel lblBookTitle = new JLabel("Book Title");
		lblBookTitle.setForeground(Color.WHITE);
		lblBookTitle.setFont(new Font("Serif", Font.PLAIN, 10));
		lblBookTitle.setBounds(28, 127, 91, 14);
		panel.add(lblBookTitle);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField.setBounds(28, 144, 205, 30);
		panel.add(textField);

		JLabel lblBookAuthor = new JLabel("Book Author");
		lblBookAuthor.setForeground(Color.WHITE);
		lblBookAuthor.setFont(new Font("Serif", Font.PLAIN, 10));
		lblBookAuthor.setBounds(276, 127, 91, 14);
		panel.add(lblBookAuthor);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_1.setBounds(276, 144, 205, 30);
		panel.add(textField_1);

		JLabel lblBookPrice = new JLabel("Book Price");
		lblBookPrice.setForeground(Color.WHITE);
		lblBookPrice.setFont(new Font("Serif", Font.PLAIN, 10));
		lblBookPrice.setBounds(28, 185, 205, 14);
		panel.add(lblBookPrice);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textField_2.setBounds(28, 202, 205, 30);
		panel.add(textField_2);

		JLabel lblBookImage = new JLabel("Book Image");
		lblBookImage.setForeground(Color.WHITE);
		lblBookImage.setFont(new Font("Serif", Font.PLAIN, 10));
		lblBookImage.setBounds(276, 185, 205, 14);
		panel.add(lblBookImage);

		timagelocation = new JTextField();
		timagelocation.setEnabled(false);
		timagelocation.setEditable(false);
		timagelocation.setColumns(10);
		timagelocation.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		timagelocation.setBounds(276, 202, 135, 30);
		panel.add(timagelocation);

		JButton btnBrowse = new JButton("Browse");

		btnBrowse.setBounds(421, 202, 60, 30);
		panel.add(btnBrowse);

		JButton btnAddBook = new JButton("Add Book");

		btnAddBook.setBounds(180, 259, 187, 30);
		panel.add(btnAddBook);

		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jFileChooser = new JFileChooser();
				/*
				 * jFileChooser.setFileFilter(new FileFilter() {
				 * 
				 * @Override public String getDescription() { // TODO Auto-generated method stub
				 * return "Image File"; }
				 * 
				 * @Override public boolean accept(File f) { if
				 * (f.getAbsoluteFile().getName().contains(".jpg") ||
				 * f.getAbsoluteFile().getName().contains(".jpeg") ||
				 * f.getAbsoluteFile().getName().contains(".png")) { return true; } else {
				 * return false; } } });
				 */

				jFileChooser.setFileFilter(new FileNameExtensionFilter("Image File Only", "jpg", "png", "jpeg"));
				jFileChooser.showOpenDialog(AddBook.this);
				File file = jFileChooser.getSelectedFile();

				lblNewLabel.setIcon(Util.resize(new ImageIcon(file.getAbsolutePath()), 140, 105));
				timagelocation.setText(file.getAbsolutePath());

			}
		});

		btnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String location = System.getProperty("user.dir");
					System.out.println(location);
					FileInputStream fi = new FileInputStream(timagelocation.getText());
					FileOutputStream fo = new FileOutputStream(location + File.separator + "abc.jpg");
					int i = 0;
					while ((i = fi.read()) != -1) {
						fo.write(i);
					}
				} catch (Exception e1) {
					System.out.println(e1);

				}
			}
		});

	}
}
