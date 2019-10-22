package test;

import javax.swing.JFrame;

public class NewList {

	public NewList()
	{
		Main.frame.setTitle("Nouveau Fichier - ToDo");
		Main.frame.getContentPane().removeAll();
		Main.frame.add(new listPanel());
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Main.frame.repaint();
		Main.frame.setSize(50, 70);
		Main.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
	}
}
