package com.deepsingh44.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class ComponentsDemo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsDemo frame = new ComponentsDemo();
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
	public ComponentsDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Select Name", "A", "B", "C", "D", "E", "F" }));
		comboBox.setBounds(102, 25, 166, 22);
		contentPane.add(comboBox);

		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println(rdbtnMale.getText());
				}
			}
		});
		rdbtnMale.setBounds(100, 75, 70, 23);
		contentPane.add(rdbtnMale);

		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					System.out.println(rdbtnFemale.getText());
				}
			}
		});
		rdbtnFemale.setBounds(181, 75, 70, 23);
		contentPane.add(rdbtnFemale);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
			if(e.getValueIsAdjusting()) {
				//System.out.println(list.getSelectedValue());
				System.out.println(list.getSelectedValues().length);
			}
			}
		});
		/*String names[]= new String[10];
		int index=0;
		try {
			FileInputStream fi=new FileInputStream("C:\\Users\\deepsingh44\\Desktop\\abc.txt");
			BufferedReader br=new BufferedReader(new InputStreamReader(fi));
			String line=br.readLine();
			while(line!=null) {
				names[index++]=line;
				line=br.readLine();
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		*/
		
		
		//String names[]= {"1","2","3","4"};
		
		JScrollPane jp=new JScrollPane(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"A", "B", "C", "D", "E", "F", "G"};
			
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		jp.setBounds(113, 126, 155, 120);
		contentPane.add(jp);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("I accept all terms and condition.");
		
		chckbxNewCheckBox.setBounds(108, 270, 178, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnClickMe = new JButton("Click Me");
		btnClickMe.setEnabled(false);
		btnClickMe.setBounds(113, 315, 89, 23);
		contentPane.add(btnClickMe);

		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					String name = comboBox.getSelectedItem().toString();
					System.out.println(name);
				}
			}
		});
		
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			
				if(chckbxNewCheckBox.isSelected()) {
					btnClickMe.setEnabled(true);
				}else {
					btnClickMe.setEnabled(false);
				}
			
			}
		});
	}
}
