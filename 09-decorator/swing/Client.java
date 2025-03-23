package swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Client {

	public static void main(String[] args) {
		JFrame frame =new JFrame();  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setSize(400,250);  
		

		
		JTextArea textArea = new JTextArea(10, 30);
		//JScrollPane scroll = new JScrollPane(textArea, 
		//		ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
		//		ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

		frame.add(textArea);
		//frame.add(scroll);
		          
		frame.setVisible(true);
	}
}
