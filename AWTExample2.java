import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;    

public class AWTExample2 extends Frame{
	// initializing using constructor  
	   AWTExample2() {  
	  
	      // creating a Frame  
	      Frame f = new Frame();  
	  
	      // creating a Label  
	      Label l = new Label("Employee id:");   
	  
	      // creating a Button  
	      Button b = new Button("Submit");  
	      Button c = new Button("X");
	      
	      // creating a TextField  
	      TextField t = new TextField();  
	  
	      // setting position of above components in the frame  
	      l.setBounds(20, 80, 80, 30);  
	      t.setBounds(20, 100, 80, 30);  
	      b.setBounds(100, 100, 80, 30); 
	      c.setBounds(300, 30, 80, 30);
	  
	      // adding components into frame    
	      f.add(b);  
	      f.add(l);  
	      f.add(t);  
	      f.add(c);
	  
	      // frame size 300 width and 300 height    
	      f.setSize(400,300);  
	  
	      // setting the title of frame  
	      f.setTitle("Employee Info");   
	          
	      // no layout  
	      f.setLayout(null);   
	  
	      // setting visibility of frame  
	      f.setVisible(true);  
	      
	      //actions to click frame
	      b.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	System.out.println("Employee ID Submitted!");
	         }
	        });

	      // Action listener for button2 to exit the program
	      c.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	System.out.println("Exiting...");
	        	System.exit(0); // Close the frame
	         }
	      });

	        // Add window listener to close the window when user clicks the close button
	      f.addWindowListener(new WindowAdapter() {
	    	  	public void windowClosing(WindowEvent we) {
	        	System.exit(0);
	    	  }
	      });
	    	
	}    
	  
	// main method  
	public static void main(String args[]) {   
	  
	// creating instance of Frame class   
	AWTExample2 awt_obj = new AWTExample2();    
	  
	}  
	
}