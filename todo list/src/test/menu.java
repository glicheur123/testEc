package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menu extends JMenuBar{
	
	private JMenuBar bar = this;
	//menu
	private JMenu file = new JMenu("Fichier");
	
	//MenuItem
	private JMenuItem newToDo = new JMenuItem("Nouveau");
	private JMenuItem open = new JMenuItem("Ouvrir");
	private JMenuItem save = new JMenuItem("Enregistrer");
	
	
	public menu()
	{
		//add file to bar
		bar.add(file);
		//add item to file
		file.add(newToDo);
		file.add(open);
		file.add(save);
		//add action to item
		action();
		
	}


	private void action() {
		newToDo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//open new file
				new NewList();
			}
		});
		
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// open file
				new open();
			}
		});
		
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// save file
				new SAve();
			}
		});
		
	}

}