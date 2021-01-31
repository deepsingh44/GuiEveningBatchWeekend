package com.deepsingh44.ui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookList extends JInternalFrame {
	private JTable table;
	private JTextField ttitle;
	private JTextField tauthor;
	private JTextField tprice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookList frame = new BookList();
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
	public BookList() {
		setTitle("List Of Books");
		setIconifiable(true);
		setClosable(true);
		setBounds(85, 10, 535, 352);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 102));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		String[] cols = { "ID","TITLE", "PRICE", "AUTHOR" };
		DefaultTableModel dt = new DefaultTableModel(cols, 0);

		table = new JTable(dt);
		JScrollPane jp = new JScrollPane(table);

		jp.setBounds(261, 22, 237, 289);
		panel.add(jp);

		JLabel label = new JLabel("Book Title");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Serif", Font.PLAIN, 10));
		label.setBounds(27, 34, 91, 14);
		panel.add(label);

		ttitle = new JTextField();
		ttitle.setColumns(10);
		ttitle.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		ttitle.setBounds(27, 51, 205, 30);
		panel.add(ttitle);

		JLabel label_1 = new JLabel("Book Author");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Serif", Font.PLAIN, 10));
		label_1.setBounds(27, 161, 91, 14);
		panel.add(label_1);

		tauthor = new JTextField();
		tauthor.setColumns(10);
		tauthor.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tauthor.setBounds(27, 178, 205, 30);
		panel.add(tauthor);

		JLabel label_2 = new JLabel("Book Price");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Serif", Font.PLAIN, 10));
		label_2.setBounds(27, 92, 205, 14);
		panel.add(label_2);

		tprice = new JTextField();
		tprice.setColumns(10);
		tprice.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tprice.setBounds(27, 109, 205, 30);
		panel.add(tprice);

		JButton button = new JButton("Add Book");

		button.setBounds(33, 237, 187, 30);
		panel.add(button);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = ttitle.getText();
				String price = tprice.getText();
				String author = tauthor.getText();

				DefaultTableModel dd = (DefaultTableModel) table.getModel();
				dd.addRow(new Object[] {count++, title, price, author });

			}
		});

	}
	int count=1;
}
