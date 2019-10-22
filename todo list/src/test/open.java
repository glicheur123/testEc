package test;

import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class open {

	public open()
	{
		JFileChooser fc = new JFileChooser();
		fc.setFileFilter(new FileNameExtensionFilter("*.TD", "TD"));
		int msg = fc.showOpenDialog(null);
		if(msg == fc.APPROVE_OPTION)
		{
			new NewList();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try
			{
				Scanner s = new Scanner(fc.getSelectedFile());
				listPanel.listMod.removeAllElements();
				while(s.hasNextLine())
				{
					
					listPanel.listMod.addElement(s.nextLine());
				}
				s.close();
				Main.frame.setTitle(fc.getSelectedFile()+ " - ToDo");
				Main.dir = fc.getSelectedFile().toString();
			}catch (Exception e) {
				// TODO: handle exception
				}
			}
		
	}
}
