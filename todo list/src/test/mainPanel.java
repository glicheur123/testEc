package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class mainPanel extends JPanel
{
	private JPanel pan = this;
	public mainPanel()
	{
		//layout
		pan.setLayout(new BorderLayout());
		//Declaration
		JLabel Title = new JLabel("ToDO");
		JLabel SubTitle = new JLabel("Le logiciel capable de vous dire votre list des tâches");
		JLabel author = new JLabel("Copyright (C) : Marc-Antoine Gauthier");
		
		
		//Custom component
		//Panel
		pan.setBackground(Color.gray.darker());
		//Title
			Title.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 32));
			Title.setForeground(Color.WHITE);
		//SubTitle
			SubTitle.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 24));
			SubTitle.setForeground(Color.WHITE);
		//Author
			author.setForeground(Color.WHITE);
		//Add component
		pan.add(Title, BorderLayout.NORTH);
		pan.add(SubTitle, BorderLayout.CENTER);
		pan.add(author, BorderLayout.PAGE_END);
	}

}
