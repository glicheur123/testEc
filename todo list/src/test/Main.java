package test;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Main {
	public static JFrame frame;
	public static String dir = "";
	public Main()
	{
		frame = new JFrame();
		frame.setTitle("Acceuil - Todo");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(new menu());
		//add component
		frame.add(new mainPanel());
		//View Frame
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args)
	{
		//Add style UI
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch (Exception e) {
			// TODO: handle exception
		}
		//Run main GUI
		new Main();
	}

}
