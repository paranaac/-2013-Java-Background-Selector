/* Alejandro Parana
   Date 4/2/2013
   Purpose: do  exercise  1  of  Chapter  59  of  the  CCSU  Online  Course.
   Modify the TwoButtons program so that it has four buttons: one for red,
   one for green, one for blue, and one for gray. To improve the appearance of
   the GUI, change the color of the buttons to reflect their function.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BackgroundSelect extends JFrame implements ActionListener
{
	JButton redButton;
	JButton greenButton;
	JButton blueButton;
	JButton grayButton;

	public BackgroundSelect(String title)
	{
		super(title);
		redButton = new JButton("RED");
		greenButton = new JButton("GREEN");
		blueButton = new JButton("BLUE");
		grayButton = new JButton("GRAY");

		redButton.setActionCommand( "red" );
		redButton.setBackground(Color.red);
		greenButton.setActionCommand( "green" );
		greenButton.setBackground(Color.green);
		blueButton.setActionCommand( "blue" );
		blueButton.setBackground(Color.blue);
		grayButton.setActionCommand( "gray" );
		grayButton.setBackground(Color.gray);

		setLayout(new FlowLayout());
		add(redButton); add(greenButton);
		add(blueButton); add(grayButton);

		redButton.addActionListener(this);
     	greenButton.addActionListener(this);
     	blueButton.addActionListener(this);
     	grayButton.addActionListener(this);

     	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent evt)
	{
		if (evt.getActionCommand().equals("red"))
			getContentPane().setBackground(Color.red);
		else if (evt.getActionCommand().equals("green"))
			getContentPane().setBackground(Color.green);
		else if (evt.getActionCommand().equals("blue"))
			getContentPane().setBackground(Color.blue);
		else if (evt.getActionCommand().equals("gray"))
			getContentPane().setBackground(Color.gray);
		repaint();
	}
	public static void main(String[]args)
	{
		BackgroundSelect window = new BackgroundSelect("Background Selector");
		window.setSize(100, 120);
		window.setVisible(true);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setBackground(Color.black);
	}
}


