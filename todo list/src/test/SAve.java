package test;


import java.io.File;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class SAve {
	public SAve()
	{
		listPanel lp = new listPanel();
		JFileChooser fileC = new JFileChooser();

		fileC.setFileFilter(new FileNameExtensionFilter("*.TD", "TD"));
		//File verif = new File(Main.dir);
		if(!Main.dir.isEmpty())
		{
			System.out.println("VerifOK");
			try {
				FileWriter file = new FileWriter(Main.dir);
				int size = lp.listMod.getSize();
				for( int i= 0; i < size; i++)
				{
				file.write(lp.listMod.getElementAt(i) + "\n\n");
				}
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else
		{
		
		int dia = fileC.showSaveDialog(null);
		
		if(dia == JFileChooser.APPROVE_OPTION)
		{
			String fileWithDot =fileC.getSelectedFile()+".TD";
			try {
				FileWriter file = new FileWriter(fileWithDot);
				int size = lp.listMod.getSize();
				for( int i= 0; i < size; i++)
				{
				file.write(lp.listMod.getElementAt(i) + "\n\n");
				}
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Main.frame.setTitle(fileWithDot+" - ToDo");
			Main.dir = fileWithDot;
		}
		
	}
	}
}
