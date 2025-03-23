package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Client {

	public static void main(String[] args) {
		JLabel title = new JLabel("Título do meu App");
		JLabel label = new JLabel("Texto qualquer");
		JButton button= new JButton("Botão OK");
				
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(label);  
		panel.add(button);  
		
		JFrame frame =new JFrame();  
		frame.setLayout(new BorderLayout());		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);  		          
		
		frame.add(title, BorderLayout.NORTH);
		frame.add(panel, BorderLayout.CENTER);
		
		frame.setVisible(true);
	}
}