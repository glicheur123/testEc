package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class listPanel extends JPanel{
	
	public static JList<String> list;
	public static DefaultListModel<String> listMod = new DefaultListModel<String>();
	private JTextField txt = new JTextField();
	private JButton edit = new JButton("Changer");
	private JButton doIt = new JButton("Fait");
	private JButton newItem = new JButton("Ajouter");
	
	public listPanel()
	{
		
		list = new JList<>(listMod);
		this.setBackground(Color.gray);
		
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);
		list.setVisibleRowCount(-1);
		JScrollPane listScroll = new JScrollPane(list);
		listScroll.setPreferredSize(new Dimension(750, 450));
		//button
		edit.setEnabled(false);
		doIt.setEnabled(false);
		this.add(listScroll);
		this.add(edit);
		this.add(doIt);
		this.add(newItem);
		
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				edit.setEnabled(true);
				doIt.setEnabled(true);
			}
		});
		
		newItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txt.setText("");
				int msg = JOptionPane.showConfirmDialog(null, txt, "Ajouter Tâche", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				if(msg == JOptionPane.OK_OPTION)
				{
					listMod.addElement(txt.getText());
				}
			}
		});
		
		doIt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				listMod.removeElementAt(list.getSelectedIndex());
				doIt.setEnabled(false);
				edit.setEnabled(false);
				new SAve();
			}
		});
		
		edit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txt.setText(list.getSelectedValue());
				int msg = JOptionPane.showConfirmDialog(null, txt, "Changer Tâche", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
				if(msg == JOptionPane.OK_OPTION)
				{
					listMod.setElementAt(txt.getText(), list.getSelectedIndex());
				}
			}
		});
	}
	
	

}
