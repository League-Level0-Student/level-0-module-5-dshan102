package _99_extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();

		//2. Set the speed to 100
		rob.setSpeed(100);
		rob.penDown();

		int colorChoice=JOptionPane.showOptionDialog(null, "What color would you like to use?", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Blue","Green", "Red"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if (colorChoice==0) {
			rob.setPenColor(0,0,255);
		}
		else if (colorChoice==1) {
			rob.setPenColor(0,255,0);
		}
		else if (colorChoice==2) {
			rob.setPenColor(255,0,0);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String polygons1 = JOptionPane.showInputDialog("How many polygons would you like to draw?");
		int polygons = Integer.parseInt(polygons1);
		
		//5. Use the robot to draw the number of polygons the user requested.
		for(int i=0; i<polygons; i++) {
			for(int j=0; j<4; j++) {
				rob.move(100);
				rob.turn(90);
			}
			rob.penUp();
			rob.move(120);
			rob.penDown();
		}
		
		
		//6. Make it so your shapes do not overlap


		//7. Challenge: add more colors to the Option Dialog.
	}
}

