import java.awt.*;  
import java.awt.event.*;

public class AWTExample1 extends Frame{
	 // initializing using constructor  
	   AWTExample1() {  
		   	Frame frame = new Frame("AWT Button Example");
	        // creating a button   
	        Button b = new Button("Click Me!!");  
	        Button x = new Button("X");
	        // setting button position on screen  
	        b.setBounds(100,100,80,30); 
	        x.setBounds(300,30,80,30);
	        
	        frame.setLayout(new FlowLayout());
	        // adding button into frame    
	        frame.add(b);  
	        frame.add(x);
	  
	      // frame size 300 width and 300 height    
	        frame.setSize(400,300);  
	  
	      // setting the title of Frame  
	        frame.setTitle("This is our basic AWT example");   
	          
	      // no layout manager   
	        frame.setLayout(null);   
	  
	      // now frame will be visible, by default it is not visible    
	        frame.setVisible(true);  
	      
	      // Action listener for button1
	        b.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	System.out.println("Button Clicked!");
	         }
	        });

	      // Action listener for button2 to exit the program
	        x.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	System.out.println("Exiting...");
	        	System.exit(0); // Close the frame
	         }
	        }); 

	        // Add window listener to close the window when user clicks the close button
	        frame.addWindowListener(new WindowAdapter() {
	        	public void windowClosing(WindowEvent we) {
	        	System.exit(0);
	         }
	        });
	   }    
	  
	// main method  
	public static void main(String args[]) {   
	  
	// creating instance of Frame class   
	AWTExample1 frame = new AWTExample1();    
	}  

}
