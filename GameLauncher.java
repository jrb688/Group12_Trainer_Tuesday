package trainer_tuesday;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameLauncher {
	 static JFrame frame = new JFrame("Trainer Tuesday");
	 static JPanel mainMenu = new JPanel();
		static JButton start = new JButton("Start");
		static JButton addUser = new JButton("Add User");
		static JButton buildWorkout = new JButton("Build workout");
		static JButton quit = new JButton("Quit");

 private static void init(){
	 frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	frame.setUndecorated(true);
	 frame.add(mainMenu);
	 mainMenu.add(start);
	mainMenu.add(addUser);
	mainMenu.add(buildWorkout);
	mainMenu.add(quit);
	start.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.out.println("start is not yet implemented");
		}
	});
	addUser.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.out.println("add user is not yet implemented");
		}
	});
	quit.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	});
	buildWorkout.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			mainMenu.add(new BuildWorkout());
			buildWorkout.setVisible(false);
		}
	});

	frame.setVisible(true); 
 }//end init
public static void main(String[] args){

	init();
	
	
	
}
}
