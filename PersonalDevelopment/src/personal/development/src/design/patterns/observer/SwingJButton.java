package personal.development.src.design.patterns.observer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingJButton {

	JFrame frame ;
	
	public static void main(String[] args) {
		System.out.println("Hi");
		SwingJButton obj = new SwingJButton();
		
		obj.go();
	}
	private void go() {
		frame = new JFrame();
		
		JButton button = new JButton("Should I go??");
		button.addActionListener(new AngelActionListener());
		button.addActionListener(new DevilActionListener());
		frame.add(button);
//		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setVisible(true);
	}
}

class AngelActionListener implements ActionListener  
{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Yes You should try!");
	}
}

class DevilActionListener implements ActionListener  
{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("NO You can not do it!");
	}
	
}