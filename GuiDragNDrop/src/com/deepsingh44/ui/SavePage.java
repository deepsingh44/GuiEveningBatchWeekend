package com.deepsingh44.ui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class SavePage extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SavePage frame = new SavePage();
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
	public SavePage() {
		setTitle("List Of Books");
		setIconifiable(true);
		setClosable(true);
		setBounds(85, 10, 535, 352);

	}

}
